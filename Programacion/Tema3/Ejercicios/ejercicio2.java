package Programacion.Tema3.Ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        int numero1[] = new int [10];
        int numero2 [] = new int[10];
        int nmero3[] = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numero1.length; i++) {
            System.out.println("Digite el numero 1: ");
            numero1[i] = Integer.parseInt(sc.nextLine());
            System.out.println("Digite el numero 2: ");
            numero2[i] = Integer.parseInt(sc.nextLine());
            nmero3[i] = numero1[i] + numero2[i];
        }
        for (int i = 0; i < nmero3.length; i++) {
            System.out.println(nmero3[i]);
        }
    }
}
