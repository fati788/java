package Programacion.tema6.Ejercico1ClaseRepaso;

import java.time.LocalDate;

public class NovelaGrafica extends Comic{
    private String resumen;
    public NovelaGrafica(String titulo, LocalDate fecha, Double precio, Integer numeroPaginas , String resumen) {
        super(titulo, fecha, precio, numeroPaginas);
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
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", precio=").append(precio);
        sb.append(", numeroPaginas=").append(numeroPaginas);
        sb.append(", autores=").append(autores);
        sb.append(", resumen='").append(resumen).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
