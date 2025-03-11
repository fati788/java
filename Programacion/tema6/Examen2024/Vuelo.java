package Programacion.tema6.Examen2024;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;

public class Vuelo {
    private String codigo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime hora;
    private Double precioBase;
    private Integer asientosDisponibles;
    private ArrayList<Asiento>asientos;

    public Vuelo(String codigo, String origen, String destino, LocalDate fecha, LocalTime hora, Double precioBase, Integer asientosDisponibles) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.precioBase = precioBase;
        this.asientosDisponibles = asientosDisponibles;
        this.asientos = new ArrayList<>();
        int countAB = (int) (asientosDisponibles*0.3);
        int countAT = asientosDisponibles-countAB;
        for (int i = 0; i < countAB; i++) {
            AsientoBusiness asientoB = new AsientoBusiness(12L+i ,this.precioBase,5,"F",true);
            this.asientos.add(asientoB);
        }
        for (int i = 0; i < countAT; i++) {
            AsientoTurista asientoTurista = new AsientoTurista(1L+i,this.precioBase,7,"O",true);
            this.asientos.add(asientoTurista);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(Integer asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vuelo{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", origen='").append(origen).append('\'');
        sb.append(", destino='").append(destino).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", hora=").append(hora);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", asientosDisponibles=").append(asientosDisponibles);
        sb.append(", asientos=").append(asientos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(codigo, vuelo.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
    public int verificarDisponibilidad(TipoAsiento tipoAsiento){
        int disponibilidad = 0;
        for (Asiento asiento : asientos){
            if ((asiento.getTipo().equals(tipoAsiento)) && (asiento.getPasajero()==null)){
                disponibilidad++;
            }
        }
        return disponibilidad;
    }
    public Asiento buscarAsientoDisponible(TipoAsiento tipoAsiento){
        for (Asiento asiento : asientos) {
            if ((asiento.getTipo().equals(tipoAsiento)) && (asiento.getPasajero() == null)) {
                 return asiento;
            }
        }
        return null;
    }
    public boolean ocuparAsiento(Asiento asiento, Pasajero pasajero){
        if (asiento.getPasajero()==null){
            pasajero.setAsiento(asiento);
            asiento.setPasajero(pasajero);
            return true;
        }
        return false;
    }
    public void liberarAsiento(Asiento asiento){
        if (asiento.getPasajero()!=null){
            asiento.getPasajero().setAsiento(null); // eso el primero
            asiento.setPasajero(null);

        }
    }
    public long diasFaltanVuelo(){
       return ChronoUnit.DAYS.between( LocalDate.now(),this.getFecha());
    }

    public ArrayList<Pasajero>getPasajeros() {
        ArrayList<Pasajero>pasajeros = new ArrayList<>();
        for (Asiento asiento : asientos){
            if (asiento.getPasajero()!=null){
                pasajeros.add(asiento.getPasajero());
            }
        }
        return pasajeros;
    }


}
