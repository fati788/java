package Programacion.Tema7_part3.PracticaClase.Ejercicio3.service;

import Programacion.Tema7_part3.PracticaClase.Ejercicio3.model.Compra;
import Programacion.Tema7_part3.PracticaClase.Ejercicio3.model.Producto2Mano;
import Programacion.Tema7_part3.PracticaClase.Ejercicio3.model.Usuario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class VentasUsuario {
    private Usuario usuario;
    private Set<Producto2Mano>productosDisponibles;
    private ArrayList<Compra> ventas;
    private   ArrayList<Compra>compras;

    public VentasUsuario() {
        this.productosDisponibles = new HashSet<>();
        this.ventas = new ArrayList<>();
        this.compras = new ArrayList<>();
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<Producto2Mano> getProductosDisponibles() {
        return productosDisponibles;
    }

    public void setProductosDisponibles(Set<Producto2Mano> productosDisponibles) {
        this.productosDisponibles = productosDisponibles;
    }

    public ArrayList<Compra> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Compra> ventas) {
        this.ventas = ventas;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VentasUsuario{");
        sb.append("usuario=").append(usuario);
        sb.append(", productosDisponibles=").append(productosDisponibles);
        sb.append(", ventas=").append(ventas);
        sb.append(", compras=").append(compras);
        sb.append('}');
        return sb.toString();
    }

    public void addProducto(Producto2Mano p) {
        this.productosDisponibles.add(p);
    }
    public void deleteProducto(Producto2Mano p) {
        this.productosDisponibles.remove(p);
    }
    public void addVenta(Compra c ){
        this.ventas.add(c);
    }
    public void addCompra(Compra c ){
        this.compras.add(c);
    }
    public void mostrarVentas(){
        this.ventas.forEach(System.out::println);
    }
    public void mostrarCompras(){
        this.compras.forEach(System.out::println);
    }

}
