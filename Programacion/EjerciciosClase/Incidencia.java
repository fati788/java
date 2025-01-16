package Programacion.EjerciciosClase;

public class Incidencia {

    enum Estado {ABIERTA , ENPROCESO,RESUELTA}
    private Integer codigo;
    private  Estado estado;
    private String problema;
    private String solucion;
    private static Integer pedientes =0;

    public Incidencia(Integer codigo, Incidencia.Estado estado, String solucion, String problema) {

        this.codigo = codigo;
        this.estado = estado;
        this.solucion = solucion;
        this.problema = problema;
        Incidencia.pedientes++;
    }

    public  void resuelve() {
        if (estado.equals( Estado.RESUELTA)){
            Incidencia.pedientes--;

        }

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Incidencia{");
        sb.append("codigo=").append(codigo);
        sb.append(", estado=").append(estado);
        sb.append(", problema='").append(problema).append('\'');
        sb.append(", solucion='").append(solucion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public static Integer getPedientes() {
        return pedientes;
    }
}
