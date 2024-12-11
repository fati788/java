package Ejercicioooooooos;

import java.util.Arrays;

public class EjercicioOrden6 {
    public static void pintar(int vector[]){

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");

        }
        System.out.println();
    }
    public static int numeroAmeatorio(int min , int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
        /*Realiza un programa que cree un vector de 100 posiciones con números aleatorios entre 1 y 100. Una
          vez creado el vector, el programa deberá ordenarlo y mostrar los números entre 1 y 100 que no han
          sido almacenados. Ten en cuenta a la hora de buscar un número en un array que no tienes que
          comparar con todo el array puesto que ya está ordenado.*/

        int vector[] = new int[100];

     for (int i = 0; i < vector.length; i++) {

         vector[i] = numeroAmeatorio(0, 100);

     }
        System.out.println(" El Array ordenado :");
        Arrays.sort(vector);
        pintar(vector);
        int index = 0;
        System.out.println("numeros  que no estan en el array : ");
        for (int i = 0; i < vector.length; i++) {
            while (index < vector.length && vector[index] < i) {
                index++;
            }
            if (index == vector.length || vector[index] != i) {
                System.out.print(i + " ");
            }
        }

    }
}
