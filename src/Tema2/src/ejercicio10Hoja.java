import java.util.Scanner;

public class ejercicio10Hoja {
    public static void main(String[] args) {

        int a ;
        int b ;
        int c ;
        double solucion1 , solucion2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el valor del a");
        a = sc .nextInt();
        System.out.println("Dame el valor del b");
        b = sc.nextInt();
        System.out.println("Dame el valor del c");
        c = sc . nextInt();
        if (a != 0 && ((b*b) - (4*a*c)>=0 ) ){
            solucion1 = (-b- Math.sqrt(Math.pow(b,2) - 4*a*c )) / 2*a ;
            solucion2 = (-b+ Math.sqrt(Math.pow(b,2) - 4*a*c )) / 2*a ;
            System.out.println("la solucion de este equacion es :" + solucion1 + " y " + solucion2);

        }

        else if (a == 0){
            solucion1 = -c /b ;
            System.out.println("La solucion de este equacion es :" + solucion1);

        }
        else if ((Math . pow(b,2) - 4*a*c) <0) {
            System.out.println("La equacion no tiene nunca solucion");

        }




    }
}
