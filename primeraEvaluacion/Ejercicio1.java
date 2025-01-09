package primeraEvaluacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    /**
     * metodo para generar numeros aleatorios
     * @param min
     * @param max
     * @return
     */
    public static int numeroAleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1))+min;
    }

    /**
     * metodo para pintar la matrice
     * @param matriz
     */
    public static void pintar(int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j]+" ");

            }
            System.out.println();
        }
    }

    /**
     * metodo para intercambiar dos culumnas
     * @param matriz
     */
    public static void intercambiarCulumna(int matriz[][]){
        int temp = 0;
        int columna1 ;
        int columna2 ;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Dime la culumna 1");
            columna1 = Integer.parseInt(sc.nextLine());
            System.out.println("Dime la culumna 2");
            columna2 = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < matriz[0].length; j++) {
                for (int i = 0; i < matriz.length; i++) {
                    temp = matriz[i][columna1];
                    matriz[i][columna1] = matriz[i][columna2];
                    matriz[i][columna2] = temp;
                }

            }
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }

    }

    /**
     * metodo para sumar fila
     * @param matriz
     */
    public static void sumaFila(int matriz[][]){
        int suma = 0;
        int fila;
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Dime una fila ");
            fila = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if (i == fila) {
                        suma += matriz[i][j];
                    }
                }
            }
            System.out.println("La suma de la fila " + fila + " es: " + suma);
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }

    }

    /**
     * metodo para comprobar si el diagonal principal y inverse son iguales
     * @param matriz
     */
    public static void DiagonalPrincipal(int matriz[][]){
        int sumaPrincipal = 0;
        int sumaInverse = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(i==j){
                    sumaPrincipal+=matriz[i][j];
                }
                if (i+j == matriz.length-1){
                    sumaInverse+=matriz[i][j];
                }
            }
        }
        System.out.println("La suma de diagonal principal: " + sumaPrincipal);
        System.out.println("La suma de diagonal inverse: " + sumaInverse);
        if(sumaPrincipal == sumaInverse){
            System.out.println("la diagonal principal y la inversa son iguales.");

        }else {
            System.out.println("la diagonal principal y la inversa no son iguales.");
        }

    }

    /**
     * metodo para indicar coordenadas del menor numero de la matrice
     * @param matriz
     */
    public static void  coordenadasMenor(int matriz[][]){
        int menor = Integer.MAX_VALUE;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];

                }

            }
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if (matriz[i][j] == menor){
                    System.out.println("El coordenadas del menor es  " +"("+i+"," + j+")");
                }
            }
        }
    }

    /**
     * metodo para ordenar filas
     * @param matriz
     */
    public static void ordenarFilas(int matriz[][]){

        for(int i = 0; i < matriz.length; i++){
            Arrays.sort(matriz[i]);
        }
        pintar(matriz);
    }

    public static void main(String[] args) {
        //[2 puntos] Nos piden crear una matriz 20×20 de números enteros que inicialmente
        //rellenamos de valores aleatorios (1-100), nos piden hacer un menú con estas opciones:
        //1. Intercambiar columna. Te pedirá dos números de columna e intercambiará los
        //valores de la primera por los valores de la segunda.
        //2. Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
        //3. Comprueba si la diagonal principal y la inversa son iguales.
        //4. Pintar las coordenadas i,j donde se encuentra el menor elemento de la matriz.
        //5. Muestra la matriz con las filas ordenadas de menor a mayor
        //6. Salir

        int numeros[][] = new int[5][5];
        int opcion = 0 ;
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[0].length; j++){
                numeros[i][j] = numeroAleatorio(1,100);
            }
        }
        pintar(numeros);
        try {
            Scanner sc = new Scanner(System.in);

            while (opcion != 6) {


                System.out.println("*****MENU*****");
                System.out.println("1-IntercambiarColumnas");
                System.out.println("2-Suma de un fila");
                System.out.println("3-Comprueba si la diagonal principal y la inversa son iguales");
                System.out.println("4-Pintar las coordenadas i,j del menor de la matriz");
                System.out.println("5-Ordenar filas del menor a mayor ");
                System.out.println("6-Salir");
                System.out.println("Elegir opcion: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        intercambiarCulumna(numeros);
                        pintar(numeros);
                        break;
                    case 2:
                        sumaFila(numeros);
                        break;
                    case 3:
                        DiagonalPrincipal(numeros);
                        break;
                    case 4:
                        coordenadasMenor(numeros);
                        break;
                    case 5:
                        System.out.println("Filas ordenadas :");
                        ordenarFilas(numeros);
                        break;
                    case 6:
                        System.out.println("Adiós");
                        break;
                    default:
                        break;

                }
            }
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }



    }
}
