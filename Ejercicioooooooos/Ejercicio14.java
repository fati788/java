package Ejercicioooooooos;

public class Ejercicio14 {

    public static String cifradoCesar(String text, int clave) {
        StringBuffer sb = new StringBuffer();
        char car;
        for(int i=0; i < text.length(); i++) {
            car = text.charAt(i);
            sb.append((char) (car + clave));
        }
        return sb.toString();
    }

    public static String descifradoCesar(String text, int clave) {
        StringBuffer sb = new StringBuffer();
        char car;
        for(int i=0; i < text.length(); i++) {
            car = text.charAt(i);
            sb.append((char) (car - clave));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String texto = "Esto es un mensaje secreto";
        //Hvw...
        //E + 3 -> char + int = int
        System.out.println(cifradoCesar(texto, 5));
        String mensajeCifrado = cifradoCesar(texto, 5);
        System.out.println(descifradoCesar(mensajeCifrado, 5));
    }
}
