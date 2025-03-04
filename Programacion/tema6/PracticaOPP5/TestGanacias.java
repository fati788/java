package Programacion.tema6.PracticaOPP5;

public class TestGanacias {
    public static void main(String[] args) {


        PrimeVedio miPrime= new PrimeVedio();

          Pelicula peliculaPlus = new Pelicula("PeliPro" , true , 10.0 , 123);
          peliculaPlus.setGenero(Genero.ACCION);
        for (int i = 0; i < 30; i++) {
            miPrime.addCatalogo(peliculaPlus);
        }

        Pelicula pelicula = new Pelicula("Peli" , false , 25.0 , 45);
        pelicula.setGenero(Genero.INFANTIL);
        for (int i = 0; i < 170; i++) {
            miPrime.addCatalogo(pelicula);
        }


        ClientePrime clientePrime = new ClientePrime("Cliente" , "heyqw" , "ñqfhq" , 456.0);
        for (int i = 0; i < 75; i++) {
            miPrime.addSuscriptor(clientePrime);
        }


        ClientePrimePro clientePrimePro = new ClientePrimePro("jhadfa" , "kadfhasdjk" , "aqileqwer" , 456.0);
        for (int i = 0; i < 25;  i++) {

            miPrime.addSuscriptor(clientePrimePro);
        }

        for (Cliente cliente : miPrime.getSuscriptores()) {
            for (int i =0 ; i<40 ; i++) {
                miPrime.ver(miPrime.getCatalogo().get(i) , cliente);


            }
        }
        System.out.println("Ganancias: " + miPrime.getGanancias());

        //series
        Series series = new Series("comi" , true , 14.45);
        series.setGenero(Genero.COMEDIA);
        for (int i = 0; i < 10; i++) {
            Temporada t = new Temporada(i);
            for (int j = 0; j < 10; j++) {

                t.addEpisodio(new Episodio("Episodio"+j , "60"));
            }
            series.addTemporada(t);
            miPrime.addCatalogo(series);
        }

        for (Multimedia multimedia : miPrime.getCatalogo()) {
            if (multimedia instanceof Series ) {
                for (Cliente cliente : miPrime.getSuscriptores()) {
                       miPrime.ver(multimedia, cliente);


                }
            }
        }

       // System.out.println(miPrime.getCatalogo().size());
        System.out.println("Ganancias: " + miPrime.getGanancias());

    }
}
