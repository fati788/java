package src.Tema2.src;

public class CubiusHumeros2 {
    public static void main(String[] args) {


        int tiradaH1 ;
        int tiradaH2 ;
        int tiradaC1 ;
        int tiradaC2 ;


        int contadorH = 0;
        int contadorC = 0 ;

        for (int i = 0; i < 20; i++) {

            tiradaH1 = (int) (Math.random() * 12) + 1;
            tiradaC1 = (int) (Math.random() * 12) + 1;
            tiradaH2 = (int) (Math.random() * 12) + 1;
            tiradaC2 = (int) (Math.random() * 12) + 1;

            System.out.println("TiradaH1 " + tiradaH1);
            System.out.println("TiradaC1 " + tiradaC1);
            System.out.println("TiradaH2 " + tiradaH2);
            System.out.println("TiradaC2 " + tiradaC2);

            if (tiradaC1 == tiradaC2  && tiradaH1 == tiradaH2) {
                System.out.println(" empate");

            }else if( (tiradaC1 + tiradaC2) > (tiradaH1 + tiradaH2)) {
                System.out.println("gana Cubitus");
                contadorC++;
            }else if ((tiradaH1 + tiradaH2) > (tiradaC1 + tiradaC2)) {
                System.out.println("gana Humerus");
                contadorH++;
            } else if ((tiradaC1 + tiradaC2) == (tiradaH1 + tiradaH2)) {
                System.out.println("Empate");


            } else if (tiradaC1 == tiradaC2) {
                System.out.println(" En final Gana cubitus");
                contadorC++;

            }else if (tiradaH1 == tiradaH2) {
                System.out.println(" En final Gana humerus");
                contadorH++;
            }



        }

        if (contadorC > contadorH) {
            System.out.println("Gana Cubitus");


        }else if (contadorH > contadorC) {
            System.out.println("Gana Humerus");

        }else {
            System.out.println("Empate");
        }
    }
}



