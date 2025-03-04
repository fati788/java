package Programacion.tema6.Ejercico1ClaseRepaso;

import java.time.LocalDate;

public class Anime extends Comic{

    private  Integer episodio;
    private String serie;
    public Anime(String titulo, LocalDate fecha, Double precio, Integer numeroPaginas , String serie, Integer episodio) {
        super(titulo, fecha, precio, numeroPaginas);
        this.serie = serie;
        this.episodio = episodio;
    }

    public Integer getEpisodio() {
        return episodio;
    }

    public void setEpisodio(Integer episodio) {
        this.episodio = episodio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Anime{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", precio=").append(precio);
        sb.append(", numeroPaginas=").append(numeroPaginas);
        sb.append(", autores=").append(autores);
        sb.append(", episodio=").append(episodio);
        sb.append(", serie='").append(serie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
