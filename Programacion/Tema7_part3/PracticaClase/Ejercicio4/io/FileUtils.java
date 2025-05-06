package Programacion.Tema7_part3.PracticaClase.Ejercicio4.io;

import Programacion.Tema7_part3.PracticaClase.Ejercicio4.models.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileUtils {

    public static Set<Material> loadMaterial() throws IOException {
        List<Localizacion> localizacions = new ArrayList<>();
        Set<Material> materials = new HashSet<>();


        //LEEEEEEEER LOCALIZACIONES

        Files.lines(Paths.get("resources/local.csv"))
                .forEach(line -> {
                    List<String>tokens = Arrays.asList(line.split(","));
                    Localizacion l = new Localizacion(Long.valueOf(tokens.get(0)),
                        tokens.get(1)    ,tokens.get(2));
                    localizacions.add(l);

                });


        //LEEEER MATERIALES
        Files.lines(Paths.get("resources/material.csv"))
                .forEach(line -> {
                    List<String>tokens = Arrays.asList(line.split(","));
                    Material m = new Material(tokens.get(0) , tokens.get(1),
                            tokens.get(2), Estado.valueOf(tokens.get(3)),
                            Tipo.valueOf(tokens.get(4)),
                            Departamento.valueOf(tokens.get(5)) ,FileUtils.buscar(Long.valueOf(tokens.get(6)) , localizacions));
                    materials.add(m);
                });


        return materials;

    }
    public static Localizacion buscar(Long id , List<Localizacion> locals) {
        return locals.stream()
                .filter(localizacion -> localizacion.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
