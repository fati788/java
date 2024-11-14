package Programacion.Tema3.Ejercicios;

public class ejercicio5 {
    public static double numeroAleatorio(int min, int max) {
        return (double) (Math.random() * (max - min+1) + min);
    }

    public static void main(String[] args) {

        double temperaturas[] = new double[1000];
        int suma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = numeroAleatorio(5, 50);
            suma += temperaturas[i];
        }
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("La media es : " + (suma/temperaturas.length));
        }



    }
}
