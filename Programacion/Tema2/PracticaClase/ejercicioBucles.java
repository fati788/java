package Programacion.Tema2.PracticaClase;
import java.util.Scanner;

public class ejercicioBucles {
    public static void main(String[] args) {


        // hay que pedir num hasta introduzcamos 0

        // el resultado de la soma y media de los numeros
        // accumulador -----> suma     contador -----> media

        int contador =0;
        double total = 0 ;
        int numero = -1;

        Scanner sc = new Scanner(System.in);
        while (numero!=0){
            numero = sc.nextInt();

            if (numero!=0){
                contador++;
                total = total + numero;
            }

        }
        System.out.println("La suma es " + total + " y  la media es : " + (total/contador));


  }
}
