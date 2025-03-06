package Programacion.tema6.PracticaOPP5;

import java.util.ArrayList;

public class Serie extends Multimedia{

   private ArrayList<Temporada>temporadas;

    public Serie(String titulo, Boolean plus, Double precion) {
        super(titulo, plus, precion);
        this.temporadas = new ArrayList<>();
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Serie{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", plus=").append(plus);
        sb.append(", precion=").append(precion);
        sb.append(", genero=").append(genero);
        sb.append(", temporadas=").append(temporadas);
        sb.append('}');
        return sb.toString();
    }

    /**
     * un metodo que duevelve los numeros de temporadas
     * @return
     */
    public Integer getNumeroTemporadas() {
        return temporadas.size();
    }

    /**
     * metodo para añadir un temporada
     * pero debemos saber que es el el serie de ete antes de añadir la
     * @param temporada
     */
    public void addTemporada(Temporada temporada) {
        temporada.setSerie(this);
        this.temporadas.add(temporada);
    }

    /**
     * un metodo para eliminar un temporada
     * @param temporada
     */
    public void delTemporada(Temporada temporada) {
        temporada.setSerie(null);
        temporadas.remove(temporada);
    }


}
