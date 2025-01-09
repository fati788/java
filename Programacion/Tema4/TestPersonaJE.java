package Programacion.Tema4;

public class TestPersonaJE {
    public static void main(String[] args) {
        Personaje jugador1 = new Personaje("Aragorn", "Guerrero", "hombre", 50 , Arma.TipoArma.ESPADA);
        Personaje jugador2 = new Personaje();

        jugador1.setClase("Enano");
        jugador2.setVida(75);

        System.out.println(jugador1);
        System.out.println(jugador2);


    }
}
