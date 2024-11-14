package Programacion.Tema3.Arrays;

public class ejemplo1 {
    public static void main(String[] args) {

        final int size = 10;
        int numeros [] = new int[10];


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);

        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
