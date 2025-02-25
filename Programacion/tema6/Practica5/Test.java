package Programacion.tema6.Practica5;

public class Test {
    public static void main(String[] args) {

       PrimeVedio mi = new PrimeVedio();

       Pelicula peli1 = new Pelicula("peli" , true , 10.0 , 1234);
       Pelicula peli2 = new Pelicula("peli2" , false , 70.0 , 12456);

          Cliente cliente1 = new ClientePrimePro("cli1" , "z13213" , "ezrar" , 100.8);
          Cliente cliente2 = new ClientePrime( "cli" , "z13213" , "ezrar" , 100.8);

        mi.ver(peli1 , cliente1);
        mi.ver(peli2 , cliente2);

        System.out.println("Ganancias : " + mi.getGanancias());


    }
}
