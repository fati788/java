package Programacion.Practica2OPP.Ejercicio2;

import java.util.Scanner;

public class TestCiclistas {
    public static void main(String[] args) {

       Equipo miEquipo = new Equipo("Fati" , "Marruecos");

        Scanner sc = new Scanner(System.in);
        int opcion=0 ;
        do {
            System.out.println("Equipo:");
            System.out.println("********************************************");
            System.out.println("1- Imprimir datos del equipo");
            System.out.println("2- Anadir un ciclista al equipo ");
            System.out.println("3-Calcular el tiempo de los ciclistas del equipo");
            System.out.println("4- Listar nombres de los ciclistas");
            System.out.println("5- Buscar ciclista");
            System.out.println("6- Salir");
            System.out.println("Elige opcion (del 1 al 6 ) : ");
            opcion = Integer.parseInt(sc.nextLine());


            switch (opcion) {
                case 1:
                    miEquipo.imprimir();
                    break;
                case 2:
                    System.out.println("Dime el identificador: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Dime el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Dime el tiempo Acumulado: ");
                    int tiempoAcumulado = Integer.parseInt(sc.nextLine());

                    System.out.println("Dime el tipo del ciclista : ");
                    String tipo = sc.nextLine();

                    if (tipo.equalsIgnoreCase("Velocista")) {
                        System.out.println("Dime el potoncia promedio");
                        double potoncia = Double.parseDouble(sc.nextLine());
                        System.out.println("Dime el velocidad promedio: ");
                        double velocidad = Double.parseDouble(sc.nextLine());
                        miEquipo.addCiclista(new Velocista(id , nombre , tiempoAcumulado , potoncia , velocidad ));
                        System.out.println("Velocidad añadida");
                    } else if (tipo.equalsIgnoreCase("Escalador")) {
                        System.out.println("Dime el acceleracion promedio");
                            float acceleracion = sc.nextFloat();
                        System.out.println("Dime el grado rampa: ");
                        float grado = sc.nextFloat();
                        miEquipo.addCiclista(new Escalador(id , nombre , tiempoAcumulado,acceleracion , grado));
                        System.out.println("Escalador añadida");
                    } else if (tipo.equalsIgnoreCase("Contrarrelojista")) {
                        System.out.println("Dime la velocidad maxima");
                        double velocidadMaxima = Double.parseDouble(sc.nextLine());
                        miEquipo.addCiclista(new Contrarrelojista(id , nombre , tiempoAcumulado , velocidadMaxima));
                        System.out.println("Contrarrelojista añadida");

                    }else {
                        System.out.println("No existe este tipo de ciclista");
                    }
                    break;
                case 3:
                    miEquipo.CalcularTiempoCiclistas();
                    break;
                case 4:
                    miEquipo.listarNombres();
                    break;
                case 5:
                    System.out.println("Dime el identificador para buscar: ");
                    id=Integer.parseInt(sc.nextLine());
                    System.out.println(miEquipo.buscarCiclista(id));
                    if (miEquipo.buscarCiclista(id) == null) {
                        System.out.println("Ciclicta no encontrada");

                    }
                    break;
                case 6:
                    System.out.println("Adios.");
                    break;
                default:
                    System.out.println("Opcion no valida introduce numero entre 1 y 6" );

            }
        }while (opcion != 6);
    }
}
