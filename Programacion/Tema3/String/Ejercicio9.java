package Programacion.Tema3.String;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        //Crear una cadena de texto formada por tres cadenas “una”, “dos” y “tres” usando StringBuilder.

        String cad1 ;
        String cad2 ;
        String cad3 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la peimera cadena ");
        cad1 = sc.nextLine();
        System.out.println("Dime la segunga cadena ");
        cad2 = sc.nextLine();
        System.out.println("Dime la tercera cadena ");
        cad3 = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(cad1);
        sb.append(cad2);
        sb.append(cad3);
        System.out.println(sb.toString());

        StringBuffer sb2 = new StringBuffer();
        sb2.append(cad1);
        sb2.append(cad2);
        sb2.append(cad3);
        System.out.println(sb2.toString());
    }
}
