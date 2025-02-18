package Programacion.Practica2OPP.Ejercicio1;

public abstract class Personaje {

    protected   String nombre;
    protected   Integer nivel ;
    protected   Double salud;


    public Personaje(String nombre, Integer nivel, Double salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
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

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append('}');
        return sb.toString();
    }

    protected abstract void golpear(Personaje persona);

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

}
