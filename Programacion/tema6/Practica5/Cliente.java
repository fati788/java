package Programacion.tema6.Practica5;

import java.util.Objects;

public abstract class Cliente {

    protected  String nombre;
    protected String dni;
    protected String email;
    protected Double precioMensoal = 0.0;

    public Cliente() {
        this.nombre = "";
        this.dni = "";
        this.email = "";
        this.precioMensoal = 0.0;
    }

    public Cliente(String nombre, String dni, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.precioMensoal = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getPrecioMensoal() {
        return precioMensoal;
    }

    public void setPrecioMensoal(Double precioMensoal) {
        this.precioMensoal = precioMensoal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", precioMensoal=").append(precioMensoal);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(dni, cliente.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
    public abstract Boolean esPro();
    public abstract Double getPrioMensual();


}
