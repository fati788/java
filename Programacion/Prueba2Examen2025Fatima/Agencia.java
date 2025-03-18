package Programacion.Prueba2Examen2025Fatima;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Agencia {

    private ArrayList<Coche>coches;
    private ArrayList<Alquiler>alquilers;

    public Agencia() {
        this.coches = new ArrayList<>();
        this.alquilers = new ArrayList<>();
    }

    /**
     * añadir un coche a la lista
     * @param c
     */
    public void  addCoche(Coche c) {
        if (!this.coches.contains(c)) {
            this.coches.add(c);
        }
    }

    /**
     * remove un coche de la lista
     * @param c
     */
    public  void removeCoche(Coche c) {
        this.coches.remove(c);
    }

    /**
     * Mostrar los coches disponibles (no alquiladas)
     */
     public void listarCochesDisponibles() {
         System.out.println("-------Coche Disponible-------");
        for (Coche c : this.coches) {
            if (c.getDisponible()) {
                System.out.println(c);
            }
        }
         System.out.println("------------------------------");
     }

    /**
     * Mostrar los coches que tienen un fecha de finAlquilar
     * despuis la fecha actual
     */
    public void listarAlquilersActivos() {
         System.out.println("-------Alquiler Activos-------");
        for (Alquiler a : this.alquilers) {
            if (a.getFechaFin().isAfter(LocalDate.now()) && a.getFechaInicio().isBefore(LocalDate.now())) {
                System.out.println(a);
            }
        }
         System.out.println("------------------------------");
     }

    /**
     * Buscar un coche del tipo indicado duevelve
     * el primer coche encontrado
     * si no hay lanzar un exepcion
     * @param tipo
     * @return
     * @throws NoHayCochesDisponible
     */
     public Coche buscarCoche(TipoCoches tipo ) throws NoHayCochesDisponible {
        for (Coche c : this.coches) {
            if (c.getDisponible() && c.getTipo().equals(tipo)) {
                return c;
            }
        }
        throw new NoHayCochesDisponible("No hay coche disponible de este tipo " +tipo);

     }

    /**
     * Realizar un compra si hay coche de tipo disponible
     * y crear un Alquiler
     * actualizar disponible ----> false
     * devuelve true ai ha realizado el alquiler
     * sino devuelve false
     * @param cliente
     * @param tipo
     * @param fechaInicio
     * @param fechaFin
     * @return
     */

     public Boolean realizarAlquiler(Cliente cliente , TipoCoches tipo , LocalDate fechaInicio ,LocalDate fechaFin)  {

        //Comprueba si existe coche del tipo indicado
        Coche coche = null;
         for (Coche c : this.coches) {
             if (c.getDisponible() && c.getTipo().equals(tipo)) {
                 coche = c;
             }
         }
         //si hay crear un objeto alquiler y añadir lo a la lista
         if (coche != null) {
            Alquiler alquiler = new Alquiler(cliente,coche,fechaInicio,fechaFin);
            //Calcular El precio total
             int numDias = (int) ChronoUnit.DAYS.between(fechaInicio, fechaFin);
             alquiler.setPrecioTotal(coche.calcularPrecioAlquiler(numDias));
            coche.setDisponible(false);
            this.alquilers.add(alquiler);
             System.out.println(alquiler.crearEmail());
            return true;
         }else {
             return false;
         }


     }

     public double ModtrarIngresos(){
         double total = 0;
         for (Alquiler a : this.alquilers) {
             if (a.getFechaInicio().isBefore(LocalDate.now()) &&
                     a.getFechaFin().isBefore(LocalDate.now())) {
                 total+= a.getPrecioTotal();
             }
         }
         return total;
     }




}
