package Programacion.Tema3.String;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Crea un programa que reciba una cadena de caracteres y la devuelva invertida con efecto espejo, este
        //es, se concatena a la palabra original su inversa, compartiendo la última letra, que hará de espejo, por
        //lo que la palabra obtenida se lee igual hacia adelante que hacia atrás. Por ejemplo, al introducir
        //“teclado” devolverá “tecladodalcet” y al introducir “hola” devolverá “holaloh”. Haz dos versiones, una
        //con String y otra con StringBuffer.

        String cadena;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cadena");
        cadena = sc.nextLine();
        //con StringBuffer
        StringBuffer sb = new StringBuffer(cadena);
        sb.deleteCharAt(sb.length()-1);
        sb.reverse();
        System.out.println(cadena + sb);

        //con string

    }
}
