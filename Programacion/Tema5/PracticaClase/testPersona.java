package Programacion.Tema5.PracticaClase;

import java.util.Scanner;

public class testPersona {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el nombre ");
        persona.setNombre(sc.nextLine());

        System.out.println("Dime el dni");
        persona.setDni(sc.nextLine());

        System.out.println("Dime la eadad");
        persona.setEdad(sc.nextInt());

        System.out.println("Dime el peso");
        persona.setPeso(sc.nextDouble());

        System.out.println("Dime el altura");
        persona.setAltura(sc.nextDouble());

        System.out.println("Dime el sexo");
        persona.setSexo(sc.next().charAt(0));

        System.out.println(persona);


        if ( persona.esMayorEdad()){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("No es mayor de edad");
        }
        System.out.println(persona.calcularMC());
        Persona persona2 = new Persona("Fatima" , 19, persona.getDni(), 'M' , 67.83 , 1.60);
        System.out.println(persona2);

        if (persona.equals(persona2)) {
            System.out.println("Son iguales ");
        }else {
            System.out.println("Son difirentes");
        }



    }
}
