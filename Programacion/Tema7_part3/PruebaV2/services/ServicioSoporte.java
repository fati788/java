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
        return this.tecnicos.stream()
                .sorted(Comparator.comparing(Tecnico::getValoracion))
                .collect(Collectors.groupingBy(Tecnico::getEspeciadad));

    }
    public TicketSoporte findTicketSoporteById(int id){
        return this.ticketSoportes.stream()
                .filter( t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<TicketSoporte> getTicketsAbiertos(){
        return this.ticketSoportes
                .stream().filter(t -> t.getFechaCreacion().isAfter(LocalDate.now()))
                .filter( t -> t.getFechaFinalizacion().isBefore(LocalDate.now()))
                .sorted()
                .collect(Collectors.toList())
                .reversed();

    }

    public List<TicketSoporte> getTicketsCerrados(){
        return this.ticketSoportes.stream()
                .filter( t -> t.getFechaFinalizacion().isAfter(LocalDate.now()))
                .sorted(Comparator.comparing(TicketSoporte::getFechaFinalizacion))
                .toList();
    }

    public List<TicketSoporte> getTicketsEnProcesoTechnicoInformatico(){
        return this.ticketSoportes.stream()
                .filter( t -> t.getEstado().equals(Estado.ENPROCESO))
                .filter( t -> t.getAsignado().getEspeciadad().equals(Especiadad.INFORMATICA))
                .toList();
    }

    public long getTotalTicketsResueltos(int perioridad){
        return this.ticketSoportes.stream()
                .filter(t -> t.getPrioridad() == perioridad)
                .filter( t -> t.getEstado().equals(Estado.RESUELTO))
                .count();
    }

    public Set<TicketSoporte> findTicketsByEstadoAndPrioridad(Estado estado , Integer prioridad){
        return this.ticketSoportes.stream()
                .filter( t -> t.getEstado().equals(estado))
                .filter(t -> t.getPrioridad().equals(prioridad))
                .collect(Collectors.toSet());

    }

    public Map<Especiadad , List<Tecnico>> findTecnicosInTickets(){
        return this.ticketSoportes.stream()
                .map(TicketSoporte::getAsignado)
                .collect(Collectors.groupingBy(Tecnico::getEspeciadad));
    }

    public Set<Tecnico> findTecnicosRapidos(){
        return this.ticketSoportes.stream()
                .filter( t -> ChronoUnit.DAYS.between(t.getFechaCreacion() , t.getFechaFinalizacion()) <5)
                .map(TicketSoporte::getAsignado)
                .collect(Collectors.toSet());
    }

    public long getTotlaTicketsRetardados(){
        return this.ticketSoportes.stream()
                .filter( t -> t.getFechaFinalizacion().isBefore(LocalDate.now()))
                .filter( t -> ChronoUnit.DAYS.between(t.getFechaCreacion() , t.getFechaFinalizacion()) >7)
                .count();
    }
    public Double getMediaResolucionTickets(int perioridad){
      return this.ticketSoportes.stream()
                .filter( t -> t.getPrioridad() == perioridad)
                .mapToLong( t -> ChronoUnit.DAYS.between(t.getFechaCreacion() , t.getFechaFinalizacion()))
                .average()
                .orElse(0.0);
    }

    public Map<Tecnico , Double> getMediaResolucionTicketsGroupByTechnico(){
        return this.ticketSoportes.stream()
                .filter( t -> t.getEstado().equals(Estado.RESUELTO))
                .collect(Collectors.groupingBy(TicketSoporte::getAsignado ,
                        Collectors.averagingDouble( t -> ChronoUnit.DAYS.between(t.getFechaCreacion() , t.getFechaFinalizacion()))));

    }
    public Boolean areAllTicketsFinishedLessThanDays(){
        return this.ticketSoportes.stream()
                .filter( t -> t.getEstado().equals(Estado.RESUELTO))
                .allMatch(  t -> ChronoUnit.DAYS.between(t.getFechaCreacion(), t.getFechaFinalizacion()) <10);


    }

    public Optional<TicketSoporte> getFirstTicketSolveOneDay(){
        return this.ticketSoportes.stream()
                .filter(t -> t.getFechaCreacion().getDayOfWeek().equals(t.getFechaFinalizacion().getDayOfWeek()))
                .findAny();
    }


}
