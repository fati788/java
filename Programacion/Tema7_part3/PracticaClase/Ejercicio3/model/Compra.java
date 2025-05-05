package Programacion.Tema7_part3.PracticaClase.Ejercicio3.model;

import java.time.LocalDate;

public class Compra {
    private Usuario usuarioComprador;
    private Usuario usuarioVendedor;
    private Producto2Mano producto;
    private LocalDate fecha;
    private Double precio;    //puede ser < al precioVenta
                               //pero no puede ser >

    public Compra(Usuario usuarioComprador, Usuario usuarioVendedor, Producto2Mano producto, LocalDate fecha, Double precio) {
        this.usuarioComprador = usuarioComprador;
        this.usuarioVendedor = usuarioVendedor;
        this.producto = producto;
        this.fecha = fecha;
        this.precio = precio;
    }

    public Usuario getUsuarioComprador() {
        return usuarioComprador;
    }

    public void setUsuarioComprador(Usuario usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }

    public Usuario getUsuarioVendedor() {
        return usuarioVendedor;
    }

    public void setUsuarioVendedor(Usuario usuarioVendedor) {
        this.usuarioVendedor = usuarioVendedor;
    }

    public Producto2Mano getProducto() {
        return producto;
    }

    public void setProducto(Producto2Mano producto) {
        this.producto = producto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("usuarioComprador=").append(usuarioComprador);
        sb.append(", usuarioVendedor=").append(usuarioVendedor);
        sb.append(", producto=").append(producto);
        sb.append(", fecha=").append(fecha);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
