package Programacion.Tema2.Ejercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {


        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        switch (numero) {

            case 1:
                System.out.println("uno ");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4 :
                System.out.println("cuatro");
                break;
            case 5 :
                System.out.println("cinco");
                break;
            case 6 :
                System.out.println("seis");
                break;
            case 7 :
                System.out.println("siete");
                break;
            case 8 :
                System.out.println("ocho");
                break;
            case 9 :
                System.out.println("nueve");
                break;
            default:
                System.out.println("Error: no es un número de un dígito");

        }
    }
}
