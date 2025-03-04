package Programacion.tema6.Ejercico1ClaseRepaso;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Comic {
    protected UUID id ;
    protected  String titulo;
    protected LocalDate fecha;
    protected Double precio;
    protected  Integer numeroPaginas;
    protected ArrayList<Autor>autores;

    public Comic(String titulo, LocalDate fecha, Double precio, Integer numeroPaginas) {
        this.id = UUID.randomUUID();
        this.titulo = titulo;
        this.fecha = fecha;
        this.precio = precio;
        this.numeroPaginas = numeroPaginas;
        this.autores = new ArrayList<>();

    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Comic{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", precio=").append(precio);
        sb.append(", numeroPaginas=").append(numeroPaginas);
        sb.append(", autores=").append(autores);
        sb.append('}');
        return sb.toString();
    }

    public void addAutor(Autor autor) {
        if (!autores.contains(autor)) {
            autores.add(autor);
            autor.addComic(this);
        }
    }
    public void removeAutor(Autor autor) {
        autores.remove(autor);
        autor.removeComic(this);
    }

}
