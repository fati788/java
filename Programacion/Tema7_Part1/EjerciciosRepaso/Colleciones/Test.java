package Programacion.Tema7_Part1.EjerciciosRepaso.Colleciones;

public class Test {
    public static void main(String[] args) {

        Baraja baraja = new Baraja();

        System.out.println(baraja.pintarCartas(baraja.sacarCartaArriba()));
        System.out.println(baraja.pintarCartas(baraja.sacarCartaArriba()));
        System.out.println(baraja.pintarCartas(baraja.sacarCartaAbajo()));
        baraja.ordenarPorNumero();
        System.out.println(baraja.toString());
        baraja.ordenarPorPalo();
        System.out.println(baraja.toString());
    }
}
