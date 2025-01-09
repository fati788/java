package Programacion.Tema4;

import java.util.Scanner;

public class testPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Persona per1 = new Persona("fatima", 18, 1.60);
        Persona per2 = new Persona("noouhaila", 22, 1.60);
        Persona per3 = new Persona();
        System.out.println("Dime el nombre: ");
        per1.setNombre(sc.nextLine());

        per1.setNombre("zohra");
        per2.setAltura(1.78);
       /* System.out.println(per1.getNombre());
        System.out.println(per2.getNombre());
        System.out.println(per2.getAltura());*/
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
    }
}
