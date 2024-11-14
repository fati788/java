package Programacion.Tema3.Arrays;

public class ejercicio5 {
    public static int  NumeroAleatorio(int  min , int max){
        return (int ) (Math.random()*(max-min+ 1)+min);
    }
    public static void main(String[] args) {

        // vamos simular que tenemos un sensor de temperatura en una
        // plantacion de tomates  ( 15 y 55 grados )
        // el dispositivo toma la temperatura 120 veces al dia
        // simula el comportamiento del senor con un array de double
        // que respuesta la temeratora tomada por el senor


        // si ña temperatura media actual es superior a un (35 grados )
        // debe saltar un alarma (throw exception )
        double temperaturas[] = new double[120];
        double suma = 0;

        try {
            for (int i = 0; i < temperaturas.length; i++) {
                temperaturas[i] = NumeroAleatorio(50, 15);
                suma += temperaturas[i];

                System.out.println(temperaturas[i] + " -> media = " + (suma / (i + 1)));

                //Ver si la media actual supera 35 grados
                if ((suma / (i + 1)) > 35) {
                    throw new Exception("Alarma, se ha superado el umbral");
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
