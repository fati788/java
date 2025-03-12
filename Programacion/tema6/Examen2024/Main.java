package Programacion.tema6.Examen2024;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Atrampe miAtrampe = new Atrampe();

         //Anadir vuelo
        for (int i = 0; i < 10; i++) {
            Vuelo vuelo1 = new Vuelo("jsdgq","marruecos","espana", LocalDate.now(), LocalTime.now(),120.0,30);
            miAtrampe.addVuelo(vuelo1);
        }
        Vuelo vuelo = miAtrampe.getVuelos().get(5);
        Pasajero ps1 = new Pasajero(1L,"pasa1","perea","Q123442a","pasa@gmail.com","vera","espana","213334","fjh","fhfg",null);
        Pasajero ps2 = new Pasajero(2L,"pasa2","perea","Q123442a","pasa@gmail.com","vera","espana","213334","fjh","fhfg",null);
        Pasajero ps3 = new Pasajero(3L,"pasa3","perea","Q123442a","pasa@gmail.com","vera","espana","213334","fjh","fhfg",null);
        Pasajero ps4 = new Pasajero(4L,"pasa4","perea","Q123442a","pasa@gmail.com","vera","espana","213334","fjh","fhfg",null);
        Pasajero ps5 = new Pasajero(5L,"pasa5","perea","Q123442a","pasa@gmail.com","vera","espana","213334","fjh","fhfg",null);
        Pasajero ps6 = new Pasajero(6L,"pasa1","perea","Q123442a","pasa@gmail.com","vera","espana","213334","fjh","fhfg",null);

        ArrayList<Pasajero>pasa1 = new ArrayList<>();
        pasa1.add(ps1);
        pasa1.add(ps2);
        ArrayList<Pasajero>pasa2 = new ArrayList<>();
        pasa2.add(ps3);
        pasa2.add(ps4);
        ArrayList<Pasajero>pasa3 = new ArrayList<>();
        pasa3.add(ps5);
        pasa3.add(ps6);
        miAtrampe.crearReserva(vuelo,pasa1,TipoTarifa.CONFORT,TipoAsiento.BUSINESS);
        miAtrampe.crearReserva(vuelo,pasa2,TipoTarifa.FLEXIBLE,TipoAsiento.TURISTA);
        miAtrampe.crearReserva(vuelo,pasa3,TipoTarifa.OPTIMA,TipoAsiento.TURISTA);
        //imprime vuelo
        System.out.println("El vuelo");
        System.out.println(vuelo);
        //System.out.println(vuelo1);
        //imprimir reservas
        System.out.println("los reservas");

        System.out.println(miAtrampe.getReservas());
        System.out.println("reservas por dni");
        //Muestra reservas por dni
        System.out.println(miAtrampe.buscarReservas("Q123442a"));
        System.out.println("reservas por destino");
        //Muestra vuelos por  destino
        System.out.println(miAtrampe.buscarVuelos("espana"));

        //por fecha
        System.out.println("reservas por feccah");
        System.out.println(miAtrampe.buscarVuelos(LocalDate.now()));



    }
}
