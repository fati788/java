package Programacion.Tema7.Practica.ExpedienteAlumnos;

import java.util.HashSet;
import java.util.Objects;

public class Expediente {
    private Estudiante estudiante;
    private HashSet<NotasCurso>notas;
    private boolean activo;

    public Expediente(Estudiante estudiante, boolean activo) {
        this.estudiante = estudiante;
        this.activo = activo;
        this.notas=new HashSet<>();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public HashSet<NotasCurso> getNotas() {
        return notas;
    }

    public void setNotas(HashSet<NotasCurso> notas) {
        this.notas = notas;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Expediente{");
        sb.append("estudiante=").append(estudiante);
        sb.append(", notas=").append(notas);
        sb.append(", activo=").append(activo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Expediente that = (Expediente) o;
        return Objects.equals(estudiante, that.estudiante);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(estudiante);
    }
    public void addNotas(NotasCurso nc){
        this.notas.add(nc);
    }
   public void modtrarNotas(int Curso , String etapa){
        for (NotasCurso nc : notas) {
            if ((nc.getCurso() == Curso) && (nc.getEtapaEducativa().equals(etapa))) {
                System.out.println(nc.getNotas());
            }
        }
   }
}
