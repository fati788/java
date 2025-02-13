package Programacion.Practica2OPP.Ejercicio1;

import java.util.Objects;

public abstract class Ciclista  {
    protected Integer identificador;
    protected String nombre;
    protected Integer tiempoAcumulado =0;

    protected abstract String imprimirTimpo();



    public Ciclista(Integer identificador, String nombre, Integer tiempoAcumulado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = tiempoAcumulado;

    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(Integer tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("identificador=").append(identificador);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tiempoAcumulado=").append(tiempoAcumulado);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ciclista ciclista = (Ciclista) o;
        return Objects.equals(identificador, ciclista.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificador);
    }
}

