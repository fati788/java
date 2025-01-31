package Programacion.Practica1OPP.Ejercicio1;

public class TestJuego {
    public static void main(String[] args) {


        Jugador jugador= new Jugador("fati" ,Jugador.Clase.BRUJO);

        Arma espada = new Arma("Espada ", Arma.Tipo.ESPADA, 50, false);
        Arma hacha = new Arma("Hacha", Arma.Tipo.HACHA, 100, true);


        if (jugador.equipar(hacha)) {
            System.out.println("Hacha equipada.");
        } else {
            System.out.println("No se pudo equipar el hacha.");
        }
        if (jugador.equipar(espada)) {
            System.out.println("Espada equipada.");
        } else {
            System.out.println("No se pudo equipar la espada.");
        }

       /* jugador.equipar(hacha);
        jugador.equipar(espada);
        System.out.println(jugador);*/

        Monstruo monstruo1 = new Monstruo("Fantasma" , Monstruo.Clase.FANTASMA , 10);
        Monstruo monstruo2 = new Monstruo("Demonio" , Monstruo.Clase.DEMONIO, 7);
        Monstruo monstruo3 = new Monstruo("Skrall" , Monstruo.Clase.SKRALL , 3);
        Monstruo monstruo4 = new Monstruo("TRoll" , Monstruo.Clase.TROLL , 2);

        jugador.golpear(monstruo1);

        jugador.golpear(monstruo3);
        jugador.golpear(monstruo2);
        monstruo3.golpear(jugador);
        jugador.golpear(monstruo4);

        System.out.println(monstruo1);
        System.out.println(monstruo2);
        System.out.println(monstruo3);
        System.out.println(monstruo4);
        System.out.println(jugador);
    }
}
