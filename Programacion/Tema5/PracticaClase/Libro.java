package Programacion.Tema5.PracticaClase;

import java.util.Objects;

public class Libro {
       /*

3. Define una clase Libro con los siguientes miembros: ISBN (de 10 dígitos), título, autor, número de
páginas, precio_compra, precio_venta, vendido (boolean). Los dos precios se pondrán a 0 en el
constructor, no vienen en sus parámetros. Crea sus respectivos métodos get y set. Crea también el
método toString() para mostrar la información relativa al libro, con el siguiente formato: “El libro W
con ISBN X creado por el autor Y tiene Z páginas”. Implementa también el método equals.
Realiza una nueva clase Librería, que tenga un array (ArrayList) de 1000 libros. Implementa los
métodos adquirir (Libro, precioCompra) y vender (Libro, precioVenta). El método adquirir asignará
un precio_compra al libro y lo añadirá a la librería. El método vender pondrá el precio de venta y le
cambiará el estado a “vendido = true”. Finalmente crea un método en Librería que calcule las
ganancias de todos los libros que hayas vendido. Debes probar, al menos, a adquirir y vender 10
libros y calcular las ganancias.
*/
    private  String ISBN;
    private String titulo;
    private String autor;
    private Integer numeroPaginas;
    private Double precioCompra;
    private Double precioVenta;
    private Boolean vendidio;

    public Libro(String ISBN, String titulo, String autor, Integer numeroPaginas, Boolean vendidio) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.vendidio = vendidio;
        this.precioCompra=0.0;
        this.precioVenta=0.0;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Boolean getVendidio() {
        return vendidio;
    }

    public void setVendidio(Boolean vendidio) {
        this.vendidio = vendidio;
    }

    //El libro W
    //con ISBN X creado por el autor Y tiene Z páginas
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(" El Libro ");
        sb.append(titulo);
        sb.append(" con ISBN ").append(ISBN);
        sb.append(" Creado por ").append(autor);
        sb.append(" y tiene ").append(numeroPaginas).append("Paginas");

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(ISBN, libro.ISBN) && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(numeroPaginas, libro.numeroPaginas) && Objects.equals(precioCompra, libro.precioCompra) && Objects.equals(precioVenta, libro.precioVenta) && Objects.equals(vendidio, libro.vendidio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, titulo, autor, numeroPaginas, precioCompra, precioVenta, vendidio);
    }
}
