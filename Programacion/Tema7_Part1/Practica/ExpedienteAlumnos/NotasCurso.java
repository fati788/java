package Programacion.Tema7_Part1.Practica.ExpedienteAlumnos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;

public class NotasCurso {
    private String etapaEducativa;
    private String nombreCiclo;
    private Integer curso;
    private HashMap<String,Double>notas;
    private Integer anio;

    public NotasCurso(String etapaEducativa, String nombreCiclo, Integer curso, Integer anio) {
        this.etapaEducativa = etapaEducativa;
        this.nombreCiclo = nombreCiclo;
        this.curso = curso;
        this.anio = anio;
        this.notas = new HashMap<>();
    }

    public String getEtapaEducativa() {
        return etapaEducativa;
    }

    public void setEtapaEducativa(String etapaEducativa) {
        this.etapaEducativa = etapaEducativa;
    }

    public String getNombreCiclo() {
        return nombreCiclo;
    }

    public void setNombreCiclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
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
        sb.append(", nombreCiclo='").append(nombreCiclo).append('\'');
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
        return etapaEducativa == that.etapaEducativa && Objects.equals(nombreCiclo, that.nombreCiclo) && Objects.equals(curso, that.curso) && Objects.equals(anio, that.anio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(etapaEducativa, nombreCiclo, curso, anio);
    }
    public void addNota(String asignatura,Double nota){
        this.notas.put(asignatura, nota);
    }
    public void deleteNota(String asignatura){
        this.notas.remove(asignatura);
    }
    public Double buscar(String asignatura){
        return notas.get(asignatura);
    }
    public void pintar(){
        ArrayList<String> asignaturas = new ArrayList<>(this.notas.keySet());
        asignaturas.sort(Comparator.comparing(String::toString));
        for (String key : asignaturas) {
            System.out.println(key +" ---> "+notas.get(key));
        }
    }
}
