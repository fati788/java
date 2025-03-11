package Programacion.tema6.Examen2024;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Atrampe {
    private ArrayList<Vuelo>vuelos;
    private ArrayList<ReservaVuelo>reservas;

    public Atrampe() {
        this.vuelos = new ArrayList<>();
        this.reservas = new ArrayList<>();

    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public ArrayList<ReservaVuelo> getReservas() {
        return reservas;
    }
     public void addVuelo(Vuelo vuelo) {
        this.vuelos.add(vuelo);
     }
     public boolean crearReserva(Vuelo vuelo , ArrayList<Pasajero>pasajeros,TipoTarifa tipoTarifa,TipoAsiento tipoAsiento) {

        if (vuelo.verificarDisponibilidad(tipoAsiento)>=pasajeros.size()){
            ReservaVuelo reservaVuelo = new ReservaVuelo(vuelo, tipoTarifa, tipoAsiento);
            for (Pasajero pasajero : pasajeros) {
                reservaVuelo.reservaAsiento(pasajero);
            }
            this.reservas.add(reservaVuelo);
            return true;

        }
        return false;
     }
     public void cancelarRserva(Long id){
       for (ReservaVuelo reserva : reservas){
           if (reserva.getId().equals(id)){
              for (Asiento asiento : reserva.getAsientos()){
                  reserva.getVuelo().liberarAsiento(asiento);
              }
              reservas.remove(reserva);
           }
       }

     }
     public ArrayList<Vuelo>buscarVuelos(String destino){
        ArrayList<Vuelo> vuelosDisponibles = new ArrayList<>();
        for (Vuelo vuelo: vuelos){
            if (vuelo.getDestino().equalsIgnoreCase(destino)){
                vuelosDisponibles.add(vuelo);
            }
        }
        return vuelosDisponibles;

    }
    public ArrayList<Vuelo>buscarVuelos(LocalDate fecha){
        ArrayList<Vuelo>vuelosDisponibles = new ArrayList<>();
        for (Vuelo vuelo: vuelos){
            if (vuelo.getFecha().equals(fecha)){
                vuelosDisponibles.add(vuelo);
            }
        }
        return vuelosDisponibles;
    }
    public ArrayList<Vuelo>buscarVuelos(LocalDate fecha , String destino){
        ArrayList<Vuelo>vuelosDisponibles = new ArrayList<>();
        for (Vuelo vuelo: vuelos){
            if ((vuelo.getFecha().equals(fecha)) && (vuelo.getDestino().equalsIgnoreCase(destino))){
                vuelosDisponibles.add(vuelo);
            }
        }
        return vuelosDisponibles;
    }
    public  ArrayList<ReservaVuelo>buscarReservas(String dni){
        ArrayList<ReservaVuelo>reservaVuelosDisponibles = new ArrayList<>();
        for (ReservaVuelo reserva: reservas){
           for (Pasajero pasajero : reserva.getPasajeros()){
               if (pasajero.getDniPasaporte().equals(dni)){
                   reservaVuelosDisponibles.add(reserva);
               }
           }

        }
        return reservaVuelosDisponibles;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Atrampe{");
        sb.append("vuelos=").append(vuelos);
        sb.append(", reservas=").append(reservas);
        sb.append('}');
        return sb.toString();
    }
}
