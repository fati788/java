package Programacion.Practica1OPP.Ejercicio2;

public class Prueba {

    private String descrepcion;
    private Integer nivelDificultad;
    private Integer recompensa;

    public Prueba(String descrepcion, Integer nivelDificultad, Integer recompensa) {
        this.descrepcion = descrepcion;
        this.nivelDificultad = nivelDificultad;
        this.recompensa = recompensa;
    }

    public String getDescrepcion() {
        return descrepcion;
    }

    public void setDescrepcion(String descrepcion) {
        this.descrepcion = descrepcion;
    }

    public Integer getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(Integer nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public Integer getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(Integer recompensa) {
        this.recompensa = recompensa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Prueba{");
        sb.append("descrepcion='").append(descrepcion).append('\'');
        sb.append(", nivelDificultad=").append(nivelDificultad);
        sb.append(", recompensa=").append(recompensa);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Devuelve true si la potencia es mayor quel nivel de dificultatd
     *
     * @param hechizo
     * @return
     */
    public boolean  resolver(Hechizo hechizo){
        if (hechizo.getPotencia()>= this.nivelDificultad){
            System.out.println("El hechizo supera al nivel de dificultad");
            return true;
        }else {
            System.out.printf(" El hechizo no puede superar al nivel de dificultad ");
            return false;
        }

    }
}
