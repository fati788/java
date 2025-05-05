package Programacion.Tema7_part3.Ejemplos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EjemploRecorrerArchivoPorLineas {
    public static void main(String[] args) {
        Path file = Path.of("Programacion/Tema7_part3/Ejemplos/EjemploRecorrerArchivoPorLineas.java");

        try {
            Files.lines(file)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
