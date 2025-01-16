package Programacion.EjerciciosClase;

public class Temperatura {
    /*Realiza una clase Temperatura, la cual convierta grados Celsius a Farenheit y viceversa. Para ello, crea dos
métodos double celsiusToFarenheit(double celsius) y double farenheitToCelsius(double
farenheit). La clase Temperatura no tendrá ninguna propiedad, solo esos dos métodos.
En la construcción ten en cuenta las siguientes fórmulas:
- Farenheit a Celsius C = (F – 32)/1,8
- Celsius a Farenheit F = (1,8)C + 32*/


    public static  double celsiusToFarenheit(double celsius){
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }
    public static double farenheitToCelsius(double farenheit){
        double celsius = (farenheit - 32)/1.8;
        return celsius;
    }


}
