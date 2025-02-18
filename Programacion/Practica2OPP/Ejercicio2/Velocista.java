package Programacion.Practica2OPP.Ejercicio2;

public class Velocista extends Ciclista {

    private double potenciaPromedio;
    private  double velocidadPromedio;


    public Velocista(Integer identificador, String nombre, Integer tiempoAcumulado, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre, tiempoAcumulado);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    protected String imprimirTimpo() {
        return "Velocista";
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Velocista{");
        sb.append(super.toString());
        sb.append(", potenciaPromedio=").append(potenciaPromedio);
        sb.append(", velocidadPromedio=").append(velocidadPromedio);
        sb.append('}');
        return sb.toString();
    }
}
