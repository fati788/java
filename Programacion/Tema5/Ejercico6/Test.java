package Programacion.Tema5.Ejercico6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

         Agenda agenda = new Agenda();

        Scanner sc = new Scanner(System.in);
        int opcion =0;



        while (opcion != 6) {

            System.out.println(" 1- Añadir nuevo contacto");
            System.out.println("2-Listar contactos");
            System.out.println("3-Buscar contacto");
            System.out.println("4-Eliminar contacto");
            System.out.println("5-Estado de la agenda");
            System.out.println("6-Salir");
            System.out.println("Elige una opcion : ");
            opcion = sc.nextInt();
               int tele;
               String nombre;
            switch (opcion) {
                case 1:
                    Contacto cont = new Contacto();
                    System.out.println(" 1- Añadir nuevo contacto");
                    System.out.println("Dime el telefono ");
                    tele = sc.nextInt();
                    cont.setTelefono(tele);
                    System.out.println("Dime el nombre ");
                    nombre = sc.next();
                    cont.setNombre(nombre);
                    agenda.addContacto(cont);
                    break;
                case 2:
                    System.out.println("2-Listar contactos");
                    System.out.println("hay " +  agenda.listarContactos() +  " contactos");
                    break;
                case 3:
                    Contacto cont1 = new Contacto();
                    System.out.println("3-Buscar contacto");
                    System.out.println("Dime el nombre ");
                    nombre = sc.next();
                    cont1.setNombre(nombre);

                    System.out.println(agenda.buscarContacto(nombre));

                    break;
                case 4:
                    Contacto cont4 = new Contacto();
                    System.out.println(" 1- Añadir nuevo contacto");
                    System.out.println("Dime el telefono ");
                    tele = sc.nextInt();
                    cont4.setTelefono(tele);
                    System.out.println("Dime el nombre ");
                    nombre = sc.next();
                    cont4.setNombre(nombre);

                    System.out.println("4-Eliminar contacto");
                    agenda.eliminarContacto(cont4);
                    break;
                case 5:
                    System.out.println("5-Estado de la agenda");
                    // agenda.existeContacto(contacto);
                    System.out.println(agenda);
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                default:

                    System.out.println("Opcion no valida");
            }
        }
    }
}
