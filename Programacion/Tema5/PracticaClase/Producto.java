package Programacion.Tema5.PracticaClase;

import java.util.Objects;

public class Producto {
    private  Integer id;
    private String descripcion;
    private Double precioUnitario;
    private Integer unidadesDisponibles;
    private  Integer stockMaximo;
    private  Double descuento;

    public Producto() {
        this.unidadesDisponibles = 0;
        this.stockMaximo = 0;
        this.descuento = 0.0;
        this.precioUnitario = 0.0;
        this.id = null;
        this.descripcion = " No tiene descripcion ";
    }

    public Producto(Integer id, String descripcion, Double precioUnitario, Integer unidadesDisponibles, Integer stockMaximo, Double descuento) {
        this.id = id;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.unidadesDisponibles = unidadesDisponibles;
        this.stockMaximo = stockMaximo;
        this.descuento = descuento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(Integer unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("id=").append(id);
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precioUnitario=").append(precioUnitario);
        sb.append(", unidadesDisponibles=").append(unidadesDisponibles);
        sb.append(", stockMaximo=").append(stockMaximo);
        sb.append(", descuento=").append(descuento);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
