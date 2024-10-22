import java.util.Scanner;

public class ejercicio1open {
    public static void main(String[] args) {
        double costefabricacion ;
        double preciofinal = 0 ;
        double precioconiva;


        Scanner sc = new Scanner(System.in);
        System.out.println("dime el coste de fabricacion del producto");
         costefabricacion= sc.nextDouble();
         costefabricacion = costefabricacion + (costefabricacion*(30/100));
        System.out.println("el coste de fabricacion mae el al margen es "+costefabricacion + "€");



        preciofinal = costefabricacion+ (costefabricacion*12/ 100);
        System.out.println("el precio final es"+preciofinal + "€");



    }
}
