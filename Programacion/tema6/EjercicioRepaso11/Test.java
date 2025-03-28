package Programacion.tema6.EjercicioRepaso11;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args)  {
        TiendaComics miTienda = new TiendaComics();

        Aoutor aoutor1 = new Aoutor("Ana" ,"Garcia" ,"na@gmail.com" , LocalDate.of(2022,6,7),Rol.GUIONISTA);
        Aoutor aoutor2 = new Aoutor("Fati" ,"Garcia" ,"na@gmail.com" , LocalDate.of(2045,6,7),Rol.DIBUJANTE);

        Comic anime = new Anime("NONO",LocalDate.of(1999,3,6),10.5,123,12,"Seria",12);
        Comic novelaGrafica= new NovelaGrafica("FFFF",LocalDate.of(2000,3,6),10.5,123,"Resumen",40);

        anime.addAutores(aoutor1);
        anime.addAutores(aoutor2);
        novelaGrafica.addAutores(aoutor1);
        novelaGrafica.addAutores(aoutor2);

        miTienda.addComic(anime);
        miTienda.addComic(novelaGrafica);


        Cliente cliente1 = new Cliente("zkdhz","jadzhz","jzkfeza","sdkhak");
        Cliente cliente2 = new Cliente("k;azhgda","ssjkadh","laejh","alejdfzehl");
        LineaCompra lc1 = new LineaCompra(anime,12);
        LineaCompra lc2 = new LineaCompra(novelaGrafica,3);
        Venta venta = new Venta(cliente1);
        venta.addLinea(lc1);
        venta.addLinea(lc2);

        try {
            miTienda.addVenta(venta);
        } catch (ExepcionStock e) {
            System.out.println(e.getMessage());
        }
        miTienda.ListarComics();
        miTienda.ListarVentas();
    }
}
