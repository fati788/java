package Programacion.Prueba2Examen2025Fatima;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Enviable {

     private static Long autocriment=1L;
     private Long id;
     private Cliente cliente;
     private Coche coche;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private  Double precioTotal ;

    public Alquiler(Cliente cliente, Coche coche, LocalDate fechaInicio, LocalDate fechaFin) {
        autocriment++;
        this.id = autocriment;
        this.cliente = cliente;
        this.coche = coche;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        //se calcula el precio total segun los dias de alquiler

    }

    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    /**
     * cancerlar alquieler ---> cabiar la disponibilidad
     */
    public void cancelarAlquiler() {
        this.coche.setDisponible(true);

    }

    /**
     * Mostrar los informaciones del alquiler es como toString()
     * @return
     */
    @Override
    public String crearEmail() {
        StringBuffer sb = new StringBuffer("Alquiler{");
        sb.append(" nombre de cliente=").append(cliente.getNombre());
        sb.append(", apellidos=").append(cliente.getApellidos());
        sb.append(" , marca del coche=").append(coche.getMarca());
        sb.append(" , modelo del coche=").append(coche.getModelo());
        sb.append(" , matricula del coche=").append(coche.getMatricula());
        sb.append(" , fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append(" , precio Del coche=").append(coche.getPrecioBase()); //no se si esta el precio total !!!!1
        sb.append("}");
        return  sb.toString();
    }


}
