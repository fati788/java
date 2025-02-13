package Programacion.Tema5.PracticaClase.GestionEmpleados;

public class Repartidor extends Empleado {
    enum Zona{ZONA1,ZONA2,ZONA3,ZONA4}
    private Zona zona;

    public Repartidor(String nombre, Integer edad, Double sualario , Zona zona ) {
        super(nombre, edad, sualario);
        this.zona = zona;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }



    @Override

    public boolean aplicaPLUS() {
       if (this.edad<25 && this.zona.equals(Zona.ZONA3)){
          return true;
       }else {
           return false;
       }
    }



}
