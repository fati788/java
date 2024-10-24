package Programacion.Tema2.PracticaClase;

public class ejercicioClase1 {
    public static void main(String[] args) {
        // dados dod numeros y dime cuanto multiploa de 5 entre ellos

        int num1 = 120;
        int num2 = 327;
        int contador = 0;


        for (int i = 120; i <327 ; i++) {


            if ( i % 5 ==0) {
                System.out.println(i);
                contador++;


            }
        }
        System.out.println( " multiplicos de 5 entre 120 y 327 hay :" + contador);
    }
}
