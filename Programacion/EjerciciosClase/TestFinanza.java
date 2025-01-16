package Programacion.EjerciciosClase;

import java.util.Scanner;

public class TestFinanza {
    public static void main(String[] args) {
        Finanza finanza = new Finanza();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un cantidad en dollar: ");
        Double cantidad = Double.valueOf(sc.nextLine());
        System.out.println(cantidad+" dollars son : " + finanza.dolaresToEuros(cantidad) + " euros con un cambio dolar euro de  " +finanza.getValor());
        Finanza finanza2 = new Finanza(2);
        System.out.println(finanza.dolaresToEuros(20));

        System.out.println(finanza2.dolaresToEuros(20));

    }
}
