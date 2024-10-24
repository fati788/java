package Programacion.Tema2.PracticaClase;
import java.util.Scanner;
public class ejercicioif7 {
    public static void main(String[] args) {

        double minutos;
        int dia  ;
        double costo ;
        int turno  ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el dia de realizacion del llamada ");
        dia = sc.nextInt();
        System.out.println("Dime el minutos que dure esta llamada");
        minutos = sc .nextDouble();
        System.out.println("Dime el turno");
        turno = sc . nextInt() ;                       	// 1 ----> manana 2 -----> tarde

        if (dia == 1  && (turno == 1 || turno == 2)){                                          // 1  -------> domingo

            if (minutos >0 && minutos <=5){
                costo = 1 * minutos ;
                System.out.println("El costo del llamada es " +(costo + costo*0.03) + " €");

            }
            else if (minutos >5 && minutos <=8 ){
                costo = 1*5 + (minutos - 5)*0.8;

                System.out.println("El costo del llamada es :" + (costo + costo*0.03) + " €");
            }
            else if (minutos >8 && minutos <= 10){
                costo = 1* 5 + 3 *0.8 + ( minutos - 8)*0.7;
                System.out.println("El costo del llamada es :" + (costo + costo*0.03) + " €");

            }
            else {
                costo = 1 * 5 + 3 * 0.8 + 2*0.7 + (minutos-10*0.5);
                System.out.println("El costo del llamada es :" + (costo + costo*0.03) + " €");
            }
        }
        if (dia >1 && dia<=7 && turno == 1){                          // 7 lunes

            if (minutos >0 && minutos <=5){
                costo = 1 * minutos ;
                System.out.println("El costo del llamada es " +(costo + costo*0.15) + " €");

            }
            else if (minutos >5 && minutos <=8 ){
                costo = 1 * 5 + (minutos - 5)*0.8;                     	// 7<---domingo 1<-----lunes

                System.out.println("El costo del llamada es :" + (costo + costo*0.15) + " €");
            }
            else if (minutos >8 && minutos <= 10){
                costo = 1 * 5  + 3 *0.8 + ( minutos - 8)*0.7;
                System.out.println("El costo del llamada es :" + (costo + costo*0.15) + " €");

            }
            else {
                costo =( 1 * 5 + 3 * 0.8 + 2*0.7 + (minutos-10*0.5));
                System.out.println("El costo del llamada es :" + (costo + costo*0.15) + " €");
            }
        }
        if (dia >1 && dia<=7 && turno == 2){

            if (minutos >0 && minutos <=5){
                costo = 1 * minutos  ;
                System.out.println("El costo del llamada es " +(costo + costo*0.1) + " €");

            }
            else if (minutos >5 && minutos <=8 ){
                costo = 1 * 5  + (minutos - 5)*0.8;                     	// 7<---domingo 1<-----lunes

                System.out.println("El costo del llamada es :" + (costo + costo*0.1) + " €");
            }
            else if (minutos >8 && minutos <= 10){
                costo = 1 + 3 *0.8 + ( minutos - 8)*0.7;
                System.out.println("El costo del llamada es :" + (costo + costo*0.1) + " €");

            }
            else {
                costo =( 1 + 3 * 0.8 + 2*0.7 + (minutos-10*0.5));
                System.out.println("El costo del llamada es :" + (costo + costo*0.1) + " €");
            }
        }
       sc.close();
    }
}



