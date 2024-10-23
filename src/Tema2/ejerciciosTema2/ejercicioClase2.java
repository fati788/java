package src.Tema2.ejerciciosTema2;

public class ejercicioClase2 {

    // tenemos que pintar la siguinte figura
    //10000000
    //01000000
    //00100000
    //00000000
    //00000000
    //00000000
    //00000000
    //00000000
    public static void main(String[] args) {


        for (int i = 0; i <8 ; i++) {

            for (int j = 0 ; j < 8; j++) {

                if (i == j) {
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
                System.out.print(0);
            }
            System.out.println();
        }
    }

}
