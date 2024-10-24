package Programacion.Tema2.PracticaClase;
import java.util.Scanner;

public class ejercicioMenuCalculadora {
    public static void main(String[] args) {

        // pedi por declado dos numeros
        // monstrar un menu con la siguintes apciones
        // 1  sumar : (pidie dos numeros y sumalos
        // 2 restar  : (pidie dos numeros y restalos
        // 3 multiplicar (pidie dos numeros y los multiplicos
        // 4 divisar
        //5 resto de division
        // 6 elever el primero al segundo
        // 7 salir
        int menu =0 ;
        int num1 = 0, num2 = 0 ;


        Scanner sc = new Scanner(System.in);









               do {

                   System.out.println("1 Hacer la suma ");
                   System.out.println("2 Hacer la resta ");
                   System.out.println("3 Hacer la multiplicacion ");
                   System.out.println("4 Hacer la division ");
                   System.out.println("5 Hacer la resta de division ");
                   System.out.println("6 elever el primero al segundo ");
                   System.out.println("7 salir");



                       do {
                           System.out.println("Elegir una opcion ");
                           menu = Integer.parseInt(sc.nextLine());

                           switch (menu) {
                               case 1:
                                   System.out.println("Has elegido opcion 1");
                                   System.out.println("Dime el primero numero");
                                   num1 = Integer.parseInt(sc.nextLine());
                                   System.out.println("Dime el primero numero");
                                   num2 = Integer.parseInt(sc.nextLine());
                                   System.out.println("La suma es : " + (num1 + num2));
                                   break;
                               case 2:
                                   System.out.println("Has elegido opcion 2");
                                   System.out.println("Dime el primero numero");
                                   num1 = Integer.parseInt(sc.nextLine());
                                   System.out.println("Dime el primero numero");
                                   num2 = Integer.parseInt(sc.nextLine());
                                   System.out.println("La resta es : " + (num1 - num2));
                                   break;
                               case 3:
                                   System.out.println("Has elegido opcion 3");
                                   System.out.println("Dime el primero numero");
                                   num1 = Integer.parseInt(sc.nextLine());
                                   System.out.println("Dime el primero numero");
                                   num2 = Integer.parseInt(sc.nextLine());
                                   System.out.println("La multiplicacion es : " + (num1 * num2));
                                   break;
                               case 4:
                                   System.out.println("Has elegido opcion 4");
                                   System.out.println("Dime el primero numero");
                                   num1 = Integer.parseInt(sc.nextLine());
                                   System.out.println("Dime el primero numero");
                                   num2 = Integer.parseInt(sc.nextLine());
                                   System.out.println("La division es : " + (num1 / num2));
                                   break;
                               case 5:
                                   System.out.println("Has elegido opcion 5");
                                   System.out.println("Dime el primero numero");
                                   num1 = Integer.parseInt(sc.nextLine());
                                   System.out.println("Dime el primero numero");
                                   num2 = Integer.parseInt(sc.nextLine());
                                   System.out.println("La resto de division es : " + (num1 % num2));
                                   break;
                               case 6:
                                   System.out.println("Has elegido opcion 6");
                                   System.out.println("Dime el primero numero");
                                   num1 = Integer.parseInt(sc.nextLine());
                                   System.out.println("Dime el primero numero");
                                   num2 = Integer.parseInt(sc.nextLine());
                                   System.out.println("elevado el primero al segundo  :  " + (Math.pow(num1, num2)));
                                   break;
                               case 7:
                                   System.out.println("Has elegido opcion 7");
                                   System.out.println("salir");

                                   break;
                               default:
                                   System.out.println("Error");


                           }
                       }while (menu < 1 || menu > 7) ;
               }while (menu != 7);




    }
}
