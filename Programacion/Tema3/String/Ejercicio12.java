package Programacion.Tema3.String;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        //Escribe un método que te devuelva la mitad de una cadena.
        String cadena ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cadena ");
        cadena = sc.nextLine();
        for (int i = 0; i <cadena.length()/2 ; i++) {
            System.out.print(cadena.charAt(i));

        }
    }
}
