package Programacion.tema6.PracticaOPP4;

public class ClienetePrimePro extends Clienete{

    private static  final Double precioMensualH=5.0;

    public ClienetePrimePro(String dni, String nombre, String email) {
        super(dni, nombre, email);

    }

    @Override
    public boolean esPro() {
        return true;
    }

    @Override
    public Double getPrecioMensual() {
        return precioMensualH;
    }
}
