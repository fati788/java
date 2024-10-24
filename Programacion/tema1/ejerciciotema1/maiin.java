package Programacion.tema1.ejerciciotema1;

public class maiin {
    public static void main(String[] args) {
        int radio=5 ;
        double area=0;
        double perimeter=0;

        area = Math.PI * radio *radio;
        perimeter = 2 * Math.PI * radio;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

    }
}
