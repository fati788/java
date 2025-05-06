package Programacion.Tema7_part3.PracticaClase.Ejercicio4.services;

import Programacion.Tema7_part3.PracticaClase.Ejercicio4.io.FileUtils;

import java.io.IOException;

public class test {
    public static void main(String[] args) {

        try {
            Inventario in = new Inventario(FileUtils.loadMaterial());

            in.getInventario().forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
