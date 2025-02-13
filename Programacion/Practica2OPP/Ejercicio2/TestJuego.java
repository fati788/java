package Programacion.Practica2OPP.Ejercicio2;

public class TestJuego {
    public static void main(String[] args) {


        Jugador jugador = new Jugador("Isa" , Jugador.Clase.BARBARO);
        Arma espada = new Arma("Espada ", Arma.Tipo.ESPADA, 100, true);

        jugador.equipar(espada);
        Monstruo monstruo = new Monstruo("fifo" , Monstruo.Clase.TROLL , 100);
        Partida partida = new Partida(jugador);
        System.out.println(partida);

       for (int i = 0; i < 3; i++) {
           partida.iniciarPartida();
           partida.turnoJugador();
           partida.turnoEnemigos();
       }

    }

}





