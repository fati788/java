import java.util.Scanner;
public class ejercicioIF2 {

        public static void main(String[] args) {
            // VidaJugador = 0-100
            // VidaMonstruo = 0-50
            // PuntosEspada = 0-50
            // RunaMagica = true/false

            // Es un combate entre el jugador y el monstruo.
            // Gana el jugador si:
            //      	- VidaJugador > 50 y PuntosEspada > 30
            //      	- VidaJugador < 50 y PuntosEspada > 50
            //      	- VidaJugador < 50 y PuntosEspada < 30 y RunaMagica = true

            // Gana el monstruo si:
            //      	- Si la vida del jugador es menor de 50 y los puntos
            //      	de la espada menor que 50,
            //      	O si la vida del jugador es menor de 50 y RunaMagica = false


            int vidaJ;
            int vidaM ;
            int puntosEspada ;
            boolean runMagia= false ;


            Scanner sc = new Scanner(System.in);
            System.out.println( "Dime la vida del jugador ");
            vidaJ = sc.nextInt();
            System.out.println("Dime la vida del Monstruo");
            vidaM = sc .nextInt();
            System.out.println("Dime las puntos espada");
            puntosEspada = sc .nextInt();

            if (vidaJ > 50 && puntosEspada > 30){
                System.out.println("Gana el jugador");
            }
            if (vidaJ < 50 && puntosEspada > 50 ){
                System.out.println("Gana el jugador");

            }
            if (vidaJ < 50 && puntosEspada < 30 && runMagia == true){
                System.out.println("Gana el jugador");
            }
            if (vidaJ < 50 && puntosEspada < 50) {
                System.out.println("Gana el monstruo");
            }else if (vidaJ < 50 && runMagia == false){
                System.out.println("Gana el monstruo");
            }
            sc .close();
        }

    }


