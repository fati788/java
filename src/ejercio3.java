import java.util.Scanner;

public class ejercio3 {
    public static void main(String[] args) {

        double n1;
        double n2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el valor del primero numero");
        n1 = sc.nextInt();
        System.out.println("Dame el valor del segundo numero");
        n2 = sc.nextInt();

        System.out.println("El resulto de sumar del "+n1+"y"+n2+" es:"+ (n1+n2));


        sc.close();



        
    }
}
