package Programacion.tema6.PracticaOPP5;

import java.util.Objects;

public class Multimedia {
    protected static long autocremento =1;
    protected long codigo;
    protected String titulo;
    protected  Boolean plus;
    protected Double precio;
    protected Genero genero;

    public Multimedia() {
        this.titulo = "";
        this.plus = false;
        this.precio = 0.0;
       this.autocremento++;
       this.codigo = autocremento;

    }

    public Multimedia(String titulo, Boolean plus, Double precio) {
        this.titulo = titulo;
        this.plus = plus;
        this.precio = precio;
        this.autocremento++;
        this.codigo = autocremento;
    }

    public static long getAutocremento() {
        return autocremento;
    }

    public static void setAutocremento(long autocremento) {
        Multimedia.autocremento = autocremento;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Multimedia{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", plus=").append(plus);
        sb.append(", precio=").append(precio);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
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
}
