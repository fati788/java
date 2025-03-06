package Programacion.tema6.PracticaOPP5;

import java.util.Objects;

public class Multimedia {
    protected static Long autocremento=1L;
    protected Long codigo;
    protected String titulo;
    protected Boolean plus;
    protected Double precion;
    protected Genero genero;

    //constructor por defecto
    public Multimedia() {
        autocremento++;
        this.codigo = autocremento;
        this.titulo="";
        this.plus=false;
        this.precion=0.0;
        this.genero=null;
    }
   //constructor pcon parametros
    public Multimedia(String titulo, Boolean plus, Double precion) {
        this.titulo = titulo;
        this.plus = plus;
        this.precion = precion;
        autocremento++;
        this.codigo = autocremento;
    }

    //getter y setter
    public Long getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getPlus() {
        return plus;
    }

    public void setPlus(Boolean plus) {
        this.plus = plus;
    }

    public Double getPrecion() {
        return precion;
    }

    public void setPrecion(Double precion) {
        this.precion = precion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Multimedia that = (Multimedia) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Multimedia{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", plus=").append(plus);
        sb.append(", precion=").append(precion);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }
}
