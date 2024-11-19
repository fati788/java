package Programacion.Tema3.Arrays;

import java.util.Arrays;

public class ejercicio9 {
    public static int  NumeroAleatorio(int  min , int max){
        return (int ) (Math.random()*(max-min+ 1)+min);
    }
    public static void pintar (int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int corrida[] = new int[10];
        for (int i = 0; i < corrida.length; i++) {
            corrida[i] = NumeroAleatorio(10,200);
        }
        pintar(corrida);

        Arrays.sort(corrida);
        pintar(corrida);
        System.out.println("El primero es : " + corrida[0]);
        System.out.println("El segundo es : " + corrida[1]);
        System.out.println("El ultimo es : " + corrida[corrida.length-1]);



    }
}
