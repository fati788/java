import java.sql.SQLOutput;
import java.util.Scanner;

public class preciofinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precio, preciofinal;
        double IVA = 21;

        System.out.println("Introduzca el precio");
        precio = sc.nextInt();

        preciofinal = precio * (1 + IVA / 100);
        System.out.println(" el valor del precio final es : " + preciofinal);

            }
    }