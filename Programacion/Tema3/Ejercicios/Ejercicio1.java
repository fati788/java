package Programacion.Tema3.Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        // crea un programma que pida un numero al usuario un numero de mes (prj 4) y
        // diga cuantos dias tienne prjm 30  y el nombre del mes debes usar un arrayu .
        // para simplificar vamo a suponer qu efebrero tienne 28 dias .

        int numero ;


        int mes[] = {31 , 28 , 31, 30 , 31, 30, 31 , 31,31,31,30,31  };
        String nombre [] = {"enero" , "febrero" , "marzo" , "april" , "mayo" ,
                "junio", "julio", "agosto", "septiembre", "octubre", "noviembre" , "diciembre"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero delmes ");

            numero = Integer.parseInt(sc.nextLine());


        System.out.println(" El mes " + nombre[numero-1] + " tiene " + mes[numero-1] + " dias");
    }
}
