package Programacion.tema1.ejerciciotema1;

public class EJERCICIO10 {
    public static void main(String[] args) {
        int num=5;
        num += num - 1 * 4 + 1;
        System.out.println(num);
        num=4;
        num %= 7 * num % 3 * 5;
        System.out.println(num);
    }
}
