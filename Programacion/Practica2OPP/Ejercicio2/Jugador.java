package Programacion.Practica2OPP.Ejercicio2;

public class Jugador extends Personaje {

    enum  Clase{MAGO , BRUJO , BARBARO , CABALLERO}
    private Clase clase;
    private  Integer experiencia;
    private Arma armaDerecha;
    private  Arma armaIzquierda;

    public Jugador(String nombre, Clase clase) {
        super(nombre);
        this.clase = clase;
       this.experiencia=0;
        this.armaDerecha=null;
        this.armaIzquierda=null;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }



    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }


    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", clase=").append(clase);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append('}');
        return sb.toString();
    }

    /**
     * asignará este arma a onos de los manos y duevelve true
     * Si están ocupados los dos devolverá false
     * @param arma
     * @return
     */

    public boolean equipar(Arma arma) {
        if (arma.getDosManos()) {
            if (armaDerecha == null && armaIzquierda == null) {
                armaDerecha = arma;
                armaIzquierda = arma;
                return true;
            }
        } else {
            if (armaDerecha == null) {
                armaDerecha = arma;
                return true;
            } else if (armaIzquierda == null) {
                armaIzquierda = arma;
                return true;
            }
        }
        return false;
    }


    /**
     * subir la salud del jugador con valor de puntos si es menor que 10000
     * @param puntos
     */
    public void tomarPocion(int puntos) {
        if (this.salud<10000){
            this.salud+=puntos;
            if (this.salud>10000){
                this.salud=10000.0;
            }
        }
    }

    /**
     * reduce la salud del monstruo tanto como sea el valor de la
     * propiedad puntosD de las armas para eso usamos la method reducirVida
     * @param persona
     */
    protected void golpear(Personaje persona){
        if (this.getArmaDerecha()!=null){
            persona.reducirVida(this.getArmaDerecha().getPuntosD());
            if (! this.getArmaDerecha().getDosManos()){
                if (this.getArmaIzquierda()!=null){
                    persona.reducirVida(this.getArmaIzquierda().getPuntosD());
                }
            }
        }
        if (persona.getSalud() <=0){
            this.experiencia +=10* persona.getNivel();

        }
        if (this.experiencia %100==0 ){
            this.subirNivel();
        }

    }

    }






