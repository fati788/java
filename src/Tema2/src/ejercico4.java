import java.util.Scanner;

public class ejercico4 {
    public static void main(String[] args) {




        int numero1;
        int numero2;
        int num ;
        Scanner sc = new Scanner(System.in);



        System.out.println("Dime el primero numero" );
        numero1 = sc.nextInt();
        System.out.println("Dime el segundo numero" );
        numero2 = sc.nextInt();

        for (int i = numero1; i <numero2 ; i++) {

            if (i  % 2 == 0){
                System.out.println(  i );

            }

        }

    }
}
