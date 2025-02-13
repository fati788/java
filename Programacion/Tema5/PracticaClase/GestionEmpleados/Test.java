package Programacion.Tema5.PracticaClase.GestionEmpleados;

public class Test {
    public static void main(String[] args) {

        Comercial cm1 = new Comercial("Isa" ,22,2000.0,100.0);
        Comercial cm2 = new Comercial("sos" ,31,2000.0,210.0);
        System.out.println(cm1);
        System.out.println(cm2);
        Repartidor r1 =new Repartidor("Noha" , 22 , 1000.0 , Repartidor.Zona.ZONA1);
        Repartidor r2 = new Repartidor("Faty" , 18 , 1500.0 , Repartidor.Zona.ZONA1);
        System.out.println(r1);
        System.out.println(r2);

    }
}
