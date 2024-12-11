package Programacion.Tema3.Prueba2024;
import java.util.Scanner;
public class XyO {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char[][] tablero = new char[3][3];
            inicializarTablero(tablero);

            char jugadorActual = 'X';
            boolean juegoTerminado = false;
            int movimientos = 0;

            while (!juegoTerminado && movimientos < 9) {
                mostrarTablero(tablero);
                System.out.println("Jugador " + jugadorActual + ", ingresa la fila y columna (0-2) para colocar tu marca:");

                int fila = -1, columna = -1;
                boolean posicionValida = false;

                // Validar la entrada
                while (!posicionValida) {
                    fila = scanner.nextInt();
                    columna = scanner.nextInt();

                    if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-') {
                        tablero[fila][columna] = jugadorActual;
                        posicionValida = true;
                    } else {
                        System.out.println("Posición no válida. Intenta de nuevo.");
                    }
                }

                // Verificar si hay un ganador
                if (hayGanador(tablero, jugadorActual)) {
                    mostrarTablero(tablero);
                    System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                    juegoTerminado = true;
                }

                // Cambiar al siguiente jugador
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                movimientos++;
            }

            // Si el tablero está lleno y no hay ganador
            if (!juegoTerminado) {
                mostrarTablero(tablero);
                System.out.println("¡El juego ha terminado en empate!");
            }

            scanner.close();
        }

        // Inicializa el tablero con '-'
        public static void inicializarTablero(char[][] tablero) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tablero[i][j] = '-';
                }
            }
        }

        // Muestra el tablero de juego
        public static void mostrarTablero(char[][] tablero) {
            System.out.println("Tablero de Juego:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Verifica si hay un ganador
        public static boolean hayGanador(char[][] tablero, char jugador) {
            // Verificar filas, columnas y diagonales
            for (int i = 0; i < 3; i++) {
                if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                        (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                    return true;
                }
            }

            if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
                    (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
                return true;
            }

            return false;
        }
    }


