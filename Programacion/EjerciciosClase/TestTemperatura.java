package Programacion.EjerciciosClase;

public class TestTemperatura {
    public static void main(String[] args) {

        Temperatura temperatura = new Temperatura();
        System.out.println(temperatura.celsiusToFarenheit(125));
        System.out.println(temperatura.farenheitToCelsius(125));
    }
}
