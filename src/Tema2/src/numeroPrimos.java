import java.util.Scanner;

public class numeroPrimos {
    public static void main(String[] args) {

        // introduce un numero y di si es un numero primo o no
        // primo solo divisible para el 1 y el mismo
        // indicador
        int numero;
        boolean primo = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el  numero");
        numero = sc.nextInt();

        for (int i = (numero -1) ; i >=2 ; i--) {

            if ( numero % i ==0){
                primo = false ;
                System.out.println(i);
            }

        }
        if (primo){
            System.out.println( + numero + " es Primo");
        }else {
            System.out.println( + numero + " no es  Primo");
        }

    }
}
