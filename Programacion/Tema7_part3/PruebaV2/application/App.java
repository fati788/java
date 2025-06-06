package Programacion.Tema7_part3.PruebaV2.application;

import Programacion.Tema7_part3.PruebaV2.io.DAOTicketSoporte2;
import Programacion.Tema7_part3.PruebaV2.io.DAOTicketsSoporte;
import Programacion.Tema7_part3.PruebaV2.models.Especiadad;
import Programacion.Tema7_part3.PruebaV2.models.Tecnico;
import Programacion.Tema7_part3.PruebaV2.models.Usuario;
import Programacion.Tema7_part3.PruebaV2.services.ServecioSopotttte2;
import Programacion.Tema7_part3.PruebaV2.services.ServicioSoporte;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        try {
            ServecioSopotttte2 svs =DAOTicketSoporte2.cargarCSV();
            /*svs.getUsuarios().add(new Usuario(101 , "faty" , "El" , "faty@gmail.com" ,"12123", LocalDate.now()));
            svs.getUsuarios().forEach(System.out::println);

            System.out.println("---------------------Tecnicos----------------");
            svs.getTecnicos().add(new Tecnico(32, "Faty" , "Aoula" , "Faty@gmail.com" , "3123456" , Especiadad.INFORMATICA , 3));
            svs.getTecnicos().forEach(System.out::println);
            System.out.println("-------------Ticketes-----------------------");
            svs.getTicketSoportes().forEach(System.out::println);
             DAOTicketSoporte2.grabarCSV(svs);*/

            Scanner sc = new Scanner(System.in);
            int opcion = 0;

            do {

                System.out.println("-----MENU-------");
                System.out.println("1. Listar todos los tickets abiertos ");
                System.out.println("2. Listar tecnicos agrupados por especialidad");
                System.out.println("3. Mostrar total de tickets resueltos");
                System.out.println("4.Mostrar la media de resolucion de tickets pidiendo la perioridad ");
                System.out.println("5.Insertar ticket soporte");
                System.out.println("6.Eliminar ticket soporte");
                System.out.println("7.Salir y  Grabar datos");
                try {
                    opcion = Integer.parseInt(sc.nextLine());
                    switch (opcion) {
                        case 1:
                            svs.getTicketsAbbiertos().forEach(System.out::println);
                            break;
                        case 2:
                            svs.getTecnicosGroupByEspecialidad().forEach((k, v) -> {
                                System.out.println(k + "--> " + v);
                            });
                            break;
                        case 3:
                            System.out.println("Dime un perioridad");
                            int per =Integer.parseInt(sc.nextLine());
                            System.out.println(svs.getTotalTicketsResueltos(per));

                            break;
                        case 4:
                            System.out.println("Dime un perioridad");
                            int per2 = Integer.parseInt(sc.nextLine());
                            System.out.println(svs.getMediaResoulicionTickets(per2));
                            break;
                        case 5:

                            System.out.println("Dime el fecha de Creacion de forma: (yyyy-mm-dd)");
                            LocalDate fechaCreacion = LocalDate.parse(sc.next());
                            System.out.println("Dime un perioridad");
                            int per3 = Integer.parseInt(sc.nextLine());
                            System.out.println("Dime comentarios ");
                            String comentarios = sc.next();
                            System.out.println("Dime un id del usuario");
                            int inU = Integer.parseInt(sc.nextLine());
                            System.out.println("Dime un id del tecnico");
                            int inT = Integer.parseInt(sc.nextLine());

                            svs.addTicketSoporte(fechaCreacion, null, per3, comentarios, svs.finUsuarioById(inU)
                                    , svs.findTecnicoById(inT));

                            break;
                        case 6:
                            System.out.println("Dime el id del Ticket");
                            int id =Integer.parseInt(sc.nextLine());
                            svs.deleteTick(id);
                            break;
                        case 7:
                            System.out.println("Adios");
                            DAOTicketSoporte2.grabarCSV(svs);
                            break;
                        default:
                            System.out.println("Error opcion Invalida");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }while (opcion != 7);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
