package Programacion.Tema3.Prueba2024;
import java.util.Scanner;

public class EjercicioTablero {

    public class Ejercicio1 {
        public static int generarNumeroAleatorio(int mayor, int menor) {
            return (int) (Math.random() * (mayor - menor + 1)) + menor;
        }

        public static void pintar(int matriz[][]) {
            for(int i=0; i<matriz.length; i++) {
                for(int j=0; j<matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }

        /**
         * Pide por teclado un número de columna por donde se va a soltar la ficha
         * @param numJugador
         * @return
         */
        public static int pedirFichaJugador(int numJugador) {
            int ficha;
            Scanner sc = new Scanner(System.in);
            System.out.println("Jugador " + numJugador);
            System.out.println("Dime columna donde poner ficha");
            ficha = Integer.parseInt(sc.nextLine());
            return ficha;
        }

        /**
         * Dado un tablero, la columna por donde se suelta la ficha y el número de
         * jugador, se suelta la ficha y pone un 1 o 2 (dependiendo del jugador), en
         * la fila correspondiente: la de abajo del todo, si todo son ceros, o la ficha
         * encima de 1 o un 2 que se encuentre
         * @param tablero
         * @param j
         * @param numJugador
         * @return
         */
        public static boolean colocarFicha(int tablero[][], int j, int numJugador) {
            boolean colocada = false;
            for(int i=0; i < tablero.length-1; i++) {
                if (tablero[i+1][j] != 0) {
                    colocada = true;
                    if (numJugador==1)
                        tablero[i][j] = 1;
                    else
                        tablero[i][j] = 2;
                    break;
                }
            }
            //En esa columna no hay ninguna ficha, entonces la pongo en el fondo
            if (colocada == false) {
                if (numJugador==1)
                    tablero[tablero.length-1][j] = 1;
                else
                    tablero[tablero.length-1][j] = 2;
            }

            return true;
        }

        public static boolean comprobarHV(int tablero[][], int jugador) {
            boolean ganador = false;

            //Comprobar ganador en horizontal
            for(int i=0; i<tablero.length; i++) {
                for(int j=0; j<tablero[i].length-3; j++) {
                    if (tablero[i][j] == jugador && tablero[i][j+1] == jugador
                            && tablero[i][j+2] == jugador && tablero[i][j+3] == jugador) {
                        ganador = true;
                        break;
                    }
                }
            }

            //Comprobar ganador en vertical
            for(int i=0; i<tablero.length-3; i++) {
                for(int j=0; j<tablero[i].length; j++) {
                    if (tablero[i][j] == jugador && tablero[i+1][j] == jugador
                            && tablero[i+2][j] == jugador && tablero[i+3][j] == jugador) {
                        ganador = true;
                        break;
                    }
                }
            }

            //Comprobar diagonal hacia la derecha
            for(int i=0; i<tablero.length-3; i++) {
                for(int j=0; j<tablero[i].length-3; j++) {
                    if (tablero[i][j] == jugador && tablero[i+1][j+1] == jugador
                            && tablero[i+2][j+2] == jugador && tablero[i+3][j+3] == jugador) {
                        ganador = true;
                        break;
                    }
                }
            }

            //Comprobar diagonal hacia la izquierda
            for(int i=0; i<tablero.length-3; i++) {
                for(int j=3; j<tablero[i].length; j++) {
                    if (tablero[i][j] == jugador && tablero[i+1][j-1] == jugador
                            && tablero[i+2][j-2] == jugador && tablero[i+3][j-3] == jugador) {
                        ganador = true;
                        break;
                    }
                }
            }

            return ganador;
        }



        public static void main(String[] args) {

            int j1, j2;
            int tablero[][] = new int[6][7];
            boolean winj1, winj2;

            pintar(tablero);

            //Jugar n turnos -> cambiarlo para comprobar ganador
            int n = 7;
            for(int i=0; i < n; i++) {
                //Jugador 1
                j1 = pedirFichaJugador(1);
                colocarFicha(tablero, j1, 1);

                winj1 = comprobarHV(tablero, 1);
                if (winj1) {
                    System.out.println("Ganador J1");
                    break;
                }

                //Jugador 2
                j2 = pedirFichaJugador(2);
                colocarFicha(tablero, j2, 2);

                winj2 = comprobarHV(tablero, 2);
                if (winj2) {
                    System.out.println("Ganador J2");
                    break;
                }

                //Pintar tablero
                pintar(tablero);

            }

            pintar(tablero);





        }
    }
}
