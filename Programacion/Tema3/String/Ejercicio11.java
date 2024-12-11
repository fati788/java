package Programacion.Tema3.String;

public class Ejercicio11 {
    public static void main(String[] args) {
        //Elimina los espacios (intermedios también) de una cadena de texto.
        String cadena = " fatima  zohra el aoula";

        String[] toros = cadena.split(" ");
        for (int i = 0; i < toros.length; i++) {
            System.out.print(toros[i]);
        }
    }

}
