package Programacion.Tema3.Ejercicios;

public class ejercicio3 {
    public static void pintar (int matrice[][]){

                for (int i = 0; i < matrice.length; i++) {
                    for (int j = 0; j < matrice[0].length; j++) {
                        System.out.print(matrice[i][j] + "   ");
                    }
                    System.out.println();
                }
            }
            public static int numero_aleatorio(int min , int max){

                return (int)(Math.random()*(max-min+1) +min);
            }

            public static void main(String[] args) {

       	/*
        	En una plantación tenemos seis zonas diferentes.
        	En cada zona tenemos tres sensores, uno de temperatura (-5, 55), otro de
        	humedad (0, 100), y otro de pH (0, 10) del suelo.
        	Cada sensor nos da la temperatura media del día.
        	Vamos a almacenar esa información donde cada fila es una zona y cada
        	columna la media de cada tipo de sensor.

        	Escribe un programa Java que:
        	1. Genere aleatoriamente los datos de los sensores.
        	2. Pinte toda la información
        	3. Calcule el promedio de cada tipo de sensor en toda la plantación
        	4. Identifique la zona con la temperatura más alta
        	5. Diga si alguna zona tiene una humedad inferior al 30%

     	*/

                int sensores[][] = new int [6][3];
                int sumaCulumna = 0;
                int max = Integer.MIN_VALUE;
                int zonaMax = 0;
                int zonaHum = 0;

                for (int i = 0; i < sensores.length; i++) {
                    for (int j = 0; j < sensores[0].length; j++) {
                        sensores[i][0] = numero_aleatorio(-5, 55);
                        sensores[i][1] = numero_aleatorio(0, 100);
                        sensores[i][2] = numero_aleatorio(0, 10);

                    }

                }
                pintar(sensores);
                for (int j = 0; j < 1; j++) {
                    for (int i = 0; i < sensores.length; i++) {
                        sumaCulumna += sensores[i][j];
                        if (sensores[i][j]>max){
                            max = sensores[i][j];
                            zonaMax = i+1;
                        }

                    }
                    System.out.println("El primedio del temperatura es : " + (sumaCulumna/6));
                    sumaCulumna = 0;

                }
                for (int j = 1; j <2 ; j++) {
                    for (int i = 0; i < sensores.length; i++) {
                        sumaCulumna += sensores[i][j];
                        if (sensores[i][j] < 30){
                            zonaHum = i+1;
                        }

                    }
                    System.out.println("El primedio del humedad es : " + (sumaCulumna/6));
                    sumaCulumna = 0;
                }
                for (int j = 2; j <3 ; j++) {
                    for (int i = 0; i < sensores.length; i++) {
                        sumaCulumna += sensores[i][j];

                    }
                    System.out.println("El primedio del ph es : " + (sumaCulumna/6));

                }
                System.out.println("La zona qui tienes temperatura mas alta es la zon  "+ zonaMax);

                for (int j = 1; j <2 ; j++) {
                    for (int i = 0; i < sensores.length; i++) {
                        if (sensores[i][j] < 30) {
                            zonaHum = i + 1;
                        }
                        System.out.println("La zona qui tiene humedad menor que 30 es : " + zonaHum);
                    }

                }






            }
        }






