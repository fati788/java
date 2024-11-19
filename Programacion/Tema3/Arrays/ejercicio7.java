package Programacion.Tema3.Arrays;

import java.util.Scanner;


public class ejercicio7 {
      public static void pintar (int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
          System.out.println();
      }
    public static void main(String[] args) {

        //Crear un programa que lea por teclado una tabla de 5 números enteros y la desplace una posición hacia la
        //derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. Igual que el
        //anterior, pero desplazando N posiciones (N es un número introducido por el usuario).

        int numeros[] = new int[5];
        int temp;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("dime un numero");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        temp = numeros[numeros.length - 1];
       pintar(numeros);

        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0]=temp;
        pintar(numeros);

    }
}
