package Programacion.Tema7_part3.PruebaV2.application;

import Programacion.Tema7_part3.PruebaV2.io.DAOTicketsSoporte;
import Programacion.Tema7_part3.PruebaV2.services.ServicioSoporte;

import java.io.IOException;

public class App {
    public static void main(String[] args) {

        ServicioSoporte svs = new ServicioSoporte();
        try {
            svs = DAOTicketsSoporte.cargarCSV();
            svs.getUsuarios().forEach(System.out::println);
            System.out.println("---------------------Tecnicos----------------");
            svs.getTecnicos().forEach(System.out::println);
            System.out.println("-------------Ticketes-----------------------");
            svs.getTicketSoportes().forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
