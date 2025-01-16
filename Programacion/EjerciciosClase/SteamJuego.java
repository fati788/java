package Programacion.EjerciciosClase;

public class SteamJuego {
private String nombre;
private String descripcionCorta;
private Double mediaJugadorDiarios;
private Integer diasDesdeSalida;
private Double precio;
private String puestosMasVendidos;

    public SteamJuego(String nombre, String descripcionCorta, Double mediaJugadorDiarios, Integer diasDesdeSalida, Double precio, String puestosMasVendidos) {
        this.nombre = nombre;
        this.descripcionCorta = descripcionCorta;
        this.mediaJugadorDiarios = mediaJugadorDiarios;
        this.diasDesdeSalida = diasDesdeSalida;
        this.precio = precio;
        this.puestosMasVendidos = puestosMasVendidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public Integer getDiasDesdeSalida() {
        return diasDesdeSalida;
    }

    public void setDiasDesdeSalida(Integer diasDesdeSalida) {
        this.diasDesdeSalida = diasDesdeSalida;
    }

    public Double getMediaJugadorDiarios() {
        return mediaJugadorDiarios;
    }

    public void setMediaJugadorDiarios(Double mediaJugadorDiarios) {
        this.mediaJugadorDiarios = mediaJugadorDiarios;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getPuestosMasVendidos() {
        return puestosMasVendidos;
    }

    public void setPuestosMasVendidos(String puestosMasVendidos) {
        this.puestosMasVendidos = puestosMasVendidos;
    }
    public void jugadoresDia(int jugadoresHoy){

        mediaJugadorDiarios = ((mediaJugadorDiarios * diasDesdeSalida) + jugadoresHoy) / (diasDesdeSalida+ 1);


    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SteamJuego{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", descripcionCorta='").append(descripcionCorta).append('\'');
        sb.append(", mediaJugadorDiarios=").append(mediaJugadorDiarios);
        sb.append(", diasDesdeSalida=").append(diasDesdeSalida);
        sb.append(", precio=").append(precio);
        sb.append(", puestosMasVendidos='").append(puestosMasVendidos).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
