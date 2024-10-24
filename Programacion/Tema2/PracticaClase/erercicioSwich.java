package Programacion.Tema2.PracticaClase;
import java.util.Scanner;

public class erercicioSwich {
    public static void main(String[] args) {


        int dia ;
        int mes ;
        boolean fecha = true ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el dia ");
        dia = sc.nextInt();
        System.out.println("Dime el mes");
        mes = sc .nextInt();

        switch (mes){
            case 1 :
            case 3:
            case 5:
            case 7:
            case 8 :
            case 10 :
            case 12 :
                fecha =dia >=1 && dia <= 31  ;
                break;
            case 4:
            case 6 :
            case 9 :
            case 11:
                fecha = dia>=1  && dia <= 30 ;

                break;
            case 2 :
                fecha = dia >= 1 && dia <= 28 ;
                break;

        }
        if (fecha){
            System.out.println("La fecha es correcta");

        }else {
            System.out.println("La fecha es incorrecta");
        }

    }
}

