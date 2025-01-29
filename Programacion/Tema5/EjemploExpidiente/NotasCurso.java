package Programacion.Tema5.EjemploExpidiente;

import java.util.Objects;

public class NotasCurso {


    private String adignatura;
    private Integer curso;
    private Double nota1Ev;
    private Double nota2Ev;
    private Double nota3Ev;
    private Double notaFinal;

    public NotasCurso(String adignatura, Integer curso, Double nota1Ev, Double nota2Ev, Double nota3Ev) {
        this.adignatura = adignatura;
        this.curso = curso;
        this.nota1Ev = nota1Ev;
        this.nota2Ev = nota2Ev;
        this.nota3Ev = nota3Ev;
        this.notaFinal =this.CalcularNotaFinal();
    }

    public NotasCurso(String adignatura, Integer curso) {
        this.adignatura = adignatura;
        this.curso = curso;
        this.nota1Ev = 0.0;
        this.nota2Ev = 0.0;
        this.nota3Ev = 0.0;
        this.notaFinal = 0.0;

    }

    public String getAdignatura() {
        return adignatura;
    }

    public void setAdignatura(String adignatura) {
        this.adignatura = adignatura;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public Double getNota1Ev() {
        return nota1Ev;
    }

    public void setNota1Ev(Double nota1Ev) {
        this.nota1Ev = nota1Ev;
    }

    public Double getNota2Ev() {
        return nota2Ev;
    }

    public void setNota2Ev(Double nota2Ev) {
        this.nota2Ev = nota2Ev;
    }

    public Double getNota3Ev() {
        return nota3Ev;
    }

    public void setNota3Ev(Double nota3Ev) {
        this.nota3Ev = nota3Ev;
    }

    public Double getNotaFinal() {
        this.notaFinal = CalcularNotaFinal();
        return notaFinal;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotasCurso{");
        sb.append("adignatura='").append(adignatura).append('\'');
        sb.append(", curso=").append(curso);
        sb.append(", nota1Ev=").append(nota1Ev);
        sb.append(", nota2Ev=").append(nota2Ev);
        sb.append(", nota3Ev=").append(nota3Ev);
        sb.append(", notaFinal=").append(notaFinal);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NotasCurso that = (NotasCurso) o;
        return Objects.equals(adignatura, that.adignatura) && Objects.equals(curso, that.curso) && Objects.equals(nota1Ev, that.nota1Ev) && Objects.equals(nota2Ev, that.nota2Ev) && Objects.equals(nota3Ev, that.nota3Ev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adignatura, curso, nota1Ev, nota2Ev, nota3Ev);
    }
    public  Double CalcularNotaFinal(){
        return (this.nota1Ev+this.nota2Ev+this.nota3Ev)/3;
    }
}
