import java.util.Scanner;

public class precioofinal {
    public static void main(String[] args) {
        //dqtos de entrsada precio de producto y cantidad
        //datos de slida precio final , aplicando el via

        //declaracionn de variables
        double precio ;
        int cantidad ;
         int IVA = 21 ;
        double Preciofinal ;

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Dame el valor del precio");
        precio = sc.nextDouble() ;
        System.out.println("Dame el valor del cantidad");
        cantidad = sc.nextInt();

        Preciofinal = (precio + (precio * (IVA/100)) ) * cantidad ;
        System.out.println("El precio final del producto es :" + Preciofinal + "€");

        sc . close();

    }
}
