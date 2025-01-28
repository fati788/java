package Programacion.Practica1OPP.Ejercicio1;

public class TestJuego {
    public static void main(String[] args) {

         /*Crea una aplicación TestJuego, crea un Jugador, equípalo con las armas que desees. Luego crea cuatro monstruos
           diferentes con niveles y puntos de daño diferentes, y prueba a que combatan contra el jugador. Prueba que
             algunos monstruos sean fáciles para ver como el jugador sube su experiencia y nivel.
               2*/
        Jugador jugador= new Jugador("fati" ,Jugador.Clase.BRUJO);

        Arma espada = new Arma("Espada ", Arma.Tipo.ESPADA, 50, false);
        Arma hacha = new Arma("Hacha", Arma.Tipo.HACHA, 100, true);

        jugador.equipqr(hacha);
        jugador.equipqr(espada);
        System.out.println(jugador);

        Monstruo monstruo1 = new Monstruo("Fantasma" , Monstruo.Clase.FANTASMA , 10);
        Monstruo monstruo2 = new Monstruo("Demonio" , Monstruo.Clase.DEMONIO, 7);
        Monstruo monstruo3 = new Monstruo("Skrall" , Monstruo.Clase.SKRALL , 3);
        Monstruo monstruo4 = new Monstruo("TRoll" , Monstruo.Clase.TROLL , 2);

        jugador.golear(monstruo1);

        jugador.golear(monstruo3);
        jugador.golear(monstruo2);
        monstruo3.golpear(jugador);
        jugador.golear(monstruo4);

        System.out.println(monstruo1);
        System.out.println(monstruo2);
        System.out.println(monstruo3);
        System.out.println(monstruo4);
        System.out.println(jugador);
    }
}
