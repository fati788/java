package Programacion.tema6.EjercicioRepaso11;

import java.util.Objects;

public class LineaCompra {

    private Comic comic;
    private  Integer cantidad;

    public LineaCompra(Comic comic, Integer cantidad) {
        this.comic = comic;
        this.cantidad = cantidad;
    }

    public Comic getComic() {
        return comic;
    }

    public void setComic(Comic comic) {
        this.comic = comic;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LineaCompra{");
        sb.append("comic=").append(comic);
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LineaCompra that = (LineaCompra) o;
        return Objects.equals(comic, that.comic);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(comic);
    }
}
