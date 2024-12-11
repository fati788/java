package Programacion.Tema3.String;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        //Crea un método que determine si una cadena es un palíndromo, o sea, se lee igual en los dos sentidos.

        String cadena ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cadena ");
        cadena = sc.nextLine();

        StringBuffer sb = new StringBuffer(cadena);
        sb.reverse();
        if (sb.toString().equals(cadena)) {
            System.out.println("La cadena es un palíndromo ");
        }else {
            System.out.println("La cadena no es palíndromo");
        }

    }
}
