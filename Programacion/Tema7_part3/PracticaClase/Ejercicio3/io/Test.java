package Programacion.Tema7_part3.PracticaClase.Ejercicio3.io;

import Programacion.Tema7_part3.PracticaClase.Ejercicio3.service.GestionComprasVentas;

public class Test {
    public static void main(String[] args) {

        FileUtils fu = new FileUtils();
        GestionComprasVentas ventas = fu.cargarCSV();

        fu.cargarUsuarios().forEach(System.out::println);
         fu.cargarProductos().forEach(System.out::println);


    }
}
