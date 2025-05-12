package Programacion.Tema7_part3.PruebaV2.models;

import java.time.LocalDate;

public class Usuario extends Persona {

    private LocalDate fechaAla;

    public Usuario(Integer id, String nombre, String apellido, String email, String telefono, LocalDate fechaAla) {
        super(id, nombre, apellido, email, telefono);
        this.fechaAla = fechaAla;
    }

    public LocalDate getFechaAla() {
        return fechaAla;
    }

    public void setFechaAla(LocalDate fechaAla) {
        this.fechaAla = fechaAla;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Usuario{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", fechaAla=").append(fechaAla);
        sb.append('}');
        return sb.toString();
    }
}
