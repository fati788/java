package Programacion.EjerciciosClase;

public class TestConsumo {
    public static void main(String[] args) {
        Consumo c1 = new Consumo(1200.0 , 25.3 , 120.5 , 2500.2 );
        Consumo c2 = new Consumo(1200.0 , 25.3 , 120.5 , 2500.2 );
        Consumo c3 = new Consumo(1200.0 , 25.3 , 120.5 , 2500.2 );

        System.out.println(c1);
        System.out.println("El Consumo medio del vehículo en litros es :  "+ c1.ConsumoMedio() + " litros");
        System.out.println("El Consumo medio del vehículo en Euros es :  "+ c1.consumoEuros() + " euros");





    }
}
