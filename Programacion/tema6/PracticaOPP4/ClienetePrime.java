package Programacion.tema6.PracticaOPP4;

public class ClienetePrime extends Clienete{

    private static final Double precioMensualM=3.0;

    public ClienetePrime(String dni, String nombre, String email) {
        super(dni, nombre, email);

    }

    @Override
    public boolean esPro() {
        return false;
    }

    @Override
    public Double getPrecioMensual() {
        return precioMensualM;
    }


}
