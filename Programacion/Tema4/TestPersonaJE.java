package Programacion.Tema4;

public class TestPersonaJE {
    public static void main(String[] args) {
        Arma martillo = new Arma("Martillo " , 20 , Arma.TipoArma.MARTILLO);
        Arma espada =  new Arma("Espada " , 20 , Arma.TipoArma.ESPADA);
        Personaje jugador1 = new Personaje("Aragorn", "Guerrero", "hombre", 50 ,martillo);

        Personaje jugador2 = new Personaje( "fatima" ,"ffg" , "mujer" , 30 , espada);

        jugador1.setClase("Enano");
        jugador2.setVida(75);
        System.out.println("Antes golpear");
        System.out.println(jugador1);
        System.out.println(jugador2);
        System.out.println("Despuis golpear");
          jugador1.golpear(jugador2);
        System.out.println(jugador1);
        System.out.println(jugador2);


    }
}
