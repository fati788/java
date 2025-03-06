package Programacion.tema6.PracticaOPP5;

import java.util.ArrayList;

public class Temporada {
    private Integer numero;
    private ArrayList<Episodio>episodios;
    private Serie serie;

    public Temporada() {
        this.numero = 0;
        this.episodios = new ArrayList<>();
        this.serie = null;
    }

    public Temporada(Integer numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = episodios;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Temporada{");
        sb.append("numero=").append(numero);
        sb.append(", episodios=").append(episodios);
        sb.append(", serie=").append(serie.getTitulo());
        sb.append('}');
        return sb.toString();
    }

    /**
     * metodo para añadir un episodio
     * pero debemos saber que es el temporad de ete antes de añadir la
     * @param episodio
     */
    public void addEpisodio(Episodio episodio) {
        episodio.setTemporada(this);
        this.episodios.add(episodio);
    }

    /**
     * mettodo para eliminar un episodio
     * @param episodio
     */
    public void delEpisodio(Episodio episodio) {
        this.episodios.remove(episodio);
        episodio.setTemporada(null);
    }

}
