package Programacion.Tema3.Prueba2024;
import java.util.Arrays;
public class busquedaBinaria {

        public static int generarNumeroAleatorio(int mayor, int menor) {
            return (int) (Math.random() * (mayor - menor + 1)) + menor;
        }

        public static void main(String[] args) {

            int numeros[] = new int[100000];
            for(int i=0; i < numeros.length; i++) {
                numeros[i] = generarNumeroAleatorio(100000, 1);
            }

            //Ordenar el array
            Arrays.sort(numeros);

        /*
        for(int i=0; i < numeros.length; i++)
            System.out.print(numeros[i] + " ");
        */

            System.out.println();
            double t1 = System.currentTimeMillis();
            int buscar = 34560;
            for(int i=0; i < numeros.length; i++) {
                if (numeros[i] == buscar) {
                    System.out.println("Encontrado en la posición " + i);
                    break;
                }
            }
            System.out.println(System.currentTimeMillis() - t1);

            t1 = System.currentTimeMillis();
            int posicion = Arrays.binarySearch(numeros,buscar);
            System.out.println(System.currentTimeMillis() - t1);
            System.out.println("Encontrado en la posición " + posicion);

        }
    }

