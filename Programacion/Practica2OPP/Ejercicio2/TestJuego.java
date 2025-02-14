package Programacion.Practica2OPP.Ejercicio2;

public class TestJuego {
    public static void main(String[] args) {

        Jugador jugador = new Jugador("Isa" , Jugador.Clase.BARBARO);

        Partida partida = new Partida(jugador);
        System.out.println(partida);

        for (int i = 0; i < 30; i++) {
            System.out.println("Turno jugador: ");
            partida.turnoJugador();
            System.out.println("Turno enemigos: ");
            partida.turnoEnemigos();
            if (jugador.getSalud()<=0 ){
                break;
            }

        }
        System.out.println(partida);
        if (jugador.getSalud()>0){
            System.out.println("El jugador gana la partida");
        }else {
            System.out.println("El jugador ha perdido la partida");
        }




    }

}





