package primeraEvaluacion;

import java.util.Scanner;

public class Ejercicio4 {
    public static int numeroAleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1))+min;
    }
    public static void pintar(char matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char tablero[][]= new char[10][10];
        Scanner sc = new Scanner(System.in);

        int terasoX= numeroAleatorio(0,10);
        int terasoY= numeroAleatorio(0,10);
        int distancia ;
        int x ;
        int y ;
        //System.out.println("Teraso : " + terasoX +" "+terasoY);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j]= '-';
            }
        }
        pintar(tablero);
        try {

            for (int i = 0; i < 15; i++) {
                System.out.println("dime valor de x ");
                x = Integer.parseInt(sc.nextLine());
                System.out.println("dime valor de y ");
                y = Integer.parseInt(sc.nextLine());
                tablero[x][y]= '@';
                pintar(tablero);
                tablero[x][y]= '-';
                //distancia entre el jugador y el tesoro
                distancia = Math.abs(terasoX - x) + Math.abs(terasoY - y);
                if (distancia == 0) {
                    System.out.println(" yeey tu incuentra el tesoro");
                    break;
                }
                if (distancia < 3) {
                    System.out.println(" Binga Estás más cerca del tesoro");
                } else if (distancia > 3) {
                    System.out.println("Estás más lejos del tesoro");
                }

               // System.out.println("Distancia : " + distancia);

            }
            System.out.println("No gana vuelve comprobar");
        }catch (Exception e){
            System.out.println( " Error "+e.getMessage());
        }

    }
}
