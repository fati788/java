package Programacion.Tema7_part3.PruebaV2.services;

import Programacion.Tema7_part3.PruebaV2.models.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class ServicioSoporte {
    private List<TicketSoporte> ticketSoportes;
    private Set<Usuario> usuarios;
    private  Set<Tecnico> tecnicos;

    public ServicioSoporte() {
        this.ticketSoportes = new ArrayList<>();
        this.usuarios = new HashSet<>();
        this.tecnicos = new HashSet<>();

    }

    public List<TicketSoporte> getTicketSoportes() {
        return ticketSoportes;
    }

    public void setTicketSoportes(List<TicketSoporte> ticketSoportes) {
        this.ticketSoportes = ticketSoportes;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Set<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(Set<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public void addUsuario(Usuario u){
        this.usuarios.add(u);
    }
    public void deleteUsuario(int id){
        this.usuarios.removeIf(u -> u.getId() == id);
    }
    public void addTechnico(Tecnico t){
        this.tecnicos.add(t);
    }
    public void deleteTechnico(int id){
        this.tecnicos.removeIf(u -> u.getId() == id);
    }
    public void addTicketSoporte(LocalDate fechaCreacion , LocalDate fechaFinalizacion , int perioridad , String comentarios , Usuario u , Tecnico t ){

        int maxId = this.ticketSoportes
                .stream().mapToInt(TicketSoporte::getId)
                .max()
                .orElse(0);

        int id = maxId + 1;

        this.ticketSoportes.add(new TicketSoporte(id , fechaCreacion , fechaFinalizacion , Estado.ABIERTO , perioridad , u ,t ,comentarios));


    }
    public void deleteTicketSoporte(int id){
      this.ticketSoportes.removeIf(t -> t.getId() == id);
    }

    public Tecnico buscarTechnico(int id){
        return  this.tecnicos.stream()
                .filter( t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Usuario buscarUsuario(int id){
        return  this.usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Tecnico> getTechnicoByEspecialidad(Especiadad esp ){
        return this.tecnicos.stream()
                .filter(t -> t.getEspeciadad() == esp)
                .collect(Collectors.toList());
    }
    public Map<Especiadad , List<Tecnico>> getTecnicosGroupByEspecialidad(){
        //Agrupa por especialidad
        Map<Especiadad , List<Tecnico>> tecs = this.tecnicos.stream()
                .collect(Collectors.groupingBy(Tecnico::getEspeciadad));
        //Ordedenar la lista
        tecs.forEach((k,v)->{

            v.sort(Comparator.comparing(Tecnico::getValoracion));

        });
        return tecs;

    }
    public TicketSoporte findTicketSoporteById(int id){
        return this.ticketSoportes.stream()
                .filter( t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }


    public List<TicketSoporte> getTicketsAbiertos(){
        return this.ticketSoportes
                .stream()
                .filter( t -> t.getEstado() == Estado.ABIERTO)
                .sorted(Comparator.comparing(TicketSoporte::getEstado).reversed())
                .toList();

    }


    public List<TicketSoporte> getTicketsCerrados(){
        return this.ticketSoportes.stream()
                .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .sorted(Comparator.comparing(TicketSoporte::getFechaFinalizacion).reversed())
                .toList();
    }


    public List<TicketSoporte> getTicketsEnProcesoTechnicoInformatico(){
        return this.ticketSoportes.stream()
                .filter( t -> t.getEstado().equals(Estado.ENPROCESO))
                .filter( t -> t.getAsignado().getEspeciadad().equals(Especiadad.INFORMATICA))
                .toList();
    }

    public Long getTotalTicketsResueltos(int perioridad){
        return this.ticketSoportes.stream()
                .filter(t -> t.getPrioridad() == perioridad)
                .filter( t -> t.getEstado().equals(Estado.RESUELTO))
                .count();
    }

    public Set<TicketSoporte> findTicketsByEstadoAndPrioridad(Estado estado , Integer prioridad){
        return this.ticketSoportes.stream()
                .filter( t -> t.getEstado().equals(estado))
                .filter(t -> t.getPrioridad().equals(prioridad))
                .collect(Collectors.toCollection(TreeSet::new));

    }

    public Map<Especiadad , List<Tecnico>> findTecnicosInTickets(){
        return this.ticketSoportes.stream()
                .map(TicketSoporte::getAsignado)
                .collect(Collectors.groupingBy(Tecnico::getEspeciadad));
    }

    public Set<Tecnico> findTecnicosRapidos(){
        return this.ticketSoportes.stream()
                .filter( t -> ChronoUnit.DAYS.between(t.getFechaFinalizacion() , t.getFechaCreacion()) <=5)
                .map(TicketSoporte::getAsignado)
                .collect(Collectors.toSet());
    }

    public Long getTotlaTicketsRetardados(){
        return this.ticketSoportes.stream()
                .filter( t -> t.getEstado().equals(Estado.RESUELTO))
                .filter( t -> ChronoUnit.DAYS.between(t.getFechaFinalizacion() , t.getFechaCreacion()) >7)
                .count();
    }
    public Double getMediaResolucionTickets(int perioridad){
      return this.ticketSoportes.stream()
                .filter( t -> t.getPrioridad().equals(perioridad))
              .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .mapToLong( t -> ChronoUnit.DAYS.between(t.getFechaFinalizacion() , t.getFechaCreacion()))
                .average()
                .orElse(0.0);
    }

    public Map<Tecnico , Double> getMediaResolucionTicketsGroupByTechnico(){
        return this.ticketSoportes.stream()
                .filter( t -> t.getEstado().equals(Estado.RESUELTO))
                .collect(Collectors.groupingBy(TicketSoporte::getAsignado ,
                        Collectors.averagingLong( t -> ChronoUnit.DAYS.between(t.getFechaFinalizacion() , t.getFechaCreacion()))));

    }
    public Boolean areAllTicketsFinishedLessThanDays(){
        return this.ticketSoportes.stream()
                .filter( t -> t.getEstado().equals(Estado.RESUELTO))
                .allMatch(  t -> ChronoUnit.DAYS.between(t.getFechaFinalizacion(), t.getFechaCreacion()) <10);


    }

    public Optional<TicketSoporte> getFirstTicketSolveOneDay(){
        return this.ticketSoportes.stream()
                .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .filter(t ->ChronoUnit.DAYS.between(t.getFechaFinalizacion(), t.getFechaCreacion()) ==1)
                .findFirst();
    }


}
