package Programacion.Tema2.PracticaClase;
public class ejerciciosWhile {
    public static void main(String[] args) {


        //simula lanzar un dado de seis caras , hasta que te salga unn seis
        // generar un num aleatoir de 1 al 6
       /* int tirada ;
        do {
            tirada = (int)(Math.random()*(6-1+1)+1) ;
            System.out.println(tirada);
        }while (tirada != 6);

        int num = 0 ;
        while (num != 6){
            num = (int)(Math.random()*(6-1+1)+1) ;
            System.out.println(num);
        }

        //simula lanzar un dado de seis caras , hasta que te salga unn seis
        // cuent ael numero de tiradas que has necesitado hast asacar seis
        // necesito un variable que se incremente vcada vez que entro en while

        int tirada = 0 ;
        int contrador =0;


        while ( tirada != 6){

            tirada = (int)(Math.random()*(6-1+1)+1) ;
            contrador++;
            System.out.println("dado " + tirada );
        }
        System.out.println("Has necesitado " + contrador + " tiradas");*/
        // simula un dado de 20 caras , hasta que te salga el 1 o el 20
        int tirada = 0 ;
        int contrado = 0 ;

        while ((tirada != 20) && (tirada != 1) ){
            tirada = (int)(Math.random()*(20-1+1)+1) ;
            contrado++;
            System.out.println( "dado " +  tirada + " contrador " + contrado);
        }System.out.println("Has necesitado " + contrado + " tiradas");



    }
}
