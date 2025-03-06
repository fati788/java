package Programacion.tema6.PracticaOPP4;

public class Episodio {

    private String titulo;
    private String duracion;
    private Temporada temporada;

    public Episodio() {
        this.titulo = "";
        this.duracion = "";
        this.temporada = null;
    }

    public Episodio(String titulo, String duracion) {
        this.titulo = titulo;
        this.duracion = duracion;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Episodio{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", duracion='").append(duracion).append('\'');
        sb.append(", temporada=").append(temporada.getNumero());
        sb.append('}');
        return sb.toString();
    }
}
