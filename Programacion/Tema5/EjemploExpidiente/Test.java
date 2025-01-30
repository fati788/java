package Programacion.Tema5.EjemploExpidiente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Expidiente ex1 = new Expidiente("Mnolo" , "Garcia" , 'H' , Expidiente.Modalidad.FPB,
                                         LocalDate.of(2000,10,13) , 1);
        Expidiente ex2 = new Expidiente("Isabel" , "Perez" , 'M' , Expidiente.Modalidad.FPSUPERIOR ,
                LocalDate.of(2001,2,1) , 1);

        NotasCurso n1= new NotasCurso("Programacion" , 1 , 5.2,4.5,6.75);
        NotasCurso n2= new NotasCurso("Programacion" , 1 , 7.2,8.5,6.75);
        NotasCurso n3= new NotasCurso("BBDD" , 1 , 3.2,4.5,6.75);
        NotasCurso n4= new NotasCurso("BBDD" , 1 , 5.2,5.5,6.75);
        NotasCurso n5= new NotasCurso("SSII" , 1 , 3.2,4.5,6.75);
        NotasCurso n6= new NotasCurso("SSII" , 1 , 5.2,5.5,6.75);

       /* ex1.add(n1);
        ex1.add(n3);
        ex2.add(n2);
        ex2.add(n4);
*/
        ex1.addNotas(List.of(n1,n3 , n5));
        ex2.addNotas(List.of(n2,n4,n6));

        System.out.println(ex1);
       System.out.println(ex2);
        System.out.println(ex1.titula());
        System.out.println(ex2.titula());

        System.out.println(ex1.getMediaExpidiente());
        System.out.println(ex2.getMediaExpidiente());

        System.out.println(ex1.getEdad() + " " + ex1.EsMayorEdad());
        System.out.println(ex2.getEdad() + " " + ex2.EsMayorEdad());




    }
}