package TerceraEvaluacion_Fatima.app;

import TerceraEvaluacion_Fatima.io.DAO;
import TerceraEvaluacion_Fatima.models.*;
import TerceraEvaluacion_Fatima.services.DockService;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DockService ds = DAO.cargarDesdeCSV();

        /*ds.addMuelle(new Muelle(7 , "Vera"));
       ds.getMuelles().forEach(System.out::println);

        ds.getReservas().forEach(System.out::println);
        DAO.guardarEnCsv(ds);*/

        String opcion = "";
        Scanner sc = new Scanner(System.in);

        do {
            try {

                System.out.println("------------MENU----------------");
                System.out.println("a. Listar Muelles");
                System.out.println("b. Listar reservas activas");
                System.out.println("c. Registrar llegada de camion");
                System.out.println("d. Registrar selida de camion");
                System.out.println("e. Mostrar historial de reservas");
                System.out.println("f. Mostrar tiempo de ocupacion por muelle");
                System.out.println("g. Salir");
                System.out.println("Elige una opcion");

                opcion = sc.nextLine();

                switch (opcion) {
                    case "a":
                        ds.getMuelles().forEach(System.out::println);

                        break;
                    case "b":
                        ds.getReservasActivas().forEach(System.out::println);
                        break;
                    case "c":
                        Camion camion = null;
                        System.out.println("Dime la matricula");
                        String matricula = sc.nextLine();
                        System.out.println("Dima la empresa");
                        String empresa = sc.nextLine();
                        System.out.println("Dime el tipo Mercancia");
                        String tipoMercancia = sc.nextLine();
                        System.out.println("Dime el peso");
                        double peso = Double.parseDouble(sc.nextLine());
                        boolean valida = false;
                        do {
                            System.out.println("Dime el tipo ( FRIGORIFICO/PELIGROSO)");
                            String tipo = sc.nextLine();
                            if (tipo.equals("FRIGORIFICO")) {
                                System.out.println("Dime la temperatura Objetivo ");
                                double temperatura = Double.parseDouble(sc.nextLine());
                                camion = new CamionFrigorifico(matricula, empresa, tipoMercancia, peso, temperatura);
                                valida = true;
                            } else if (tipo.equals("PELIGROSO")) {
                                System.out.println("Dime la clase de peligrosidad");
                                String clase = sc.nextLine();
                                camion = new CamionPeligroso(matricula, empresa, tipoMercancia, peso, clase);
                                valida = true;
                            }

                        } while (!valida);

                        System.out.println("Dime la hora de llegada de forma : yyyy-MM-ddTHH:mm:ss");
                        LocalDateTime llegada = LocalDateTime.parse(sc.nextLine());

                        try {
                            ds.cerateReserva(camion, llegada);
                        } catch (NoHayMullesLibres e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "d":

                        System.out.println("Dime el id de la reserva");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println("Dime la hora de salida de forma : yyyy-MM-ddTHH:mm:ss");
                        LocalDateTime hora = LocalDateTime.parse(sc.nextLine());
                        System.out.println(ds.liberarMuelle(id, hora));

                        break;
                    case "e":
                        ds.getHistorial().forEach(System.out::println);
                        break;
                    case "f":
                        ds.getNumeroReservasPorMuelle().forEach((k, v) -> System.out.println(k + ": " + v));
                        break;
                    case "g":
                        System.out.println("Adios");
                        DAO.guardarEnCsv(ds);
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while (!opcion.equals("g"));

        sc.close();
    }
}
