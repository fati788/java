package Programacion.Tema3.Prueba2024;
import java.util.Scanner;
public class ejercicio4 {

    public class Ejercicio2Opcion2 {
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

        public static int tiradaCubitus() {
            int dado;
            int total = 0;

            for(int i=0; i < 4; i++) {
                dado = generarNumeroAleatorio(10,1);
                System.out.print(dado + " ");
                if (dado % 2 != 0)
                    total += dado;
            }
            System.out.println();
            return total;
        }

        public static int tiradaHumerus() {
            int dado;
            int total = 0;

            for(int i=0; i < 3; i++) {
                dado = generarNumeroAleatorio(15,1);
                System.out.print(dado + " ");
                if (dado % 2 == 0)
                    total += dado;
            }
            System.out.println();
            return total;
        }

        public static void main(String[] args) {

            int numRondas = 0;
            int totalC=0, totalH=0, puntuacionC=0, puntuacionH=0;

            Scanner sc = new Scanner(System.in);

            System.out.println("Cuántas rondas quieres jugar?");
            numRondas = Integer.parseInt(sc.nextLine());

            for(int i=0; i < numRondas; i++) {
                System.out.println("Cubitus");
                puntuacionC = tiradaCubitus();
                System.out.println("Humerus");
                puntuacionH = tiradaHumerus();

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

    /*
Paso 1: Cálculo de la suma esperada de los valores obtenidos

    Para encontrar la suma esperada en cada ronda, usaremos:

    La probabilidad de obtener un número impar o par, según el jugador.
    El valor esperado de un número impar (o par) en cada tipo de dado.

Paso 2: Valor esperado de los números impares y pares

    Para el Jugador 1 (dados de 1 a 10):
        Números impares: 1,3,5,7,9.
        El valor promedio de estos números impares es:
        (1+3+5+7+9) / 5 =25 / 5 = 5
        Dado que la probabilidad de obtener un número impar es 0.5, podemos calcular la contribución promedio a la suma de cada dado lanzado como:
        E(suma por dado de Jugador 1)=0.5×5=2.5
        Como el Jugador 1 lanza 4 dados, la suma esperada total para él es:
        E(suma de Jugador 1) = 4 × 2.5 = 10

    Para el Jugador 2 (dados de 1 a 15):
        Números pares: 2,4,6,8,10,12,14.
        El valor promedio de estos números pares es:
        (2+4+6+8+10+12+14) / 7= 56 / 7 = 8
        Dado que la probabilidad de obtener un número par es aproximadamente 0.467, la contribución promedio a la suma de cada dado lanzado es:
        E(suma por dado de Jugador 2)=0.467×8≈3.736
        Como el Jugador 2 lanza 3 dados, la suma esperada total para él es:
        E(suma de Jugador 2) = 3 × 3.736 ≈ 11.208

Conclusión

En términos de la suma esperada de los valores, el Jugador 2 tiene una ligera ventaja sobre el Jugador 1:

    Suma esperada de Jugador 1: 10
    Suma esperada de Jugador 2: 11.208

Por lo tanto, si el ganador se determina en función de la suma de los números obtenidos, el Jugador 2 tiene una ventaja en probabilidades de ganar en promedio debido a que sus valores pares tienen un valor esperado más alto que los impares del Jugador 1.
     */


    }
}
