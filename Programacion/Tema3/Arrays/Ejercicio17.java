package Programacion.Tema3.Arrays;

import java.util.Arrays;

public class Ejercicio17 {
    public static int  NumeroAleatorio(int  min , int max){
        return (int ) (Math.random()*(max-min+ 1)+min);
    }
    public static void pintar (int matrice[][]){
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                System.out.print(matrice[i][j] + " ");

            }
            System.out.println( );
        }

    }

    public static void ordenarFilas(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Arrays.sort(matriz[i]);
            }
        }
    }
    public static void ordenarColumnas(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > matriz[0][j]) {

                }

            }
        }
    }
    public static void main(String[] args) {
        int matrice[][] = new int[5][5];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length ; j++) {
                matrice[i][j] = NumeroAleatorio(0,100);

            }
        }
        ordenarFilas(matrice);
        pintar(matrice);


    }
}
