package Programacion.Practica1OPP.Ejercicio2;

public class Hechizo {

    private String nombre;
      private Integer energiaNecessaria;
      private Integer potencia ;    //del 0 al 10

    public Hechizo(String nombre, Integer energiaNecessaria, Integer potencia) {
        this.nombre = nombre;
        this.energiaNecessaria = energiaNecessaria;
        this.potencia = potencia;
    }

    public Integer getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(Integer energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hechizo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energiaNecessaria=").append(energiaNecessaria);
        sb.append(", potencia=").append(potencia);
        sb.append('}');
        return sb.toString();
    }

    public boolean esEfectivo(Prueba prueba){
        if (this.getPotencia() >= prueba.getNivelDificultad()){
            return true;
        }else {
            return false;
        }
    }
}










