package Programacion.Tema7_part3.PruebaV2.services;

import Programacion.Tema7_part3.PruebaV2.models.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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


}
