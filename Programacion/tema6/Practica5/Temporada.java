package Programacion.tema6.Practica5;

import java.util.ArrayList;

public class Temporada {
    private Integer numero;
    private ArrayList<Episodio>episodios;
    private Series serie;

    public Temporada(Integer numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    public Temporada() {
        this.numero = 0;
        this.episodios = new ArrayList<>();
        this.serie = null;
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

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }
    public Integer getNumeroEpisodios() {
        return episodios.size();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Temporada{");
        sb.append("numero=").append(numero);
        sb.append(", serie=").append(serie.getTitulo());
        sb.append(", episodios=").append(episodios);
        sb.append('}');
        return sb.toString();
    }
    public void addEpisodio(Episodio episodio) {
        episodio.setTemporada(this);
        episodios.add(episodio);
    }
    public void delEpisodio(Episodio episodio) {
         episodios.remove(episodio);
    }

}
