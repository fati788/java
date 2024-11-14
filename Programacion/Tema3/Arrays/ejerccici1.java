package Programacion.Tema3.Arrays;

import java.util.Scanner;

public class ejerccici1 {

    public static void main(String[] args) {

        // pide 5 numeros de double por teclado
        // gruardadrlos directamente array
        // pint el array


        double numeros [] = new double[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <numeros.length ; i++) {
            System.out.println("Ingrese un numero");
            numeros[i] = Double.parseDouble(sc.nextLine());

        }
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
        }

    }
}
