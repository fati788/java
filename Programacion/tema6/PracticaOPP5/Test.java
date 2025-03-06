package Programacion.tema6.PracticaOPP5;

public class Test {
    public static void main(String[] args) {

        PrimeVedio empresa =new PrimeVedio();

        //añadir peliculas
        Pelicula peliPlus = new Pelicula("peliPLus",true,10.0,132);
        peliPlus.setGenero(Genero.COMEDIA);
            Pelicula pelicula = new Pelicula("peli",false,5.0,45);
            pelicula.setGenero(Genero.ACCION);
        for (int i = 0; i < 170; i++) {
            empresa.addMultimedia(pelicula);

        }
        for (int i = 0; i < 30; i++) {
            empresa.addMultimedia(peliPlus);
        }
        Clienete clienetePro = new ClienetePrimePro("Z567869L","ClienetePro","cliPro@gmail.com");
        Clienete clienete = new ClienetePrime("A12134K","ClientePrime","cli@gmail.com");

        for (int i = 0; i < 750000; i++) {
           empresa.addSuscriptore(clienete);
        }
        for (int i = 0; i < 250000; i++) {
            empresa.addSuscriptore(clienetePro);
        }

        for (Clienete c : empresa.getSuscriptores()){
            for (int i = 0; i < 40; i++) {
                empresa.verMultimedia(empresa.getCatalogo().get(i),c );
            }
        }
        System.out.println("Ganancias de pelis : "+empresa.getGanancias());
        //añadir series
        Serie serie = new Serie("Serie",true,12.4);
        serie.setGenero(Genero.DRAMA);
        for (int i = 0; i < 10; i++) {
                Temporada temporada = new Temporada(i);

            for (int j = 0; j < 10; j++) {
                    Episodio episodio = new Episodio("Epecidio"+j ,"50");
                    temporada.addEpisodio(episodio);
            }
            serie.addTemporada(temporada);
        }
        for (int i = 0; i < 5; i++) {
            empresa.addMultimedia(serie);
        }
            for (Multimedia m : empresa.getCatalogo()){
                if (m instanceof Serie){
                    for (Clienete c : empresa.getSuscriptores()) {
                            empresa.verMultimedia(m, c);
                    }
                }
            }
                   //ganancias total
        System.out.println( "Ganancias Total :"+empresa.getGanancias());

    }
}
