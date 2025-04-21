package Programacion.Tema7_Part1.Repaso.Ejercicio4.ExpedienteAlumnos;

import java.util.HashMap;
import java.util.Objects;

public class NotasCurso {
  private EtapaEducativa etapaEducativa;
  private String nombreCurso;
  private Integer curso;
  private HashMap<String , Double> notas;
  private Integer anio;

    public NotasCurso(EtapaEducativa etapaEducativa, String nombreCurso, Integer curso, Integer anio) {
        this.etapaEducativa = etapaEducativa;
        this.nombreCurso = nombreCurso;
        this.curso = curso;
        this.anio = anio;
        this.notas = new HashMap<>();
    }

    public EtapaEducativa getEtapaEducativa() {
        return etapaEducativa;
    }

    public void setEtapaEducativa(EtapaEducativa etapaEducativa) {
        this.etapaEducativa = etapaEducativa;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public HashMap<String, Double> getNotas() {
        return notas;
    }

    public void setNotas(HashMap<String, Double> notas) {
        this.notas = notas;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotasCurso{");
        sb.append("etapaEducativa=").append(etapaEducativa);
        sb.append(", nombreCurso='").append(nombreCurso).append('\'');
        sb.append(", curso=").append(curso);
        sb.append(", notas=").append(notas);
        sb.append(", anio=").append(anio);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NotasCurso that = (NotasCurso) o;
        return etapaEducativa == that.etapaEducativa && Objects.equals(nombreCurso, that.nombreCurso) && Objects.equals(curso, that.curso) && Objects.equals(anio, that.anio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(etapaEducativa, nombreCurso, curso, anio);
    }

    public void addNota(String asignatura , Double nota){
        this.notas.put(asignatura, nota);
    }
    public void deleteNota(String asignatura){
        this.notas.remove(asignatura);
    }
    public Double buscarNota(String asignatura){
        return this.notas.get(asignatura);
    }
    public void pintar(){

        for (String asig : notas.keySet()){
            System.out.println(asig + "--->" + notas.get(asig));

        }
    }

}
