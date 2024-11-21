package Programacion.Tema3.Ejercicios;

public class ejerccicioC2 {
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
        //2. Simulación sensores de movimiento
        //Un edificio tiene una matriz de sensores de movimiento simulando una sala.
        //Tendría una matriz de 5x5, total 25 sensores. Si tiene un 0 una casilla
        //es que no hay movimiento, si tiene 1, es que sí hay movimiento
        //- Genera aleatoriamente el estado de los sensores de la sala
        //- Calcula cuántos sensores están activados
        //- Identifica si hay una región de movimiento contínuo, es decir al menos un bloque 2x2 con
        //todos los sensores activados.
        int movimiento[][] = new int[5][5];
        int contador = 0;
        for (int i = 0; i < movimiento.length; i++) {
            for (int j = 0; j < movimiento[0].length; j++) {
                movimiento[i][j] = NumeroAleatorio(0 , 1);

            }
        }
        pintar(movimiento);
        for (int i = 0; i < movimiento.length; i++) {
            for (int j = 0; j < movimiento[0].length; j++) {
                if (movimiento[i][j] >0) {
                    contador++;

                }
            }
        }
        System.out.println("Hay " + contador + " sensores activados ");

        boolean continua = false;
        for (int i = 0; i < movimiento.length-1; i++) {
            for (int j = 0; j < movimiento[0].length-1; j++) {

                if ( (movimiento[i][j] ==1 && movimiento[i][j+1] ==1 ) && (movimiento[i+1][j] ==1 && movimiento[i+1][j+1] ==1 ) ) {
                    continua = true;
                }

            }
        }
        if (continua == true) {
            System.out.println(" la region tiene movimiento continua");

        }
    }
}
