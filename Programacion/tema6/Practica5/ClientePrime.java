package Programacion.tema6.Practica5;

public class ClientePrime extends Cliente {
    private  static final Double precioMensualHijo = 3.0;

    public ClientePrime() {
        super();
    }

    public ClientePrime(String nombre, String dni, String email , Double precioMensualHijo) {
        super(nombre, dni, email);
        this.precioMensoal =3.0;
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
