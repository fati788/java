package Programacion.tema6.Practica5;

public class ClientePrimePro  extends Cliente {

    private static final Double precioMensualP = 5.0;

    public ClientePrimePro() {
        super();
    }

    public ClientePrimePro(String nombre, String dni, String email , Double precioMensualP) {
        super(nombre, dni, email);
        this.precioMensoal = 5.0;
    }

    @Override
    public Boolean esPro() {
        return true;
    }

    @Override
    public Double getPrioMensual() {
        return 5.0;
    }
}
