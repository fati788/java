package Programacion.Tema7_Part1.Repaso.Ejercicio2;

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
    public void listarCitasPorNombre(){
        this.citas.sort(new Comparator<Cita>() {

            @Override
            public int compare(Cita o1, Cita o2) {
                return o1.getPaciente().getNombre().compareTo(o2.getPaciente().getNombre());
            }
        });
        for (Cita cita : this.citas) {
            System.out.println(cita);
        }
    }

    public void listarPorApellido(){
        this.citas.sort(new Comparator<Cita>() {

            @Override
            public int compare(Cita o1, Cita o2) {
                return o1.getPaciente().getApellidos().compareTo(o2.getPaciente().getApellidos());
            }
        });
        for (Cita cita : this.citas) {
            System.out.println(cita);
        }
    }

    public void listarPorFechasYApellidos(){
        this.citas.sort(new Comparator<Cita>() {
            @Override
            public int compare(Cita o1, Cita o2) {
                if (o1.getFecha().equals(o2.getFecha())) {
                    return o1.getPaciente().getApellidos().compareTo(o2.getPaciente().getApellidos());
                }else {
                    return o1.getFecha().compareTo(o2.getFecha());
                }
            }
        });
        for (Cita cita : this.citas) {
            System.out.println(cita);
        }
    }

    public void listarCitasPorHora(LocalDate fecha){
        ArrayList<Cita>citasPorFecha = new ArrayList<>();

        for (Cita cita : citas) {
            if (cita.getFecha().equals(fecha)) {
                citasPorFecha.add(cita);
            }
        }
        citasPorFecha.sort(Comparator.comparing(Cita::getHora));
        for (Cita cita : citasPorFecha) {
            System.out.println(cita.getHora());
        }
    }
    public void buscarCitasFuturas(String email){
        for (Cita cita : citas) {
            if (cita.getFecha().isAfter(LocalDate.now()) && (cita.getPaciente().getEmail().equals(email)))
                System.out.println(cita);
            }
        }

    }

