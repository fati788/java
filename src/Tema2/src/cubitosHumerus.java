package src.Tema2.src;
public class cubitosHumerus {
    public static void main(String[] args) {


        // dos juegan con 2 dados
        // cada uno tira dado 20 caras
        // gana que saca el daado mayor , o el si alguna saca 9
        // que gana !!!!!

        /*int tirada1 = 0;
        int tirada2 = 0 ;

         if ((tirada1 > tirada2) || (tirada1 == 9 ) ){
             tirada1 = (int)(Math.random()*20)+ 1 ;
             tirada2 = (int)(Math.random()*20)+ 1 ;
             System.out.println("Gana el primero jugador  ");

         } else if  ((tirada2 >     tirada1) || (tirada2 == 9 ) ){
            tirada1 = (int)(Math.random()*20)+ 1 ;
            tirada2 = (int)(Math.random()*20)+ 1 ;
            System.out.println("Gana el segundo jugador  ");

         }else {
             System.out.println("No gana nadie");
         }*/
        int tirada1 = 0;
        int tirada2 = 0 ;
        int contador2 =0;
        int contador1 =0;

        for (int i = 1; i <10 ; i++) {
            tirada1 = (int)(Math.random()*20)+ 1 ;
            tirada2 = (int)(Math.random()*20)+ 1 ;



        }



    }
}
