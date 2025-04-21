package Programacion.Tema7_Part1.EjemploGenerico;

import java.util.ArrayList;

public class Liga <T extends Robot>{
    private String nombre;
    private ArrayList<T> robots;

    public Liga(String nombre) {
        this.nombre = nombre;
        this.robots = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<T> getRobots() {
        return robots;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Liga{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", robots=").append(robots);
        sb.append('}');
        return sb.toString();
    }
    public void addRobot(T robot) {
        this.robots.add(robot);
    }
}
