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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TiendaComics{");
        sb.append("comics=").append(comics);
        sb.append(", ventas=").append(ventas);
        sb.append('}');
        return sb.toString();
    }

    public void addComic(Comic comic) {
        if (!comics.contains(comic)) {
            comics.add(comic);
        }
    }
    public void removeComic(Comic comic) {
        comics.remove(comic);
    }
    public void ListarComics() {
        for (Comic comic : comics) {
            System.out.println(comic);
        }
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    public  void AddVenta(Venta venta) throws ExepcionStock{
        if (venta.getComic().getNumeroEjemplares()>=1) {
                ventas.add(venta);
                venta.getComic().setNumeroEjemplares(venta.getComic().getNumeroEjemplares()-1);

        }else  if (venta.getComic().getNumeroEjemplares()==0) {
            ExepcionStock ex = new ExepcionStock("No quedan mas ejemplares de este comic");
        }
    }
    public void ListarVentas() {
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }

}
