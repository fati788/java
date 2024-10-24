package Programacion.Tema2.PracticaClase;
import java.util.Scanner;

public class ejercicioIF {
    public static void main(String[] args) {

        //pedir por teclado la hora del dia (0--23)
        //6--12 buenos dias
        //12--20 buenas tardes
        // en otro caso buenas noches
        //pedir niveldel jugar (1--5)
        // 1 . iniciado
        // 2 . amateur
        // 3 . prefesionel
        // 4 .  experto
        // 5 . dios

        double hora;
        int nivel;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Dime la hora ");
        hora = sc.nextDouble();
        System.out.println("Dime tu nivel");
        nivel = sc.nextInt();

        if (nivel == 1) {
            if (hora >= 6 && hora < 12) {
                System.out.println(" Buenos dias inicio");
            } else if (hora >= 12 && hora < 20) {
                System.out.println(" Buenos tardes inicio");
            } else {
                System.out.println(" Buenos noches inicio ");
            }
        }
        if (nivel == 2) {
            if (hora >= 6 && hora < 12) {
                System.out.println(" Buenos dias amateur");
            } else if (hora >= 12 && hora < 20) {
                System.out.println(" Buenos tardes amateur");
            } else {
                System.out.println(" Buenos noches amateur");
            }
        }

        if (nivel == 3) {
            if (hora >= 6 && hora < 12) {
                System.out.println(" Buenos dias profecionel");
            } else if (hora >= 12 && hora < 20) {
                System.out.println(" Buenos tardes profecionel");
            } else {
                System.out.println(" Buenos noches profecionel");
            }
        }

        if (nivel == 4) {
            if (hora >= 6 && hora < 12) {
                System.out.println(" Buenos dias experto");
            } else if (hora >= 12 && hora < 20) {
                System.out.println(" Buenos tardes experto");
            } else {
                System.out.println(" Buenos noches experto");
            }
        }
        if (nivel == 5) {
            if (hora >= 6 && hora < 12) {
                System.out.println(" Buenos dias dios");
            } else if (hora >= 12 && hora < 20) {
                System.out.println(" Buenos tardes dios");
            } else {
                System.out.println(" Buenos noches dios");
            }
        }
    }
}

