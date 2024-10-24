package Programacion.Tema2.PracticaClase;
import java.util.Scanner;

public class ejemploFor {
    public static void main(String[] args) {




        /*// pintar numeros del 1 al 10
        for (int num = 1 ; num <= 10 ; num++) {
            System.out.println(num);
        }

        // los numeros pares del 2 al 40

        for (int num = 2 ; num <= 40 ; num+= 2 ){
            System.out.println(num);
        }
        // recoger la cadena caracter a caracter
        String cadena = "Programacion";
        for (int i = 0 ; i < cadena.length() ; i ++){
            System.out.println(cadena.charAt(i));
        }
        // con un cuenta atras del 10 al 1
        for (int i = 10 ; i > 0 ; i--){

            System.out.println(i);

            // genera 10 tiradas de 1 dado de seis caras  usando for
        int tirada ;
        for (int i = 1; i <= 10  ; i++) {
            tirada = (int)(Math.random()*(6 - 1 + 1 )+ 1 );
            System.out.println(tirada);

        }
        // pregunta por teclado 5 nombres de persona

        String nombre ;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Dime tu nombre ");
             sc.nextLine();


        }
        // pregunta por teclado 5 nombres y pintalos seguidos
        // tenemos que guqrdardo lops niombres e una variabkkkes
        // nombre =  nombrer + nuevo
        String cadena   = "";
        String nombre;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <=5 ; i++) {
            System.out.print("Ingrese el nombre: ");
           nombre  =  sc.nextLine();
            cadena = cadena + nombre + " ";


        }
        System.out.println(cadena);
        // pinta por pantalla la tabla de multiplicar del numero 7
        // 7 * 1 = 7
        // 7 *  2 = 14

        for (int i = 0; i < 10 ; i++) {
            System.out.println( i + " * 7 = " + (i*7));

        }
        // pinta la tabla del 4 al reves
        // 4 * 10 = 40 .......
        for (int i = 10; i >= 1 ; i--) {
            System.out.println( i + " x 4 = " + (i * 4));

        }
        // tira un dado de seis caras 100 veces
        // dime cuantos veces sale el 6

        int tirada ;
        int contador = 0 ;

        for (int i = 1; i <10000; i++) {
           tirada = (int) (Math.random()*(6-1+1))+1 ;
           if (tirada == 6){
               contador++;
           }
        }

        System.out.println( "Has salido el seis " + ((contador * 100)/10000 )+ " % "+ " veces") ;

        // suma todos los numeros par  del 1 al 100

        int total = 0;
        for (int i = 1; i <100 ; i++) {
            if ( i % 2 == 0 ){
                total = total + i;
            }

        }
        System.out.println( "La suma del numeros par del 1 al 100 es : " + total); */
        // pide 5 precicios por teclado
        // imprime el total
        int precio ;
        int total = 0 ;


        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <=5 ; i++) {

                System.out.println("Dime el pricio ");
                precio = sc.nextInt();
                total = total + precio ;

        }
        System.out.println("El total de estos precios es: " + total);
    }
}
