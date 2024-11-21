package Programacion.Tema3.Arrays;

public class Ejercico18 {

        public static void pintar (int matrice[][]){

            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[0].length; j++) {

                    System.out.print(matrice[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static int numero_aleatorio(int min , int max){
            return (int)(Math.random()*(max-min+1) +min);
        }

        public static void main(String[] args) {

            //Escribe un programa que genere al azar 20 números enteros comprendidos entre 0 y 9. Estos números se deben
            //introducir en un array de 4 filas por 5 columnas.
            //El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La
            //suma total debe aparecer en la esquina inferior derecha.

            int numeros[][] = new int[5][6];


            for (int i = 0; i < numeros.length-1; i++) {
                for (int j = 0; j < numeros[0].length-1; j++) {
                    numeros[i][j] = numero_aleatorio(0,9);
                }
            }
            int sumaFila = 0;
            for (int i = 0; i < numeros.length-1; i++) {
                for (int j = 0; j < numeros[0].length-1; j++) {
                    sumaFila += numeros[i][j];
                    numeros[i][5] = sumaFila;
                }
                sumaFila = 0;
            }
            int sumaColumna = 0;
            for (int j = 0; j < numeros[0].length - 1; j++) {
                for (int i = 0; i < numeros.length-1; i++) {
                    sumaColumna += numeros[i][j];
                    numeros[4][j] = sumaColumna;
                }
                sumaColumna = 0;
            }
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros[0].length; j++) {

                }
            }
            pintar(numeros);


        }
}

