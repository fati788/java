package Programacion.Practica1OPP.Ejercicio1;

public class Monstruo {
    enum Clase{GOBLIN , TROLL , SKRALL , DEMONIO , FANTASMA}
    String nombre;
    Clase clase;
    Integer nivel;
    Double salud ;
    Integer puntosD;

    public Monstruo(String nombre, Clase clase, int puntosD) {
        this.nombre = nombre;
        this.clase = clase;
        this.puntosD = puntosD;
        this.nivel = 1;
        this.salud=100.0;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
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
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", puntosD=").append(puntosD);
        sb.append('}');
        return sb.toString();
    }
    public void subirNivel() {
        if (this.nivel<10){
            this.nivel++;
            this.salud += Math.pow(2.5, this.nivel);
        }
    }
    public boolean reducirVida(int puntosD) {

        this.salud-=puntosD;
        if (this.salud<=0){
            this.salud=0.0;
            return true;
        }
        return false;

    }
    /* Un método golpear(Jugador jugador): reduce la salud del jugador tanto como sea el valor de la propiedad
puntosD del monstruo. Para reducir la salud debes llamar al método correspondiente de la clase Jugador.
*/
    public  void golpear(Jugador jugador){
        jugador.reducirVida(puntosD);
    }
}

