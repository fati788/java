package Programacion.tema6.EjercicioRepaso11;

import java.time.LocalDate;
import java.util.UUID;

public class NovelaGrafica extends Comic {
    private String resumen;

    public NovelaGrafica( String titulo, LocalDate fecha, Double precio, Integer numeroPaginas ,String resumen ,Integer numeroEjemplares) {
        super( titulo, fecha, precio, numeroPaginas,numeroEjemplares);
        this.resumen = resumen;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NovelaGrafica{");
        sb.append("resumen='").append(resumen).append('\'');
        sb.append(", id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", precio=").append(precio);
        sb.append(", numeroPaginas=").append(numeroPaginas);
        sb.append(", autores=").append(autores);
        sb.append('}');
        return sb.toString();
    }
}
