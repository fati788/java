package Programacion.Tema3.String;

public class Ejercicio7 {
    public static void main(String[] args) {

        //Cuenta las vocales del texto “Me gusta programar en Java los sábados por la mañana”
        String texto = "Me gusta programar en Java los sábados por la mañana";
        int contadorV = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a'  || texto.charAt(i) == 'A' || texto.charAt(i) == 'e'|| texto.charAt(i) ==  'E'  || texto.charAt(i) == 'i'
                    || texto.charAt(i) =='I' || texto.charAt(i) =='o'|| texto.charAt(i) =='O' || texto.charAt(i) =='u' || texto.charAt(i) =='U') {
                contadorV++;
            }
        }
        System.out.println("Hay " + contadorV + " vocales en el texto");
    }
}
