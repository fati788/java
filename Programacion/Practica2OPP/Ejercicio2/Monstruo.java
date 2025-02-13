package Programacion.Practica2OPP.Ejercicio2;

public class Monstruo extends Personaje {
    enum Clase{GOBLIN , TROLL , SKRALL , DEMONIO , FANTASMA}

   private Clase clase;
    private  Integer puntosD;


    public Monstruo(String nombre, Clase clase, Integer puntosD) {
        super(nombre);
        this.clase = clase;
        this.puntosD = puntosD;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Integer getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Integer puntosD) {
        this.puntosD = puntosD;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", clase=").append(clase);
        sb.append(", puntosD=").append(puntosD);
        sb.append('}');
        return sb.toString();
    }



    /* Un método golpear(Jugador jugador): reduce la salud del jugador tanto como sea el valor de la propiedad
puntosD del monstruo. Para reducir la salud debes llamar al método correspondiente de la clase Jugador.
*/
    protected  void golpear(Personaje persona){

        persona.reducirVida(puntosD);
    }
}

