package Programacion.Tema3.Prueba2024;
import java.util.Scanner;
public class opcion3 {

    public class Ejercicio2Opcion1 {

        /**
         * Genera un número aleatorio entre dos números
         * @param mayor
         * @param menor
         * @return
         */
        public static int generarNumeroAleatorio(int mayor, int menor) {
            int numero = (int) (Math.random() * (mayor - menor + 1)) + menor;

            return numero;
        }

        /**
         * Determina si 5 números son o no iguales
         * @param d1
         * @param d2
         * @param d3
         * @param d4
         * @param d5
         * @return
         */
        public static boolean sonIguales(int d1, int d2, int d3, int d4, int d5) {
            if (d1 == d2 && d1 == d3 && d1 == d4 && d1 == d5)
                return true;
            else
                return false;
        }

        public static boolean escalera1(int a, int b, int c, int d, int e) {
            return (a == 1 || b == 1 || c == 1 || d == 1 || e == 1) &&
                    (a == 2 || b == 2 || c == 2 || d == 2 || e == 2) &&
                    (a == 3 || b == 3 || c == 3 || d == 3 || e == 3) &&
                    (a == 4 || b == 4 || c == 4 || d == 4 || e == 4) &&
                    (a == 5 || b == 5 || c == 5 || d == 5 || e == 5);
        }

        public static boolean escalera2(int a, int b, int c, int d, int e) {
            return (a == 6 || b == 6 || c == 6 || d == 6 || e == 6) &&
                    (a == 2 || b == 2 || c == 2 || d == 2 || e == 2) &&
                    (a == 3 || b == 3 || c == 3 || d == 3 || e == 3) &&
                    (a == 4 || b == 4 || c == 4 || d == 4 || e == 4) &&
                    (a == 5 || b == 5 || c == 5 || d == 5 || e == 5);
        }

        public static int tirada() {
            int total=0;
            int dado1, dado2, dado3, dado4, dado5;

            try {
                dado1 = generarNumeroAleatorio(6,1);
                dado2 = generarNumeroAleatorio(6,1);
                dado3 = generarNumeroAleatorio(6,1);
                dado4 = generarNumeroAleatorio(6,1);
                dado5 = generarNumeroAleatorio(6,1);

                System.out.println("Tirada: " + dado1 + " " + dado2 + " " + dado3 + " " + dado4 + " " + dado5);
                total = dado1 + dado2 + dado3 + dado4 + dado5;

                //Bonus por dados iguales
                if (sonIguales(dado1, dado2, dado3, dado4, dado5)) {
                    total += 20;
                }

                //Has sacado 1,2,3,4,5
                if (escalera1(dado1, dado2, dado3, dado4, dado5) ||
                        escalera2(dado1, dado2, dado3, dado4, dado5)) {
                    total += 10;
                    (new Scanner(System.in)).nextLine();
                }
                //Penalización por suma menos que 8
                if (dado1+dado2+dado3+dado4+dado5 < 8) {
                    total -= 5;
                }
            } catch (Exception e) {
                System.out.println("Error en las tiradas");
            }

            return total;
        }

        public static void main(String[] args) {
            int numRondas = 0;
            int totalC=0, totalH=0, puntuacionC=0, puntuacionH=0;

            Scanner sc = new Scanner(System.in);

            System.out.println("Cuántas rondas quieres jugar?");
            numRondas = Integer.parseInt(sc.nextLine());

            for(int i=0; i < numRondas; i++) {
                puntuacionC = tirada();
                puntuacionH = tirada();

                System.out.println("Puntuación Cubitus = " + puntuacionC);
                System.out.println("Puntuación Humerus = " + puntuacionH);
                if (puntuacionC > puntuacionH) {
                    totalC++;
                } else if (puntuacionC < puntuacionH) {
                    totalH++;
                }

            }

            System.out.println("Total Cubitus " + totalC);
            System.out.println("Total Humerus " + totalH);
            if (totalC > totalH) {
                System.out.println("Ganador Cubitus");
            } else if (totalC < totalH) {
                System.out.println("Ganador Humerus");
            } else {
                System.out.println("Han empatado");
            }
        }
    }
}
