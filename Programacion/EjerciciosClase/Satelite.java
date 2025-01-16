package Programacion.EjerciciosClase;

public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distancia_tierra;
    Satelite (double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }
    Satelite () {
        meridiano=paralelo=distancia_tierra=0;
    }

    public double getMeridiano() {
        return meridiano;
    }

    public void setMeridiano(double meridiano) {
        this.meridiano = meridiano;
    }

    public double getParalelo() {
        return paralelo;
    }

    public void setParalelo(double paralelo) {
        this.paralelo = paralelo;
    }

    public double getDistancia_tierra() {
        return distancia_tierra;
    }

    public void setDistancia_tierra(double distancia_tierra) {
        this.distancia_tierra = distancia_tierra;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Satelite{");
        sb.append("meridiano=").append(meridiano);
        sb.append(", paralelo=").append(paralelo);
        sb.append(", distancia_tierra=").append(distancia_tierra);
        sb.append('}');
        return sb.toString();
    }
    public void variaAltura(double desplazamienta){


    }
    public boolean enOrbita(){
        if(distancia_tierra<=0){
            return false;
        }else {
            return true;
        }

    }
    public void variaPosicion(double variap, double variam){

    }
    /*Modifica la clase Satélite y añádele los siguientes métodos:
- Metodo void variaAltura(double desplazamiento). Este método acepta un parámetro que
será positivo o negativo dependiendo de si el satélite tiene que alejarse o acercarse a La Tierra.
- Método boolean enOrbita(). Este método devolverá false si el satélite está en tierra y true en caso
contrario.
- Método void variaPosicion(double variap, double variam). Este método permite
modificar los atributos de posición (meridiano y paralelo) mediante los parámetros variap y variam. Estos
parámetros serán valores positivos o negativos relativos que harán al satélite modificar su posición*/
}

