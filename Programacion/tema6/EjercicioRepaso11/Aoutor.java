package Programacion.tema6.EjercicioRepaso11;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aoutor {

    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;
    private Rol rol;
    private ArrayList<Comic>comics;


    public Aoutor(String nombre, String apellido, String email, LocalDate fechaNacimiento, Rol rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
        this.comics = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public ArrayList<Comic> getComics() {
        return comics;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aoutor{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", rol=").append(rol);

        sb.append('}');
        return sb.toString();
    }
    public void addComic(Comic comic) {
        if (!comics.contains(comic)) {
            this.comics.add(comic);
            comic.addAutores(this);

        }
    }
    public void removeComic(Comic comic) {
        comic.removeAutores(this);
        this.comics.remove(comic);
    }

}
