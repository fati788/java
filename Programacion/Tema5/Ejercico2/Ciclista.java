package Programacion.Tema5.Ejercico2;

public abstract class Ciclista {

    private Integer identificador;
    private String nombre;
    private Integer tiempoAcumulado =0;

    protected abstract String imprimirTimpo();

    public Ciclista(Integer identificador, String nombre, Integer tiempoAcumulado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = tiempoAcumulado;

    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(Integer tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ciclista{");
        sb.append("identificador=").append(identificador);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tiempoAcumulado=").append(tiempoAcumulado);
        sb.append('}');
        return sb.toString();
    }
}
