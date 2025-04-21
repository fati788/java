package Programacion.Tema7_Part1.EjerciciosRepaso.TreeMap;

import java.time.LocalDateTime;
import java.util.TreeMap;

public class AgendaCitas {
    private TreeMap<LocalDateTime,String> citas;

    public AgendaCitas() {
       this.citas = new TreeMap<>(); //Ordena por LocalDateTime por defecto
    }

    public int addCita(String descrepcion , LocalDateTime fecha) {
        if (fecha.isBefore(LocalDateTime.now())) {
            return 1;
        }
        //comprobar que no tenemos una cita en ese fecha
        if (this.citas.containsKey(fecha)) {
            return 2;
        }
        this.citas.put(fecha, descrepcion);
        return 0;
    }
    public void mostrarPreximasCitas() {

        for (LocalDateTime fecha : this.citas.keySet()) {
            System.out.println(fecha + " -> " + this.citas.get(fecha));
        }
    }
    public String deleteCita(LocalDateTime fecha) {
        return this.citas.remove(fecha);
    }




}
