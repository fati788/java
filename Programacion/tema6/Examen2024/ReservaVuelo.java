package Programacion.tema6.Examen2024;

import java.util.ArrayList;

public class ReservaVuelo {
    private static Long autocrimento = 1L;
    private static Long id;
    private Vuelo vuelo;
    private ArrayList<Pasajero>pasajeros;
    private TipoTarifa tipoT;
    private TipoAsiento tipoA;

    public ReservaVuelo( Vuelo vuelo, TipoTarifa tipoT, TipoAsiento tipoA) {
        this.vuelo = vuelo;
        this.tipoT = tipoT;
        this.tipoA = tipoA;
        this.pasajeros = new ArrayList<>();
        autocrimento++;
        this.id = autocrimento;
    }

    public Long getId() {
        return id;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }
    public TipoTarifa getTipoT() {
        return tipoT;
    }

    public void setTipoT(TipoTarifa tipoT) {
        this.tipoT = tipoT;
    }

    public TipoAsiento getTipoA() {
        return tipoA;
    }

    public void setTipoA(TipoAsiento tipoA) {
        this.tipoA = tipoA;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ReservaVuelo{");
        sb.append("id=").append(id);
        sb.append(", CodigoVuelo=").append(vuelo.getCodigo());
        sb.append(", diasFaltan=").append(this.vuelo.diasFaltanVuelo());
        //llama a imprimir Billetes
        sb.append(imprimirBilletes());
        sb.append('}');
        return sb.toString();
    }
    public void addPasajero(Pasajero pa){
        if (!this.pasajeros.contains(pa)) {
            this.pasajeros.add(pa);
        }
    }
    public void removePasajero(Pasajero pa){
        this.pasajeros.remove(pa);
    }
    public ArrayList<Asiento>getAsientos() {
        ArrayList<Asiento> asientosAsignados = new ArrayList<>();
        for (Pasajero p : pasajeros) {
                asientosAsignados.add(p.getAsiento());
        }
        return asientosAsignados;
    }
    public boolean reservaAsiento(Pasajero pasajero){
        if (this.vuelo.verificarDisponibilidad(tipoA)<=0){
            return false;
        }else {
            Asiento asiento = this.vuelo.buscarAsientoDisponible(tipoA);
                Pasajero pasajeroColonado = new Pasajero(pasajero);
               this.getVuelo().ocuparAsiento(asiento, pasajeroColonado);
                   this.addPasajero(pasajeroColonado);
                   return true;
        }

    }
    public double calcularPrecioTotal(){
        double precioTotal = 0;
        for (Asiento asiento : this.getAsientos()) {

                if (tipoT.equals(TipoTarifa.OPTIMA)) {
                   precioTotal+= asiento.CalcularPrecio()*1.1;
                }else if (tipoT.equals(TipoTarifa.CONFORT)){
                    precioTotal+=asiento.CalcularPrecio()*1.15;
                } else if (tipoT.equals(TipoTarifa.FLEXIBLE)) {
                    precioTotal+=asiento.CalcularPrecio()*1.3;
                }

        }
        return precioTotal;
    }
    public  String imprimirBilletes(){
        StringBuffer sb = new StringBuffer("Billetes{ ");
        for (Pasajero pasajero : pasajeros) {
            sb.append("Pasajero : ").append(pasajero.getDniPasaporte());
            sb.append( " ,Asiento : ") .append(pasajero.getAsiento().getCodigo());
            sb.append("\n");
          }
          sb.append(" ,Precio total del reserva ").append(this.calcularPrecioTotal());

       return sb.toString();
    }


}
