package Programacion.Tema3.Prueba2024;
import java.util.Scanner;
public class opcion2 {

    public class Ejercicio1Opcion2 {

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

        public static void main(String[] args) {
            int numero=0;
            int opcion=0;
            int intentos=0;
            int max=100, min=1;

            //Búsqueda binaria
            Scanner sc = new Scanner(System.in);
            System.out.println("Piensa un número entre 1 y 100, voy a intentar averiguarlo");
            System.out.println("Pulsa una tecla para continuar");
            sc.nextLine();

            do {
                System.out.println(max + " - " + min);
                numero = generarNumeroAleatorio(max, min);
                intentos++;

                System.out.println("¿Tu número es " + numero + "?");
                System.out.println("1. Sí, acertaste");
                System.out.println("2. Mayor");
                System.out.println("3. Menor");

                try {
                    opcion = Integer.parseInt(sc.nextLine().trim());
                    switch (opcion) {
                        case 1:
                            System.out.println("Soy un máquina, he tardado " + intentos + " intentos");
                            break;
                        case 2:
                            min = numero+1;
                            break;
                        case 3:
                            max = numero-1;
                            break;
                        default:
                            System.out.println("Opción incorrecta");
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Opción incorrecta");
                }
            } while (opcion != 1);

        }
    }
}
