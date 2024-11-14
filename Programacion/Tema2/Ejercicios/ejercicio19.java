package Programacion.Tema2.Ejercicios;

import java.util.Scanner;

public class ejercicio19 {


    public static void main(String[] args) {
        int numero;
        boolean EsPar = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero = Integer.parseInt(sc.nextLine());


        for (int i = 2; i <numero ; i++) {

            if (numero % i == 0) {
                EsPar = false;

            }

        }
        System.out.println(EsPar);


    }
}
