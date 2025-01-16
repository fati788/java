package Programacion.EjerciciosClase;

public class TestCochee {
    public static void main(String[] args) {
        Cochee coche1 = new Cochee(10);
        System.out.println(coche1);
        coche1.acalera(20);
        System.out.println(coche1);
        coche1.frena(10);
        System.out.println(coche1);

    }
}
