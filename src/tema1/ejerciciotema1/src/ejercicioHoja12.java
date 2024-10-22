public class ejercicioHoja12 {

    public static void main(String[] args) {

        //Intercambiar el valor de dos variables
        int a = 5;
        int b= 10;
        int temp;  //Es necesaria una variable auxiliar para guardar el valor original de la primera variable

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }
}
