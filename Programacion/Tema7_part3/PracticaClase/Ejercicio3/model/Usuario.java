package Programacion.Tema7_part3.PracticaClase.Ejercicio3.model;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario {
    private String nombre ;
    private String apellodos;
    private Genero genero;
    private LocalDate fechaNacimiento;
    private String dni;
    private String login;
    private String password;

    public Usuario(String nombre, String apellodos, Genero genero, LocalDate fechaNacimiento, String dni, String login, String password) {
        this.nombre = nombre;
        this.apellodos = apellodos;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.login = login;
        this.password = password;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellodos() {
        return apellodos;
    }

    public void setApellodos(String apellodos) {
        this.apellodos = apellodos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Usuario{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellodos='").append(apellodos).append('\'');
        sb.append(", genero=").append(genero);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(dni, usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
