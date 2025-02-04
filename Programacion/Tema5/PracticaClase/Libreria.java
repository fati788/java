package Programacion.Tema5.PracticaClase;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private List<Libro>libros ;

    public Libreria() {
        this.libros = new ArrayList<>(1000);
    }

    public void adquirir( Libro libro , Double precioCompra ){

        libro.setPrecioCompra(precioCompra);
        libros.add(libro);

    }
    public  void vender( Libro libro , Double precioVenta ){
        libro.setPrecioVenta(precioVenta);
        libro.setVendidio(true);
        libros.remove(libro);

    }
    public Double calcularGanancia (Libro libro){
        double ganancia = 0;

            if (libro.getVendidio()) {
                ganancia += libro.getPrecioVenta() - libro.getPrecioCompra();

            }

        return ganancia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Libreria{");
        sb.append("libros=").append(libros);
        sb.append('}');
        return sb.toString();
    }
}
