package Programacion.Tema7_Part1.Repaso.Ejercicio4.ExpedienteAlumnos;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("A1231321S","fati","el", LocalDate.of(2005,8,1),
                                      "morroco","larache","fati@gmail.com","123455667");
        Estudiante e2 = new Estudiante("S1231224K","hajar","el", LocalDate.of(2006,8,1),
                "morroco","larache","hajar@gmail.com","43546757");
        Estudiante e3 = new Estudiante("Z133453464H","fati","el", LocalDate.of(2009,8,1),
                "morroco","larache","yassin@gmail.com","123142354345");

        NotasCurso nc1 = new NotasCurso(EtapaEducativa.FP_SUPERIOR,"DAW",1,2024);
        NotasCurso nc2 = new NotasCurso(EtapaEducativa.FP_SUPERIOR,"DAW",2,2025);

        nc1.addNota("Progra",9.0);
        nc1.addNota("BBDD",9.16);
        nc1.addNota("SSII",8.0);
        nc1.addNota("EDD",7.0);

        nc2.addNota("Progra",9.0);
        nc2.addNota("BBDD",9.16);
        nc2.addNota("SSII",8.0);
        nc2.addNota("EDD",7.0);

        System.out.println("----------Mostrar Notas-------------");
        nc1.pintar();
        System.out.println("-------------------------------------");
        nc2.pintar();

        Expediente ex1 = new Expediente(e1 , true);
        Expediente ex2 = new Expediente(e2 , false);
        Expediente ex3 = new Expediente(e3 , true);

        ex1.addNotas(nc1);
        ex1.addNotas(nc2);
        ex2.addNotas(nc1);
        ex2.addNotas(nc2);
        ex3.addNotas(nc1);
        ex3.addNotas(nc2);
        System.out.println("---------Mostrar Notas Expediente 1 Superior---------------");

        ex1.mostrarNotas(1 , EtapaEducativa.FP_SUPERIOR.toString());

        CentroEducativo centroEducativo = new CentroEducativo("IESJAROSO","CUEVAS","CUEVAS","21324124324","jaroso@gmail.com");

        centroEducativo.addExpediente(ex1);
        centroEducativo.addExpediente(ex2);
        centroEducativo.addExpediente(ex3);

        System.out.println("-------------------------------------------------------");
        centroEducativo.buscarExpedientes("A1231321S");



    }
}
