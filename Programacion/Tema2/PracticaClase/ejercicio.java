package Programacion.Tema2.PracticaClase;
import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {

        int dia ;
        int mes ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el dia");
        dia = sc . nextInt();
        System.out.println("Dime el mes");
        mes = sc . nextInt();

        if ((dia > 22 && mes == 12 && dia <= 31) ||  (mes < 3) ||(mes == 3 && dia <= 19 )){
            System.out.println("ES el estacion de inverano");
        }else if ((dia > 20 && mes == 3 && dia <= 31) || (mes == 4) || (mes == 5 ) || (mes == 6 && dia <= 19 )){
            System.out.println("Es el estacion de primavera");
        }else if ((dia > 20 && mes == 6 && dia <= 31) || (mes == 7) || (mes == 8 ) || (mes == 9 && dia <= 21 )){
            System.out.println("Es el estacion de venaro");
        }else{
            System.out.println("Es el estacion de otono");
        }
    }
}
