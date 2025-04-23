package Programacion.Tema7_part_2.Pactica_2.BancoMart;

import java.time.LocalDate;

public class Transaccion {
    private Long id ;
    private Long autoIncrement = 1L;
    private Cuenta cuenta ;
    private Double importe;
    private LocalDate fecha ;
    private TipoTransaccion tipo;
    private String descripcion;

    public Transaccion(Cuenta cuenta, Double importe, LocalDate fecha, TipoTransaccion tipo, String descripcion) {
        this.autoIncrement++;
        this.id = autoIncrement;
        this.cuenta = cuenta;
        this.importe = importe;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransaccion tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ID: {");
        sb.append(id).append(" } ");
        sb.append("Cuenta: { ").append(cuenta).append(" } / ");
        sb.append("{ ").append(tipo).append(" } de ");
        sb.append("{").append(importe).append(" } € el ");
        sb.append("{ ").append(fecha).append(" } --").append(descripcion);
        return sb.toString();
    }
}
