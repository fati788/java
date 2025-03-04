package Programacion.tema6.Ejercico1ClaseRepaso;

import java.time.LocalDate;
import java.util.ArrayList;

public class Autor {

    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;
    private Rol rol;
    private ArrayList<Comic> comics;

    public Autor(String nombre, String apellido, String email, LocalDate fechaNacimiento, Rol rol) {
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Autor{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", rol=").append(rol);

        sb.append('}');
        return sb.toString();
    }

    public ArrayList<Comic> getComics() {
        return comics;
    }
    public void  addComic(Comic comic) {
         if (!comics.contains(comic)) {
             comic.addAutor(this);
             this.comics.add(comic);
         }

    }
    public void removeComic(Comic comic) {
        comic.removeAutor(this);
        this.comics.remove(comic);

    }
}
