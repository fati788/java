package Programacion.tema6.EjercicioRepaso11;

public class ExepcionStock extends RuntimeException {
    public ExepcionStock() {
        System.out.println("No quedan mas ejemplares de este comic");

    }
}
