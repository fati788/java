package Programacion.Tema3.Arrays;

public class ejercici2 {
    public static double NumeroAleatorio(double min , double max){
        return (double) (Math.random()*(max-min+ 1)+min);
    }

    public static void main(String[] args) {

        // genera  de forma aleatoria un array de doubles con 100 elemos
        // los valores estan entre -100 y 100
        // pinta los valores
        // pinta los valores al revers
        // dime la media de todos las valores

        double numeroAleatorio[] = new double[30 ];
        double suma = 0;

        for (int i = 0; i < numeroAleatorio.length; i++) {
            numeroAleatorio[i] = NumeroAleatorio(-100,100);
        }

        for (int i = 0; i < numeroAleatorio.length; i++) {
            System.out.println(numeroAleatorio[i]);
            suma += numeroAleatorio[i];

        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (int i = numeroAleatorio.length - 1; i >= 0; i--) {
            System.out.println(numeroAleatorio[i]);
        }

        System.out.println("La media es : " + (suma/numeroAleatorio.length));

    }
}
