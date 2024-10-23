package src.Tema2.src;
import java.util.Scanner;

public class ejemploIf4 {
    public static void main(String[] args) {

        int edad ;
        char sexo ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad");
        edad = sc .nextInt();
        System.out.println("Dime tu sexo");
        sexo = sc . next().charAt(0);

        if (sexo == 'H') {
            if (edad >= 1 && edad <= 12) {        //puede hacer else
                System.out.println("Hola nino");
            }
            if (edad >= 12 && edad <= 17) {
                System.out.println("Hola chico");
            }
            if (edad >= 18 && edad <= 29) {
                System.out.println("Hola tio");
            }
            if (edad >= 30 && edad <= 60) {
                System.out.println("Hola hombre");
            }
            if (edad > 60) {
                System.out.println("Hola abuelo");
            }
        }
       if (sexo=='M'){
           if (edad >= 1 && edad <= 12) {
               System.out.println("Hola nina");
           }
            if (edad >= 12 && edad <= 17) {
               System.out.println("Hola chica");
           }
           if (edad >= 18 && edad <= 29) {
               System.out.println("Hola tia");
           }
           if (edad >= 30 && edad <= 60) {
               System.out.println("Hola mujer");
           }
           if (edad > 60) {
               System.out.println("Hola abuela");
           }

       }
    }

}
