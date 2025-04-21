package Programacion.Tema7_Part1.EjemploGenerico;

public abstract class Robot {
    protected String nombre;
    protected  Integer energia;

    public Robot(String nombre, Integer energia) {
        this.nombre = nombre;
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Robot{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energia=").append(energia);
        sb.append('}');
        return sb.toString();
    }
}
