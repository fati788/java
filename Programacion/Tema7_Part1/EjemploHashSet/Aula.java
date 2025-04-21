package Programacion.Tema7_Part1.EjemploHashSet;

import java.util.ArrayList;

public class Aula {
    private String nombre;
    private String ubicacion;
    private ArrayList<Alumno>alumnos;

    public Aula(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aula{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", ubicacion='").append(ubicacion).append('\'');
        sb.append(", alumnos=").append(alumnos);
        sb.append('}');
        return sb.toString();
    }
    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }
    public void removeAlumno(Alumno alumno) {
        this.alumnos.remove(alumno);
    }
    public void listarAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
