package Programacion.Tema5;

import java.util.Objects;

public class TelefonoMoil {
    private String nombre;
    private String numero;
    private String cdigoCopia;
    private Double peso;

    public TelefonoMoil(String nombre, String numero, String cdigoCopia, Double peso) {
        this.nombre = nombre;
        this.numero = numero;
        this.cdigoCopia = cdigoCopia;
        this.peso = peso;
    }
    public  TelefonoMoil( TelefonoMoil otro) {
        this.nombre=otro.nombre;
        this.numero=otro.numero;
        this.cdigoCopia=otro.cdigoCopia;
        this.peso=otro.peso;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCdigoCopia() {
        return cdigoCopia;
    }

    public void setCdigoCopia(String cdigoCopia) {
        this.cdigoCopia = cdigoCopia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TelefonoMoil{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", numero='").append(numero).append('\'');
        sb.append(", cdigoCopia='").append(cdigoCopia).append('\'');
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TelefonoMoil that = (TelefonoMoil) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(numero, that.numero) && Objects.equals(cdigoCopia, that.cdigoCopia) && Objects.equals(peso, that.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numero, cdigoCopia, peso);
    }

}
