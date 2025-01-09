package primeraEvaluacion;

public class Ejercicio2 {
    public static int numeroAleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1))+min;
    }
   /* public static int tiradaDado(){
       int  dado = numeroAleatorio(1,6);
        return dado;
    }*/
   /* public static void dadoFuego(){
        int dado1 = tiradaDado();
        System.out.println("dado1: " + dado1);
       int  dado2 = tiradaDado();
        System.out.println("dado2: " + dado2);


    }*/
    public static void main(String[] args) {
        int putVida1=40;
        int putVida2=40;
        int contador=-1;

        int ronda;
        do {

            ronda = numeroAleatorio(1, 5);
            int dado1 = numeroAleatorio(1, 6);
            int dado2 = numeroAleatorio(1, 6);
            boolean escudo= false;
            switch (ronda) {
                case 1:
                    System.out.println("Dado de Fuego:");
                    System.out.println("dado 1 " + dado1 + " dado 2 " + dado2);
                    if (dado1 < dado2) {
                        putVida1 = putVida1 - (dado2 - dado1);
                    }
                    if (dado2 < dado1) {
                        putVida2 = putVida2 - (dado1 - dado2);
                    }
                    contador++;
                    System.out.println("jugador1 " + putVida1 + " y jugador 2 " + putVida2);

                    break;
                case 2:
                    System.out.println("Dado de Curación");
                    System.out.println("dado 1 " + dado1 + " dado 2 " + dado2);
                    putVida1 = putVida1+ dado1;
                    putVida2 = putVida2+dado2;
                    System.out.println("jugador1 " + putVida1 + " y jugador 2 " + putVida2);
                   contador++;
                    break;
                case 3:
                    System.out.println("Dado de Robo:");
                    System.out.println("dado 1 " + dado1 + " dado 2 " + dado2);
                    if (dado1 > dado2) {
                        putVida1 = putVida1 + (dado1 / 2);
                        putVida2 = putVida2 - (dado1 / 2);
                    }
                    if (dado2 > dado1) {
                        putVida2 = putVida2 + (dado2 / 2);
                        putVida1 = putVida1 - (dado2 / 2);
                    }
                    System.out.println("jugador1 " + putVida1 + " y jugador 2 " + putVida2);
                    contador++;
                    break;

                case 4:
                    System.out.println("Dado Explosivo: ");
                    System.out.println("dado 1 " + dado1 + " dado 2 " + dado2);
                    if (dado1 == 6 && dado2 == 6) {
                        putVida1 = putVida1;
                        putVida2 = putVida2;
                    }
                    if (dado1 == 6) {
                        putVida2 = putVida2 - 10;

                    }
                    if (dado2 == 6) {
                        putVida1 = putVida1 - 6;
                    }
                    System.out.println("jugador1 " + putVida1 + " y jugador 2 " + putVida2);
                       contador++;
                    break;
                case 5:
                    if (putVida1>putVida2) {
                        escudo = true;
                    }
                    contador++;
                    break;

            }
        }while ((putVida1!=0 && putVida2!=0) && contador!=5 );
        if (putVida1>putVida2) {
            System.out.println("Gana el jugador 1 ");
        } else if (putVida2>putVida1) {
            System.out.println("Gana el jugador 2 ");

        }


    }
}
