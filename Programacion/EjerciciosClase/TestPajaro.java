package Programacion.EjerciciosClase;

public class TestPajaro {
    public static void main(String[] args) {
        Pajaro pajaro = new Pajaro(5, 'B');
        pajaro.setEdad(10);
        System.out.println(pajaro.getEdad());
        pajaro.setColor('c');
        System.out.println(pajaro.getColor());
        System.out.println(pajaro);
    }
}
