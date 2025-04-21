package Programacion.Tema7_Part1.Ejercicios.Ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class CitasConsulta {
    private ArrayList<Cita>citas;

    public CitasConsulta() {
        this.citas = new ArrayList<>();
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }
    public void addCita(Cita cita) {
        this.citas.add(cita);
    }

    public void removeCita(Cita cita) {
        this.citas.remove(cita);
    }

    public void listraCitasPorNombre(){

        citas.sort(new Comparator<Cita>() {

            @Override
            public int compare(Cita o1, Cita o2) {
               return o1.getPaciente().getNombre().compareTo(o2.getPaciente().getNombre());

            }
        });
      for (Cita cita : citas) {
          System.out.println(cita);
      }
    }
    public void listraCitasPorApellido(){
        this.citas.sort(new Comparator<Cita>() {

            @Override
            public int compare(Cita o1, Cita o2) {
                return o1.getPaciente().getApellido().compareTo(o2.getPaciente().getApellido());
            }
        });
        for (Cita cita : citas) {
            System.out.println(cita);
        }
    }
    public void listarPorFechaYApellido(){
        this.citas.sort(new Comparator<Cita>() {

            @Override
            public int compare(Cita o1, Cita o2) {
               if (o1.getFecha().isEqual(o2.getFecha())) {
                   return o1.getPaciente().getApellido().compareTo(o2.getPaciente().getApellido());
               }else {
                   return o1.getFecha().compareTo(o2.getFecha());
               }
            }
        });
        for (Cita cita : citas) {
            System.out.println(cita);
        }
    }
   /* public void listarPorHora(LocalDate fecha){
        for (Cita cita : citas) {
            if (cita.getFecha().isEqual(fecha)) {
                System.out.println(cita.getHora());
            }
        }

    }*/

    public Cita buscarCitasFuturas(String email){
        for (Cita cita : citas) {
            if (cita.getPaciente().getEmail().equals(email)) {
                cita.getFecha().isAfter(LocalDate.now());
                return cita;
            }
        }
        return null;
    }
    public void listarCitasPorFHora(LocalDate fecha){
        ArrayList<Cita>citasPorFecha = new ArrayList<>();
        for (Cita cita : citas) {
            if (cita.getFecha().isEqual(fecha)) {
                citasPorFecha.add(cita);
            }
        }
        citasPorFecha.sort(Comparator.comparing(Cita::getHora));
        for (Cita cita : citasPorFecha) {
            System.out.println(cita);
        }
    }

}
