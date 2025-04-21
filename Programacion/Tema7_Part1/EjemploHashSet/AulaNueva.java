package Programacion.Tema7_Part1.EjemploHashSet;

import java.util.HashSet;

public class AulaNueva {
    private String nombre;
    private String ubicacion;
    private HashSet<Alumno> alumnos;

    public AulaNueva(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
         this.alumnos = new HashSet<>();
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

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(HashSet<Alumno> alumnos) {
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
