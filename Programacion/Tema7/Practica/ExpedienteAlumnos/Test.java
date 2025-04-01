package Programacion.Tema7.Practica.ExpedienteAlumnos;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("A1234Z","eadze","asdz", LocalDate.of(2005,8,1),"aez","adze","zae","ezzer");
        Estudiante e2 = new Estudiante("mkazemrkze","eadze","asdz", LocalDate.of(2004,8,1),"aez","adze","zae","ezzer");
        Estudiante e3 = new Estudiante("azemzie","eadze","asdz", LocalDate.of(2003,8,1),"aez","adze","zae","ezzer");

        NotasCurso nc = new NotasCurso("FP superior","DAW",1,2025);
        nc.addNota("pro",9.0);
        nc.addNota("BD",8.0);
        nc.addNota("SI",9.0);

        System.out.println(nc.buscar("BD"));
        nc.pintar();
        Expediente ex1 = new Expediente(e1,true);
        ex1.addNotas(nc);
        ex1.modtrarNotas(1,"FP superior");

        CentroEducativo centroEducativo = new CentroEducativo("IESJ","Cuevas","Cuevas","123134","IES@gmail.com");
        centroEducativo.addExpediente(ex1);
        System.out.println(centroEducativo.buscarExpediente("A1234Z"));


    }
}
