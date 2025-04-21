package Programacion.Tema7_Part1.Repaso.Ejercicio4.GestionBeblioteca;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Usuario usuario, Libro libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Prestamo{");
        sb.append("usuario=").append(usuario);
        sb.append(", libro=").append(libro);
        sb.append(", fechaPrestamo=").append(fechaPrestamo);
        sb.append(", fechaDevolucion=").append(fechaDevolucion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Prestamo prestamo = (Prestamo) o;
        return Objects.equals(usuario, prestamo.usuario) && Objects.equals(libro, prestamo.libro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, libro);
    }
    public void devolverLibro(){
        this.setFechaDevolucion(LocalDate.now());
    }
    public boolean estaActivo(){
        if (this.fechaDevolucion == null){
            return true;
        }else {
            return false;
        }

    }
}
