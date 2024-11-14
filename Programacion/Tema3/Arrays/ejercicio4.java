package Programacion.Tema3.Arrays;

public class ejercicio4 {

    public static int  NumeroAleatorio(int  min , int max){
        return (int ) (Math.random()*(max-min+ 1)+min);
    }
    public static void main(String[] args) {


        boolean falta[] = new boolean [85];
        int contador = 0;


        for (int i = 0; i < falta.length ; i++) {


            if (NumeroAleatorio(1,5) == 1){
                falta[i] = true;
                contador++;

            }else {
                falta[i] = false;

            }

        }
        for (int i = 0; i < falta.length; i++) {
            System.out.println(falta[i]);

        }


        System.out.println("Ha faltado " + contador + " dias");
         if (contador > (20*85/100)){
             System.out.println( "El alumno ha perdido evaluacion continua");
         }else {
             System.out.println( "El alumno nooo ha perdido evaluacion continua");
         }


    }
}
