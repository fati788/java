package Programacion.Tema7_part2.Canciones;

public class Cancion {
    private String titulo;
    private Artista artista;
    private Integer anioLanzamiento;
    private Integer duracionSegs;
    private Double populiridad;
    private Genero genero;

    public Cancion(String titulo, Artista artista, Integer anioLanzamiento, Integer duracionSegs, Double populiridad, Genero genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.anioLanzamiento = anioLanzamiento;
        this.duracionSegs = duracionSegs;
        this.populiridad = populiridad;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Integer getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(Integer anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public Integer getDuracionSegs() {
        return duracionSegs;
    }

    public void setDuracionSegs(Integer duracionSegs) {
        this.duracionSegs = duracionSegs;
    }

    public Double getPopuliridad() {
        return populiridad;
    }

    public void setPopuliridad(Double populiridad) {
        this.populiridad = populiridad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cancion{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", artista=").append(artista);
        sb.append(", anioLanzamiento=").append(anioLanzamiento);
        sb.append(", duracionSegs=").append(duracionSegs);
        sb.append(", populiridad=").append(populiridad);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }
}
