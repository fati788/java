package Programacion.Tema2.Ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        int num ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero es multiplico de 2");
        }
        if (num % 3 == 0) {
            System.out.println("El numero es multiplico de 3");
        }
        if (num % 5 == 0) {
            System.out.println("El numero es multiplico de 5");
        }
        if (num % 7 == 0) {
            System.out.println("El numero es multiplico de 7");
        }
        sc.close();
    }
}

