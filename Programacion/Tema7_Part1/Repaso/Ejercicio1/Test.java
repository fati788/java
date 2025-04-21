package Programacion.Tema7_Part1.Repaso.Ejercicio1;

public class Test {
    public static void main(String[] args) {

        Diccionario miDiccionario = new Diccionario();

        miDiccionario.addEntrada(new Entrada("casa","house"));
        miDiccionario.addEntrada(new Entrada("madre","mother"));
        miDiccionario.addEntrada(new Entrada("padre","father"));
        miDiccionario.addEntrada(new Entrada("azul","blue"));

        miDiccionario.addEntrada(new Entrada("rojo","red"));

        miDiccionario.listarPalabras();
        System.out.println(miDiccionario.buscarEntrada("madre"));
    }
}
