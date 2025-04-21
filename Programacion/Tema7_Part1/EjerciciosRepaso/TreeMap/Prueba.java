package Programacion.Tema7_Part1.EjerciciosRepaso.TreeMap;

import java.time.LocalDateTime;

public class Prueba {
    public static void main(String[] args) {
        AgendaCitas agenda = new AgendaCitas();
        int accion;

        accion = agenda.addCita("Reunion con alumnos",LocalDateTime.of(2025,4,1,10,20));
        switch (accion) {
            case 1:
                System.out.println("Error , fecha anterior a ahora"); break;
            case 2:
                System.out.println("Erro , ya tiene cita con este fecha"); break;
            case 0:
                System.out.println("Feccha añadida");
        }
        accion = agenda.addCita("Reunion con aaa",LocalDateTime.of(2025,4,6,10,20));
        switch (accion) {
            case 1:
                System.out.println("Error , fecha anterior a ahora"); break;
            case 2:
                System.out.println("Erro , ya tiene cita con este fecha"); break;
            case 0:
                System.out.println("Feccha añadida");
        }
        accion = agenda.addCita("Reunion con aaa",LocalDateTime.of(2025,4,6,10,20));
        switch (accion) {
            case 1:
                System.out.println("Error , fecha anterior a ahora"); break;
            case 2:
                System.out.println("Erro , ya tiene cita con este fecha"); break;
            case 0:
                System.out.println("Feccha añadida");
        }
        accion =   agenda.addCita("Reunion con bb",LocalDateTime.of(2025,4,7,10,20));
        switch (accion) {
            case 1:
                System.out.println("Error , fecha anterior a ahora"); break;
            case 2:
                System.out.println("Erro , ya tiene cita con este fecha"); break;
            case 0:
                System.out.println("Feccha añadida");
        }
        accion =  agenda.addCita("Reunion con cc",LocalDateTime.of(2025,4,4,11,20));
        switch (accion) {
            case 1:
                System.out.println("Error , fecha anterior a ahora"); break;
            case 2:
                System.out.println("Erro , ya tiene cita con este fecha"); break;
            case 0:
                System.out.println("Feccha añadida");
        }
        accion =  agenda.addCita("Reunion con dd",LocalDateTime.of(2025,4,3,11,20));
        switch (accion) {
            case 1:
                System.out.println("Error , fecha anterior a ahora"); break;
            case 2:
                System.out.println("Erro , ya tiene cita con este fecha"); break;
            case 0:
                System.out.println("Feccha añadida");
        }
        accion =  agenda.addCita("Reunion con jj",LocalDateTime.of(2025,4,3,11,20));
        switch (accion) {
            case 1:
                System.out.println("Error , fecha anterior a ahora"); break;
            case 2:
                System.out.println("Erro , ya tiene cita con este fecha"); break;
            case 0:
                System.out.println("Feccha añadida");
        }
        agenda.mostrarPreximasCitas();


    }
}
