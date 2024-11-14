package Programacion.Tema2.PRACTICA;

import java.util.Scanner;

public class ejercicio1 {
    public static int NumeroAleatorio(int min , int max){
        return (int)(Math.random()*(max-min+ 1)+min);
    }
    public static void main(String[] args) {
       /* El usuario piensa un número, y el programa debe averiguarlo. Pide al usuario que piense un
        número entre el 1 y el 100. El programa mostrará un número por pantalla y preguntará al
        usuario si el número que ha pensado es menor, igual o mayor al número mostrado. Este
        proceso lo repetirá hasta encontrar el número que ha pensado el usuario. Al finalizar el
        proceso, mostrará el número de intentos probados hasta encontrar el número.*/

        String respuesta = "hola" ;
        int NumeroAleatorio;
        int contador = 0;

        Scanner sc = new Scanner(System.in);
            System.out.println("piensa un número  entre el 1 y el 100 ");
        NumeroAleatorio= NumeroAleatorio(1, 100);
        System.out.println(NumeroAleatorio);

        while (!respuesta.equals("igual")) {
            System.out.println("El numero es igual , mayor  o menor al  número mostrado ?");

            System.out.println("Dime la respuesta ");
            respuesta = sc.nextLine();
              if (respuesta.equals("mayor")){
                  NumeroAleatorio = NumeroAleatorio(NumeroAleatorio, 100);
                  System.out.println(NumeroAleatorio);
              }else if (respuesta.equals("menor")){
                  NumeroAleatorio = NumeroAleatorio(1, NumeroAleatorio);
                  System.out.println(NumeroAleatorio);
              }

                contador++;

        }
        System.out.println("número de intentos probados hasta encontrar el número es : " + contador + " Veces");
    }
}
