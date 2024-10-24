package Programacion.Tema2.exepciones;

import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {


        //Pedir un número entero positivo N. A continuación, introducir por teclado N números enteros. Mostrar
        //la media de los N números introducidos, el mayor y el menor.

        int numAIntro = 0 ;
        int suma = 0 ;
        int min = 0 ;
        int max = 0 ;
        int num = 0 ;

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Ingrese el primer numero: ");
            numAIntro = Integer.parseInt(sc.nextLine());

            for (int i = 1; i <=numAIntro ; i++) {

                System.out.println("Dime el numero " + i + ":");

                num = Integer.parseInt(sc.nextLine());

                if (i == 1 ){
                    max = num;
                }
                if ( num > max){
                    max = num;
                }
                if ( num < min){
                    min = num;
                }
                suma = suma + num;

            }

        }catch (NumberFormatException e){
            System.out.println("no ha introducido el numero correcto ");
        }

        System.out.println("El mayor numero es " + max);
        System.out.println("El menor  numero es " + min);
        System.out.println("La media de esto snumeros es " + ((double)suma/numAIntro));
    }
}
