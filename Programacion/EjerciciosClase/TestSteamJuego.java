package Programacion.EjerciciosClase;

public class TestSteamJuego {
    public static void main(String[] args) {
        SteamJuego jugador1 = new SteamJuego("fati" , "alumna" , 12.4 , 15,1200.1 , "puesto1");
        SteamJuego jugador2 = new SteamJuego("noha" , "alumna" , 21.4 , 20,1200.1 , "puesto1");
        SteamJuego jugador3 = new SteamJuego("Alex" , "alumno" , 31.4 , 31,1200.1 , "puesto1");
        System.out.println(jugador1);
        System.out.println(jugador2);
        System.out.println(jugador3);
        jugador1.jugadoresDia(111);
        jugador2.jugadoresDia(80);
        jugador3.jugadoresDia(75);
        System.out.println(jugador1.getMediaJugadorDiarios());
        System.out.println(jugador2.getMediaJugadorDiarios());
        System.out.println(jugador3.getMediaJugadorDiarios());
    }
}
