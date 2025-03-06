package Programacion.tema6.PracticaOPP5;

import java.util.Objects;

public abstract class Clienete {
    protected String dni;
    protected String nombre;
    protected String email;
    protected Double precioMensual;

    public Clienete() {
        this.dni = "";
        this.nombre = "";
        this.email = "";
        this.precioMensual = 0.0;
    }

    public Clienete(String dni, String nombre, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPrecioMensual(Double precioMensual) {
        this.precioMensual = precioMensual;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Clienete{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", precioMensual=").append(getPrecioMensual());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Clienete clienete = (Clienete) o;
        return Objects.equals(dni, clienete.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    /**
     * Método abstracto es pro
     * @return
     */
    public abstract boolean esPro();

    /**
     * Método abstracto que devuelve el precio Mensual
     * @return
     */
    public abstract Double getPrecioMensual();
}
