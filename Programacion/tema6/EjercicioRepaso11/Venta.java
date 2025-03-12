package Programacion.tema6.EjercicioRepaso11;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {

    private Cliente cliente;
    private ArrayList<LineaCompra>lineas;
    private LocalDate fechaVenta;

    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.lineas = new ArrayList<>();
        this.fechaVenta = LocalDate.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<LineaCompra> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaCompra> lineas) {
        this.lineas = lineas;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Venta{");
        sb.append("cliente=").append(cliente);
        sb.append(", lineas=").append(lineas);
        sb.append(", fechaVenta=").append(fechaVenta);
        sb.append('}');
        return sb.toString();
    }
    public void addLinea(LineaCompra linea) {
        int posiciopn = this.lineas.indexOf(linea);
        if (posiciopn>0){
            LineaCompra lc = this.lineas.get(posiciopn);
            lc.setCantidad(lc.getCantidad()+linea.getCantidad());
        }else {
            this.lineas.add(linea);
        }
    }
}
