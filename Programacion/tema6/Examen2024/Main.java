package Programacion.tema6.Examen2024;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Atrampe miAtrampe = new Atrampe();
        Vuelo vuelo1 = new Vuelo("jsdgq","marruecos","espana", LocalDate.now(), LocalTime.now(),120.0,30);
         //Anadir vuelo
        for (int i = 0; i < 10; i++) {
            miAtrampe.addVuelo(vuelo1);
        }
        //Anadir reserbas
        ArrayList<Pasajero>pasajeros = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Pasajero pa = new Pasajero(1231L+i ,"faty","el","13124l","faftty@gmail.com","vera","espana","1²2314124","azedaz","zaerz",null);
           pasajeros.add(pa);
        }
     for (Vuelo vuelo : miAtrampe.getVuelos()) {
         for (int i = 0; i < 5; i++) {
             miAtrampe.crearReserva(vuelo, pasajeros, TipoTarifa.CONFORT, TipoAsiento.TURISTA);
             miAtrampe.getReservas().add(new ReservaVuelo(vuelo, TipoTarifa.CONFORT, TipoAsiento.TURISTA));
         }
     }
        //imprime vuelo
        System.out.println("*****************");
        System.out.println(vuelo1);
        //imprimir reservas
        System.out.println("*****************");

        System.out.println(miAtrampe.getReservas());
        System.out.println("*****************");
        //Muestra reservas por dni
        System.out.println(miAtrampe.buscarReservas("13124l"));
        System.out.println("*****************");
        //Muestra vuelos por  destino
        System.out.println(miAtrampe.buscarVuelos("espana"));
        System.out.println("*****************");
        //por fecha
        System.out.println("*****************");
        System.out.println(miAtrampe.buscarVuelos(LocalDate.now()));
        System.out.println("*****************");
        System.out.println(miAtrampe.getReservas().size());

    }
}
