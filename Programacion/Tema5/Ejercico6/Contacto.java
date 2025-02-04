package Programacion.Tema5.Ejercico6;

import java.util.Objects;

public class Contacto {
    String nombre;
    Integer telefono;



    public Contacto(String nombre, Integer telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Contacto() {
        this.nombre = "no tiene nombre";
        this.telefono = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contacto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
