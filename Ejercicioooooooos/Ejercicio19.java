package Ejercicioooooooos;

public class Ejercicio19 {
    public static void pintar(int pila[]) {
        for(int i=0; i<pila.length; i++) {
            System.out.print(pila[i]+ " ");
        }
        System.out.println();
    }

    public static int[] crearPila() {
        int pila[] = new int[20];
        return pila;
    }

    public static void insertar(int pila[], int elemento) {
        for(int i=0; i<pila.length; i++) {
            if (pila[i] == 0) {
                pila[i] = elemento;
                break;
            }
        }
    }

    public static int sacar(int pila[]) {
        int elemento;
        for(int i=pila.length-1; i>=0; i--) {
            if (pila[i] != 0) {
                elemento = pila[i];
                pila[i] = 0;
                return elemento;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int pila[] = crearPila();
        pintar(pila);
        insertar(pila,6);
        insertar(pila, 5);
        insertar(pila, 11);
        insertar(pila, 25);
        pintar(pila);
        System.out.println(sacar(pila));
        System.out.println(sacar(pila));
        pintar(pila);


    }
}
