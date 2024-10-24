package Programacion.Tema2.PracticaClase;
import java.util.Scanner;

public class ejercicioSwitch9 {
    public static void main(String[] args) {

        int mes  ;
        Scanner sc = new Scanner(System.in);
        mes = sc . nextInt();

        switch (mes){
            case 2 :
                System.out.println("28 dias");
                break;
            case 1 , 3,5,7,8,10,12:
                System.out.println("31 dias");
                break;
            case 4,6,9,11:
                System.out.println("30 dias");
                break;
            default:
                System.out.println("error");

        }
    }
}
