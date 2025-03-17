package Programacion.Prueba2Examen2025Fatima;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Agencia miAgencia = new Agencia();


        for (int i = 0; i < 5; i++) {
            CocheEstandar cocheEstandar1 = new CocheEstandar(1L+i,"BMW","BMW","Q1234Z",2018,
                    TipoCombustible.DIESEL,TipoCoches.SADAN,12.0,true);
            miAgencia.addCoche(cocheEstandar1);

        }
        for (int i = 0; i < 5; i++) {
            CocheEstandar cocheEstandar2 = new CocheEstandar(6L+i,"Seat","Seat","M123456A",2020,
                    TipoCombustible.HIBRIDO,TipoCoches.SUV,10.0,false);
            miAgencia.addCoche(cocheEstandar2);
        }
        for (int i = 0; i < 5; i++) {
            CochePremium cochePremium1 = new CochePremium(11L+i,"Fored","Fored","D1243Y",2012,TipoCombustible.ELECTRICO,TipoCoches.FURGONETA,34.0,true,true);
            miAgencia.addCoche(cochePremium1);
        }
        for (int i = 0; i < 5; i++) {
            CochePremium cochePremium2 = new CochePremium(16L+i,"Pegu","Pegu","W23562H",2016,TipoCombustible.GASOLINA,TipoCoches.DEPORTIVO,20.0,false,true);
           miAgencia.addCoche(cochePremium2);
        }
        Scanner sc = new Scanner(System.in);
        int opcion=0;


            do {
                System.out.println("-------Menu---------");
                System.out.println("1.Listar Coches");
                System.out.println("2.Listar Alquilers activos");
                System.out.println("3.Realizar Alquiler");
                System.out.println("4.Mostrar ingresos");
                System.out.println("5.Salir");
                System.out.println("--------------------");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        miAgencia.listarCochesDisponibles();
                        break;
                    case 2:
                        miAgencia.listarAlquilersActivos();
                        break;
                    case 3:
                        try {
                            System.out.println("Dime el nombre");
                        String nombre = sc.next();
                        System.out.println("Dime el apellidos");
                        String apellidos = sc.next();
                        System.out.println("Dime el dni");
                        String dni = sc.next();
                        System.out.println("Dime el email");
                        String email = sc.next();
                        System.out.println("Dime la direccion");
                        String direccion = sc.next();
                        System.out.println("Dime el telefono");
                        String telefono = sc.next();
                        System.out.println("Dime la licencia conducir");
                        String licenciaConducir = sc.next();
                        System.out.println("Dime el fecha obtenida de la liciencia (yyyy-MM-dd)");
                       LocalDate fechaObtencionLiciencia = LocalDate.parse(sc.next());
                        Cliente cliente = new Cliente(nombre, apellidos, dni, email, direccion, telefono, licenciaConducir, fechaObtencionLiciencia);
                        System.out.println("Dime el tipo del coche (SADAN o SUV o FURGONETA o DEPORTIVO)");
                        String tipo = sc.next();
                           TipoCoches tipoCoches = TipoCoches.valueOf(tipo);

                        System.out.println("Dime el fecha de inicio (yyyy-MM-dd)");
                       LocalDate fechaInicio = LocalDate.parse(sc.next());
                        System.out.println("Dime el fecha de fin (yyyy-MM-dd)");
                       LocalDate fechaFin = LocalDate.parse(sc.next());
                        try {
                            miAgencia.buscarCoche(TipoCoches.valueOf(tipo));
                           if (miAgencia.realizarAlquiler(cliente, TipoCoches.valueOf(tipo), fechaInicio, fechaFin)){
                               System.out.println("alquiler realizado");
                           }else {
                               System.out.println("alquiler no realizado");
                           }

                        } catch (NoHayCochesDisponible e) {
                            System.out.println(e.getMessage());
                        }
                        }catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("Los ingresos total: "+miAgencia.ModtrarIngresos());
                        break;
                    case 5:
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            } while (opcion != 5);


    }
}
