package Programacion.tema6.PracticaOPP5;

public class ClientePrime extends Cliente {
    private  static final Double precioMensualHijo = 3.0;

    public ClientePrime() {
        super();
    }

    public ClientePrime(String nombre, String dni, String email , Double precioMensualHijo) {
        super(nombre, dni, email);

    }

    @Override
    public Boolean esPro() {
        return false;
    }

    @Override
    public Double getPrioMensual() {
        return 3.0;
    }
}
