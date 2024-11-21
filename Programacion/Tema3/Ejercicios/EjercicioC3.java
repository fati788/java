package Programacion.Tema3.Ejercicios;

public class EjercicioC3 {
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
    public static void main(String[] args) {
        //3. Simulación de contaminación
        //Tenemos una ciudad dividida en cuadrantes, una matriz NxM, decide tú.
        //Cada celda contiene un número entre 0 y 100 indicando el nivel de contaminación.
        //Pinta una nueva matriz, marcando con un 0 las zonas con contaminación menor a un umbral,
        //p. ej. 10, con un 1 las zonas entre 10 y 80, y con un 2 las zonas con más de 80.
        //Dime las coordenadas (i,j) de las zonas con más de 80 de contaminación
        //Dime también el nivel de contaminación promedio de la ciudad
        int numeros[][] = new int[3][3];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = NumeroAleatorio(0,100);
            }
        }
        pintar(numeros);
        System.out.println(" las coordenadas (i,j) de las zonas con más de 80 de contaminación : ");
        int nuevo[][] = new int[3][3];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                if (numeros[i][j] <=10) {
                    nuevo[i][j] = 0;

                }else if (numeros[i][j] > 10 && numeros[i][j] < 80) {
                    nuevo[i][j] = 1;
                }else if (numeros[i][j] >= 80) {
                    nuevo[i][j] = 2;
                    System.out.println("("+i +" , " + j+")");
                }
            }

        }
        System.out.println();
        pintar(nuevo);
        int suma = 0 ;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                suma += numeros[i][j];
            }
        }
        System.out.println("El nivel primedio es : " + (suma/numeros.length));
    }
}
