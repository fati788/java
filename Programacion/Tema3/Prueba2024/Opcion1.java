package Programacion.Tema3.Prueba2024;
import java.util.Scanner;
public class Opcion1 {
    public class Ejercicio1Opcion1 {

        /**
         * Suma los dígitos por separado de un número
         * @param num
         * @return
         */
        public static int sumaDigitos(int num) {
            int total=0;
            do {
                //System.out.println(num % 10 + " - " + num);
                total += num % 10;
                num = num / 10;
            }  while (num > 0);

            return total;
        }

        /**
         * Devuelve true si num es Primo, false en caso contrario
         * @param num
         * @return
         */
        public static boolean esPrimo(int num) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break; //Una vez encuentre un divisor que termine
                }
            }
            return esPrimo;
        }


        public static void main(String[] args) {
            int numero=-1, opcion=0;
            int suma=0;
            boolean primo=false;

            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un número");

            try {
                numero = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Error introduciendo número");
            }

            while (opcion != 4 && numero > -1) {
                System.out.println("1. Suma de dígitos");
                System.out.println("2. Es primo o no");
                System.out.println("3. Longitud circunferencia");
                System.out.println("4. Salir");
                System.out.println("Introduce opción");

                try {
                    opcion = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException ex) {
                    System.out.println("Error introduciendo opción");
                }

                switch (opcion) {
                    case 1:
                        suma = sumaDigitos(numero);
                        System.out.println("La suma de los dígitos es " + suma);
                        break;
                    case 2:
                        primo = esPrimo(numero);
                        System.out.println("El número es primo: " + primo);
                        break;
                    case 3:
                        System.out.println("La longitud de la circunferencia es " + (2 * Math.PI * numero));
                        break;
                    case 4:
                        System.out.println("Gracias por usar este programa");
                        break;
                    default:
                        System.out.println("Opción incorrecta (1 - 4)");
                }

                System.out.println("Pulsa una tecla para continuar");
                sc.nextLine();
            }


        }
    }
}
