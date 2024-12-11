package Programacion.Tema3.String;

import java.util.Scanner;

public class Ejercico5 {
    public static void main(String[] args) {

        //iseña un programa en Java que solicite al usuario una cadena de caracteres y muestre por pantalla un
        //conteo de cuántas vocales, consonantes y espacios en blanco contiene la cadena introducida.
        String cadena ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cadena ");
        cadena = sc.nextLine();
        int contadorV = 0;
        int contadorC = 0;
        int contadorE = 0;

        for (int i = 0; i <cadena.length() ; i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A' || cadena.charAt(i) == 'e'|| cadena.charAt(i) ==  'E'  || cadena.charAt(i) == 'i' || cadena.charAt(i) =='I'
                    || cadena.charAt(i) =='o'|| cadena.charAt(i) =='O' || cadena.charAt(i) =='u' || cadena.charAt(i) =='U') {
                contadorV++;
            }else if (cadena.charAt(i)==' '){
                contadorE++;
            }else {
                contadorC++;
            }
        }
        System.out.println("hay " + contadorV + " vocales y " + contadorE + " espacios " + contadorC + " canstantes" );
    }
}
