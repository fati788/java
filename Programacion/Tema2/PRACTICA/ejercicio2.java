package Programacion.Tema2.PRACTICA;

import java.util.Scanner;

public class ejercicio2 {
    public static int NumeroAleatorio(int min , int max){
        return (int)(Math.random()*(max-min+ 1)+min);
    }
    public static void main(String[] args) {
        /*Marcus Cubitus y Julius Humerus, legionarios apasionados por los juegos de dados,
aprovechan los días cada vez más largos del mes de Iunius para probar nuevos juegos.
Pide por teclado un número de turnos que van a jugar. En cada turno Cubitus lanza cuatro
dados de 10 caras y se anota la suma de los valores impares obtenidos, mientras que el
Humerus lanza tres dados de 15 caras y se anota la suma de los valores pares obtenidos.
Gana el turno el jugador que obtenga más puntos y gana la partida el jugador que haya
ganado más turnos.
¿Es un juego equitativo? ¿Cómo lo comprobarías*/
        int turno ;
        int dado1C, dado2C,dado3C,dado4C;
        int dado1H, dado2H,dado3H;
        int sumaPar = 0 ;
        int sumaImpar = 0 ;
        int contadorC=0;
        int contadorH=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero de turnos que quieres jugqr ?");
        turno = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= turno ; i++) {
       dado1C = NumeroAleatorio(1,10);
       dado2C = NumeroAleatorio(1,10);
       dado3C = NumeroAleatorio(1,10);
       dado4C = NumeroAleatorio(1,10);
            System.out.println("Cubitus: " + dado1C + " , " + dado2C + " , " + dado3C + " , " + dado4C);
       dado1H = NumeroAleatorio(1,15);
       dado2H = NumeroAleatorio(1,15);
       dado3H = NumeroAleatorio(1,15);
            System.out.println("Humerus : " + dado1H + " , " + dado2H + " , " + dado3H);

            if (dado1C % 2 != 0) sumaImpar += dado1C;
            if ( dado2C %2 != 0 ) sumaImpar+= dado2C;
            if (dado3C %2 != 0 ) sumaImpar += dado3C;
            if (dado4C %2 != 0 ) sumaImpar += dado4C;

            System.out.println(sumaImpar);

            if (dado1H % 2 == 0) sumaPar += dado1H;
            if (dado2H % 2 == 0) sumaPar += dado2H;
            if (dado3H % 2 == 0) sumaPar += dado3H;
            System.out.println(sumaPar);
            if (sumaPar >sumaImpar){
                System.out.println("El Humeros gana el turno : " + i);
                contadorH++;

            } else if (sumaImpar >sumaPar) {
                System.out.println("El Cubitus  gana el turno : " + i);
                contadorC++;
            }else {
                System.out.println("Empate ");
            }
            sumaImpar= 0;
            sumaPar = 0;
        }
        if (contadorC == contadorH){
            System.out.println("Empate ");
        } else if (contadorC > contadorH) {
            System.out.println("El Cubitus gana este partida con  " + contadorC + " Puntos ");

        } else  {
            System.out.println("El Humeros gana este partida con " + contadorH + " Puntos ");

        }
        /* ¿Es un juego equitativo? ¿Cómo lo comprobarías?*/
        // Es un juego equitativo porque el cubitus tira 4 dados de 10 caras y el humeros tira 3 dados de 15 caras
        // el dados del cubitus tiene menos caras pero el tira 4 ves , mientras el dado del humeros tiene mas caras pero tira solo n3 veces
        // lo comprobarías el resultado final el cubitus gana partida el mismo que el humerus


    }
}
