package Programacion.tema1.ejerciciotema1;

import java.time.Month;

public class ejercicio15 {
    public static void main(String[] args) {

        double apartadoC = Math.random() * 10 +1 ;
        System.out.println(apartadoC);

        int apartoG = (int)(Math.random()*(12-1+1)+1);
        System.out.println(Month.of(apartoG));
    }
}
