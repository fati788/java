package Programacion.Tema2.Ejercicios;

public class ejercicio1 {
    public static int mayor (int a , int b , int c  ) {
        if (a > b && a > c) {
            return a;

        } else if (b > a && b > c) {
            return b;

        } else
            return c;

    }
    public static int MayorCuatro (int a , int b , int c , int d  ) {
        if (mayor(a,b,c)>d ){
            return mayor(a,b,c);
        }else
            return d ;

    }

    public static void main(String[] args) {
        int a = 23;
        int b = 22;
        int c = 33;
        int d = 44;

        System.out.println( "El nayor entre estos tres  numeros es : " + mayor(a,b,c));
        System.out.println("El mayor entre cuatro numeros es : " + MayorCuatro(a,b,c,d));
    }
}
