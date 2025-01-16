package Programacion.Tema4;

public class TestTarjetaRegalo {
    public static void main(String[] args) {
          TarjetaRegalo tarjeta = new TarjetaRegalo( "ES12341352341" , 1000);
          TarjetaRegalo tarjeta2 = new TarjetaRegalo( "ES12341352341" , 500);

        System.out.println(tarjeta);
        System.out.println(tarjeta2);
        tarjeta.gasta(100.0);
        tarjeta.fusionarTarjeta(tarjeta2);
        System.out.println(tarjeta);
        System.out.println(tarjeta2);
    }
}
