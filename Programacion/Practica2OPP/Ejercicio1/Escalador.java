package Programacion.Practica2OPP.Ejercicio1;

public class Escalador extends Ciclista {

    private float aceleracionPremidio;
    private  float gradoRampa;

    @Override
    protected String imprimirTimpo() {
        return "Escalador";
    }

    public Escalador(Integer identificador, String nombre, Integer tiempoAcumulado, float aceleracionPremidio, float gradoRampa) {
        super(identificador, nombre, tiempoAcumulado);
        this.aceleracionPremidio = aceleracionPremidio;
        this.gradoRampa = gradoRampa;
    }

    public float getAceleracionPremidio() {
        return aceleracionPremidio;
    }

    public void setAceleracionPremidio(float aceleracionPremidio) {
        this.aceleracionPremidio = aceleracionPremidio;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Escalador{");
        sb.append(super.toString());
        sb.append(", gradoRampa=").append(gradoRampa);
        sb.append(", aceleracionPremidio=").append(aceleracionPremidio);
        sb.append('}');
        return sb.toString();
    }
}
