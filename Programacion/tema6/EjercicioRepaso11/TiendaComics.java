package Programacion.tema6.EjercicioRepaso11;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class
TiendaComics {

    private ArrayList<Comic>comics;
     private ArrayList<Venta>ventas;
    public TiendaComics() {
        this.comics = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public ArrayList<Comic> getComics() {
        return comics;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    public void addComic(Comic comic) {
        if (!comics.contains(comic)) {
           this.comics.add(comic);
        }
    }
    public void removeComic(Comic comic) {
        comics.remove(comic);
    }
    public void ListarComics() {
        for (Comic comic : comics) {
            System.out.println(comic.getTitulo());
            for (Aoutor autor : comic.getAutores()) {
                System.out.println(autor.getNombre() +" "
                        + autor.getApellido()+" " +
                        autor.getRol());
            }
            System.out.println();
        }
    }
   public boolean addVenta(Venta venta) throws ExepcionStock {
        for (LineaCompra linea : venta.getLineas()) {
            if (linea.getComic().getNumeroEjemplares()<linea.getCantidad()){
                return false;
            }
        }
        //
       this.ventas.add(venta);
        for (LineaCompra linea : venta.getLineas()) {
            linea.getComic().setNumeroEjemplares(linea.getComic().getNumeroEjemplares()-linea.getCantidad());
            if (linea.getComic().getNumeroEjemplares()==0){
                throw new ExepcionStock("No hay stock sisponible de este comic");
            }
        }
        return true;

   }

    public void ListarVentas() {
        for (Venta venta : this.ventas) {
            System.out.println(venta.getCliente().getDni());
            System.out.println(venta.getFechaVenta());
            for (LineaCompra linea : venta.getLineas()) {
                System.out.println(linea.getComic().getTitulo() + " "
                + linea.getCantidad() );
            }
        }
    }
    public ArrayList<Comic>buscarComic(LocalDate desde , LocalDate hasta) {
        ArrayList<Comic> comics = new ArrayList<>();
        for (Comic comic : this.comics) {
            if (comic.getFecha().isAfter(desde)&& comic.getFecha().isBefore(hasta)) {
                comics.add(comic);
            }
        }
        return comics;
    }

}
