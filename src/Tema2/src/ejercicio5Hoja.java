import java.util.Scanner;

public class ejercicio5Hoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System . in);
        System.out.println("Dime el ano :" );
        int year = sc.nextInt();



        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
            System.out.println("ES bisiesto");
        } else {
            System.out.println("No es bisiesto");
            sc.close();
        }
    }
}
