package Programacion.Tema7_Part1.Repaso.Ejercicio2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("fati","Hola","dqdqs","sqdsq","zeds","deze");
        Paciente p2 = new Paciente("ana","Pepe","rze","zezeze","fg","ggggg");
        Cita c1 = new Cita(p1, LocalDate.now().minusDays(1), LocalTime.now().plusHours(13),Tipo.PRIMERA);
        Cita c2 = new Cita(p2, LocalDate.now().plusDays(1), LocalTime.now().plusHours(39),Tipo.CONSULTA);
        Cita c3 = new Cita(p1, LocalDate.now().plusDays(100), LocalTime.now().plusHours(43),Tipo.REVISION);
        Cita c4 = new Cita(p2, LocalDate.now().plusDays(1000), LocalTime.now().plusHours(33),Tipo.PRIMERA);
        Cita c5 = new Cita(p1, LocalDate.now().plusDays(10000), LocalTime.now().plusHours(83),Tipo.REVISION);

        CitasConsulta cc = new CitasConsulta();
        cc.addCita(c1);
        cc.addCita(c2);
        cc.addCita(c3);
        cc.addCita(c4);
        cc.addCita(c5);
        System.out.println("**********Citas por nombre*********");
        cc.listarCitasPorNombre();
        System.out.println("**********Citas por Apellidos*********");
        cc.listarPorApellido();
        System.out.println("**********Citas por Hora*********");
        cc.listarCitasPorHora(LocalDate.now().plusDays(1));
        System.out.println("**********Citas por Fecha y Apellido*********");
        cc.listarPorFechasYApellidos();
        System.out.println("++++++++++++++++Buscar+++++++++++++++++++++");
        cc.buscarCitasFuturas("sqdsq");




    }
}
