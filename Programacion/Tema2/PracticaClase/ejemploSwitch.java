package Programacion.Tema2.PracticaClase;
import java.util.Scanner;

public class ejemploSwitch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero de la cara del dado");
        int dado = sc.nextInt();


        switch (dado){
            case 1 :
                System.out.println("seis");
                break;
            case 2:
                System.out.println("cinco");
                break;
            case 3 :
                System.out.println("cuatro");
                break;
            case 4 :
                System.out.println("tress");
                break;
            case 5 :
                System.out.println("dos");
                break;
            case 6 :
                System.out.println("unno");
                break;
            default:
                System.out.println("Error numero incorrecto");
        }
    }
}
