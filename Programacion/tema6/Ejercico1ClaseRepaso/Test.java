package Programacion.tema6.Ejercico1ClaseRepaso;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        TiendaComics tc = new TiendaComics();

        Comic c1 = new Anime("ANIM" , LocalDate.of(2024,4,5) ,12.0,245,"serie1" ,12);
        Comic c2 = new Anime("ANIM2" , LocalDate.of(2023,2,5) ,15.0,45,"serie2" ,23);
        tc.addComic(c1);
        tc.addComic(c2);
        Autor autor = new Autor("Ana" ,"Garcia" , "ana@.com",LocalDate.of(2000,5,4) ,Rol.GUIONISTA);
        c1.addAutor(autor);
        System.out.println(tc);

    }
}
