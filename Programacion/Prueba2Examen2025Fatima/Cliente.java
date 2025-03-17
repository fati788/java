package Programacion.Prueba2Examen2025Fatima;

import java.time.LocalDate;

public class Cliente extends Persona {

    private String licenciaConducir;
    private LocalDate fechaObtencionLiciencia;

    public Cliente(String nombre, String apellidos, String dni, String email, String direccion, String telefono , String licenciaConducir, LocalDate fechaObtencionLiciencia) {
        super(nombre, apellidos, dni, email, direccion, telefono);
        this.licenciaConducir = licenciaConducir;
        this.fechaObtencionLiciencia = fechaObtencionLiciencia;
    }
    public Cliente(Cliente otraCliente) {
        this.id=otraCliente.id;
        this.nombre = otraCliente.nombre;
        this.apellidos = otraCliente.apellidos;
        this.dni = otraCliente.dni;
        this.email = otraCliente.email;
        this.direccion = otraCliente.direccion;
        this.telefono = otraCliente.telefono;
        this.licenciaConducir = otraCliente.licenciaConducir;
        this.fechaObtencionLiciencia = fechaObtencionLiciencia;

    }

    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    public LocalDate getFechaObtencionLiciencia() {
        return fechaObtencionLiciencia;
    }

    public void setFechaObtencionLiciencia(LocalDate fechaObtencionLiciencia) {
        this.fechaObtencionLiciencia = fechaObtencionLiciencia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", licenciaConducir='").append(licenciaConducir).append('\'');
        sb.append(", fechaObtencionLiciencia=").append(fechaObtencionLiciencia);
        sb.append('}');
        return sb.toString();
    }

}
