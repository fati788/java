package Programacion.Tema5.Ejercico2;

public class Contrarrelojista extends Ciclista {

    private Double velocidadMax;


    @Override
    protected String imprimirTimpo() {
        return "";
    }

    public Contrarrelojista(Integer identificador, String nombre, Integer tiempoAcumulado, Double velocidadMax) {
        super(identificador, nombre, tiempoAcumulado);
        this.velocidadMax = velocidadMax;
    }

    public Double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contrarrelojista{");
        sb.append("velocidadMax=").append(velocidadMax);
        sb.append('}');
        return sb.toString();
    }
}
