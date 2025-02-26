package Programacion.tema6.Practica5;

public class TestGnancias {
    public static void main(String[] args) {
        PrimeVedio miPrime= new PrimeVedio();

        for (int i = 0; i < 30; i++) {
            miPrime.addCatalogo(new Pelicula("PeliPro" , true , 10.0 , 123));
        }
        for (int i = 0; i < 170; i++) {
            miPrime.addCatalogo(new Pelicula("Peli" , false , 25.0 , 45));
        }

        for (int i = 0; i < 7500; i++) {
            miPrime.addSuscriptor(new ClientePrime("Cliente" , "heyqw" , "ñqfhq" , 456.0));
        }
         for (int i = 0; i < 2500;  i++) {
             ClientePrimePro clientePrimePro = new ClientePrimePro("jhadfa" , "kadfhasdjk" , "aqileqwer" , 456.0);
             miPrime.addSuscriptor(clientePrimePro);
         }
              for (Cliente cliente : miPrime.getSuscriptores()) {
                  for (Multimedia pelicula : miPrime.getCatalogo()) {
                      miPrime.ver(pelicula , cliente);

                  }
              }
        System.out.println("Ganancias: " + miPrime.getGanancias());

        }

       /* for (int i = 0; i < 150;  i++) {
            ClientePrime clientePrime = new ClientePrime("Cliente pro" , "HKGDQ" , "AKJDQW@ÑKLE" , 123.0);
            miPrime.addSuscriptor(clientePrime);
            for (int j = 0; j < 40; j++) {
                Pelicula pelicula = new Pelicula("PeliPro" , true , 10.0 , 123);
                miPrime.addCatalogo(pelicula);
                miPrime.ver(pelicula , clientePrime);
            }

        }*/


        /**/

    }


