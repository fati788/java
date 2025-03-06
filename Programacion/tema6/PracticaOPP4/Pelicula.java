package Programacion.tema6.PracticaOPP4;

public class Pelicula extends Multimedia {

    private Integer duracion;

    public Pelicula(String titulo, Boolean plus, Double precion,Integer duracion) {
        super(titulo, plus, precion);
        this.duracion = duracion;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pelicula{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", plus=").append(plus);
        sb.append(", precion=").append(precion);
        sb.append(", genero=").append(genero);
        sb.append(", duracion=").append(duracion);
        sb.append('}');
        return sb.toString();
    }
}
