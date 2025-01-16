package Programacion.Tema4;

public class convertir {
    private static final double CAMBIO_EURO_DOLLAR = 1.1;
    public static  double convertirEuro(double valor){
        return valor * CAMBIO_EURO_DOLLAR;

    }

    public static void main(String[] args) {

        System.out.println(convertir.convertirEuro(25));
    }
}
