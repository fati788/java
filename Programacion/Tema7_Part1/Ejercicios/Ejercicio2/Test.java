package Programacion.Tema7_Part1.Ejercicios.Ejercicio2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {

        Paciente p1 = new Paciente("Ana","Garcia","1234576","ana@gmail.com","calle mar","vera");
        Paciente p2 = new Paciente("fati","El","234567","fati@gmail.com","calle mar","Cuevas");
        Paciente p3 = new Paciente("noha","Perez","1234567","noha@gmail.com","calle mar","Garrucha");
        Paciente p4 = new Paciente("baja","fal","0976554","haja@gmail.com","calle mar","Mojacar");
        Paciente p5 = new Paciente("Joli","Garcia","9875674","joli@gmail.com","calle maretres","Almeria");
        Cita c1 = new Cita(p1, LocalDate.of(2024,3,1), LocalTime.now(),Tipo.CONSULTA);
        Cita c2 = new Cita(p2, LocalDate.of(2023,4,1), LocalTime.of(10,23),Tipo.PRIMERA);
        Cita c3 = new Cita(p3, LocalDate.of(2020,5,1), LocalTime.of(11,12),Tipo.REVISION);
        Cita c4 = new Cita(p4, LocalDate.of(2024,8,1), LocalTime.of(16,10),Tipo.CONSULTA);
        Cita c5 = new Cita(p5, LocalDate.of(2024,8,1), LocalTime.of(12,10),Tipo.REVISION);
        Cita c6 = new Cita(p3, LocalDate.of(2024,8,1), LocalTime.of(10,10),Tipo.REVISION);

        CitasConsulta citasConsulta = new CitasConsulta();
        citasConsulta.addCita(c1);
        citasConsulta.addCita(c2);
        citasConsulta.addCita(c5);
        citasConsulta.addCita(c3);
        citasConsulta.addCita(c4);
        citasConsulta.addCita(c6);

     citasConsulta.listraCitasPorNombre();
        System.out.println("----------------------------");
     citasConsulta.listraCitasPorApellido();
        System.out.println("-----------------------------");
     citasConsulta.listarPorFechaYApellido();
        System.out.println("------------------------------");
        System.out.println(citasConsulta.buscarCitasFuturas("fati@gmail.com"));
        System.out.println("-------------------------------");
        citasConsulta.listarCitasPorFHora(LocalDate.of(2024,8,1));




    }
}
