package Programacion.Tema3.Arrays;

public class ejercicio3 {
    /**
     * genera numero aleatoeio
     * @param min
     * @param max
     * @return
     */
    public static int  NumeroAleatorio(int  min , int max){
        return (int ) (Math.random()*(max-min+ 1)+min);
    }

    /**
     * devuelve true si un nomero es peimo , false si no primrp
     * @param numero
     * @return
     */
    public static boolean esPrimo(int numero) {
        boolean primo = true;

        for(int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0)
                primo = false;
        }

        return primo;
    }

    public static void main(String[] args) {

        // genera un array de 20 elemos enteros entre 1 y 1000
        // Muestra solo aquellos sean primos


        int numeros[] = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = NumeroAleatorio(1,1000);
        }

        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                System.out.println(numeros[i]);
            }
        }



    }
}
