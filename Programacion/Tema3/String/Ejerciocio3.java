package Programacion.Tema3.String;

import java.util.Scanner;

public class Ejerciocio3 {
    public static void main(String[] args) {
        //Diseña un programa en Java que solicite al usuario una cadena en la que buscará y otra que será la
        //cadena buscada. El programa indicará cuántas veces aparece la segunda cadena en la primera.
        String texto;
        String cadena;
        int contador =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la primera cadena");
        texto = sc.nextLine();
        System.out.println("Dime la cadena que quieres saver cuqntos veces repetir ");
        cadena = sc.nextLine();

        for (int i = 0; i < cadena.length()-1; i++) {
          if (cadena.indexOf(i) == texto.indexOf(i+1)) {
              contador++;
          }

        }
        System.out.println("Este cadena aparece " + contador + " veces");

    }
}
