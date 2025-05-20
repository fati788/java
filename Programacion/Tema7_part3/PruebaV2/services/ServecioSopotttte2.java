package Programacion.Tema7_part3.PruebaV2.services;

import Programacion.Tema7_part3.PruebaV2.models.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class ServecioSopotttte2 {

    private List<TicketSoporte> ticketSoportes;
    private Set<Usuario> usuarios;
    private Set<Tecnico> tecnicos;

    public ServecioSopotttte2() {
        this.ticketSoportes = new ArrayList<>();
        this.usuarios = new HashSet<>();
        this.tecnicos = new HashSet<>();

    }

    public List<TicketSoporte> getTicketSoportes() {
        return ticketSoportes;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public Set<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTicketSoportes(List<TicketSoporte> ticketSoportes) {
        this.ticketSoportes = ticketSoportes;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void setTecnicos(Set<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public void addUsuario(Usuario u ){
        this.usuarios.add(u);
    }
    public void deleteUsuario(int id){
        this.usuarios.removeIf( u -> u.getId().equals(id));
    }
    public void addTecnico(Tecnico t){
        this.tecnicos.add(t);
    }
    public void deleteTecnico(int id){
        this.tecnicos.removeIf(t -> t.getId().equals(id));
    }
    public void deleteTick(int id){
        this.ticketSoportes.removeIf(  y -> y.getId().equals(id));
    }
    public void addTicketSoporte(LocalDate fechaCreacion , LocalDate fechaFinalizacion , int perioidad , String comm , Usuario u , Tecnico t){
        int id ;
       id = this.ticketSoportes.stream()
                .mapToInt(TicketSoporte::getId)
                .max()
               .orElse(0);
       this.ticketSoportes.add(new TicketSoporte((id+1),fechaCreacion,fechaFinalizacion, Estado.ABIERTO,perioidad,u,t,comm));
    }

    public Tecnico findTecnicoById(int id){
        return this.tecnicos.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Usuario finUsuarioById(int id){
        return this.usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Tecnico> getTecnicosByEspecialidad(Especiadad esp){
        return this.tecnicos.stream()
                .filter( t -> t.getEspeciadad().equals(esp))
                .toList();


    }

    public Map<Especiadad , List<Tecnico>> getTecnicosGroupByEspecialidad(){
        Map<Especiadad , List<Tecnico>> especiadadListMap= tecnicos.stream()
                .collect(Collectors.groupingBy(Tecnico::getEspeciadad));
        especiadadListMap.forEach((k , v) ->{
            //ordenar la lissta con sort sin necesidad   de streams

            v.sort(Comparator.comparing(Tecnico::getValoracion));
        });
        return especiadadListMap;
    }

    public TicketSoporte findTiketById(int id){
        return this.ticketSoportes.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<TicketSoporte> getTicketsAbbiertos(){
        return ticketSoportes.stream()
                .filter(t -> t.getEstado().equals(Estado.ABIERTO))
                .sorted(Comparator.comparing(TicketSoporte::getFechaCreacion).reversed())
                .toList();
    }

    public List<TicketSoporte> getTicketsCerrados(){
        return ticketSoportes.stream()
                .filter( t -> t.getEstado().equals(Estado.RESUELTO))
                .sorted(Comparator.comparing(TicketSoporte::getFechaFinalizacion).reversed())
                .toList();

    }

    public List<TicketSoporte> getTicketsEnProcesoTecnicoInformatica(){
        return ticketSoportes.stream()
                .filter(t -> t.getEstado().equals(Estado.ENPROCESO))
                .filter(t -> t.getAsignado().getEspeciadad().equals(Especiadad.INFORMATICA))
                .toList();
    }

    public Long getTotalTicketsResueltos(Integer perioridad){
        return ticketSoportes.stream()
                .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .filter(t -> t.getPrioridad().equals(perioridad))
                .count();

    }

    public Set<TicketSoporte> findTicketByEstadoAndPerioridad(Estado estado , Integer perioridad){
              return ticketSoportes.stream()
                .filter(t -> t.getEstado().equals(estado))
                .filter(t -> t.getPrioridad().equals(perioridad))
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public Map<Especiadad , List<Tecnico>> findTecnicoEnTikets(){

        return ticketSoportes.stream()
                .map(TicketSoporte::getAsignado)
                .collect(Collectors.groupingBy(Tecnico::getEspeciadad));

    }

    public Set<Tecnico> findTecnicosRapidos(){
        return ticketSoportes.stream()
                .filter( t -> ChronoUnit.DAYS.between(t.getFechaFinalizacion() , t.getFechaCreacion()) <= 5)
                .map(TicketSoporte::getAsignado)
                .collect(Collectors.toSet());
    }

    public Long getTotalTicketsRestardados(){
        return ticketSoportes.stream()
                .filter(t -> ChronoUnit.DAYS.between(t.getFechaFinalizacion() , t.getFechaCreacion()) >7)
                .count();
    }

    public Double getMediaResoulicionTickets(Integer perioridad){
        return ticketSoportes.stream()
                .filter(t -> t.getPrioridad().equals(perioridad))
                .mapToDouble(t -> ChronoUnit.DAYS.between(t.getFechaFinalizacion() , t.getFechaCreacion()))
                .average()
                .orElse(0.0);
    }

    public Map<Tecnico , Double> getMediaResoulicionTicketsGroupByTecnico(){
        return this.ticketSoportes.stream()
                .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .collect(Collectors.groupingBy(TicketSoporte::getAsignado ,
                        Collectors.averagingLong(t -> ChronoUnit.DAYS.between(t.getFechaFinalizacion() , t.getFechaCreacion()))));
    }

    public Boolean areAllTicketsFinishedLessThanThenDay(){
        return this.ticketSoportes.stream()
                .filter( t -> t.getEstado().equals(Estado.RESUELTO))
                .allMatch(t -> ChronoUnit.DAYS.between(t.getFechaFinalizacion(), t.getFechaCreacion()) <10);


    }

    public Optional<TicketSoporte> getFirstTicketSolvenOneDay(){
        return ticketSoportes.stream()
                .filter(t -> ChronoUnit.DAYS.between(t.getFechaFinalizacion(), t.getFechaCreacion()) ==1)
                .findFirst();
    }






}
