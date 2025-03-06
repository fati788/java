package Programacion.tema6.EjercicioRepaso11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Comic {

    protected UUID id;
    protected String titulo;
    protected LocalDate fecha;
    protected Double precio;
    protected Integer numeroPaginas;
    protected ArrayList<Aoutor>autores;
    protected Integer numeroEjemplares;

    public Comic(String titulo, LocalDate fecha, Double precio, Integer numeroPaginas ,Integer numeroEjemplares) {
        this.id = UUID.randomUUID();
        this.titulo = titulo;
        this.fecha = fecha;
        this.precio = precio;
        this.numeroPaginas = numeroPaginas;
        this.autores = new ArrayList<>();
        this.numeroEjemplares = numeroEjemplares;
    }

    public UUID getId() {
        return id;
    }

    public Integer getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(Integer numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
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

    public ArrayList<Aoutor> getAutores() {
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
        sb.append(", numeroEjemplares=").append(numeroEjemplares);
        sb.append('}');
        return sb.toString();
    }

    public void addAutores(Aoutor autor) {
        if (!autores.contains(autor)) {
            this.autores.add(autor);
            autor.addComic(this);
        }
   }
   public void removeAutores(Aoutor aoutor){
        aoutor.removeComic(this);
        this.autores.remove(aoutor);

   }
}
