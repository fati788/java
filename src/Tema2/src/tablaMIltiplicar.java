public class tablaMIltiplicar {
    public static void main(String[] args) {


        // imprimir tabla multiplicar 9

       /* for (int i = 1; i <10 ; i++) {

            System.out.println(  " 9 x" + i + " = " + (9 * i ));

        }
        // imprima todas las tablas de multiplicar del 1 al 10
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {


                System.out.println(i + " x" + j  + " = " + (i * j));
            }

        }*/
        //todas tablas del 1 al 20n menos del 10
        for (int i = 1; i <=20 ; i++) {
            if (i !=0) {
                for (int j = 1; j <= 10; j++) {


                    System.out.println(i + " x" + j + " = " + (i * j));
                }
            }

        }
    }
}
