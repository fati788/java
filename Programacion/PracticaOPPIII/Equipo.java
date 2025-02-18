package Programacion.PracticaOPPIII;

public abstract class Equipo {

    protected String nombre;
    protected Integer nivel;

    public Equipo(String nombre, Integer nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public abstract int calcularPuntos();

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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(nombre);
        sb.append("  (").append(calcularPuntos()).append("puntos").append(")");

        return sb.toString();
    }
}
