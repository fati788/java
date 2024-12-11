package Programacion.Tema3.String;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Crea un programa en Java que solicite al usuario dos cadenas de caracteres y que devuelva la primera
        //cadena, pero transformando en mayúsculas la parte que coincide con la segunda cadena introducida.
        //Por ejemplo, si se introducen las cadenas “Esta es mi amiga Ana” y “amiga” devolverá “Esta es mi
        //AMIGA Ana”.
        String cadena1 ;
        String cadena2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la primera cadena");
        cadena1 = sc.nextLine();
        System.out.println("Dime la segunda cadena");
        cadena2 = sc.nextLine();
         String[] toros = cadena1.split(" ");

        for (int i = 0; i <toros.length ; i++) {

            if (toros[i].equals(cadena2)) {
               toros[i] = cadena2.toUpperCase();
            }
            System.out.print(toros[i] + " ");
        }



    }
}
