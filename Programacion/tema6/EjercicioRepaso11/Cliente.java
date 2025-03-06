package Programacion.tema6.EjercicioRepaso11;

public class Cliente {
    private String dni;
    private String email;
    private String direccion;
    private String datosBancarios;

    public Cliente(String dni, String email, String direccion, String datosBancarios) {
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
        this.datosBancarios = datosBancarios;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDatosBancarios() {
        return datosBancarios;
    }

    public void setDatosBancarios(String datosBancarios) {
        this.datosBancarios = datosBancarios;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", datosBancarios='").append(datosBancarios).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
