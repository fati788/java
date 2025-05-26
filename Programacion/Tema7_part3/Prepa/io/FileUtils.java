package Programacion.Tema7_part3.Prepa.io;

import Programacion.Tema7_part3.Prepa.models.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class FileUtils {

    public static Set<Material> loadMaterialsCSV() throws IOException {

        List<Localizacion> localizaciones = new ArrayList<>();
        Set<Material> materials = new HashSet<>();
       //---------------------Leer Localizaciones-------------//

        Files.lines(Paths.get("resourcess/local.csv"))
                .forEach(line -> {
                    List<String> tokens = Arrays.asList(line.split(","));
                    Localizacion loca = new Localizacion(Long.parseLong(tokens.get(0)) , tokens.get(1), tokens.get(2) );
                    localizaciones.add(loca);
                });

        //--------Leeeeeeer Materiales------------//
        //-----------Primero hacer un metodo buscar para buscar una loca

       Files.lines(Paths.get("resourcess/material.csv"))
               .forEach(line -> {
                   List<String> tokens = Arrays.asList(line.split(","));
                   Material mat = new Material(tokens.get(0) , tokens.get(1) , tokens.get(2), Estado.valueOf(tokens.get(3))
                   , Tipo.valueOf(tokens.get(4)) , Departamento.valueOf(tokens.get(5)) ,
                           buscarLoca(Long.parseLong(tokens.get(6)) , localizaciones));
                   materials.add(mat);

               });
       return materials;
    }
    public static List<Localizacion> loadLocalizacionesCSV() throws IOException {

        List<Localizacion> localizaciones = new ArrayList<>();

        Files.lines(Paths.get("resourcess/local.csv"))
                .forEach(line -> {
                    List<String> tokens = Arrays.asList(line.split(","));
                    Localizacion loca = new Localizacion(Long.parseLong(tokens.get(0)) , tokens.get(1), tokens.get(2) );
                    localizaciones.add(loca);

                });
        return localizaciones;
    }

    public static Localizacion buscarLoca(Long id , List<Localizacion> localizacions){
        return localizacions.stream()
                .filter(loc -> loc.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static void saveMaterialesCSV(Set<Material> materials) throws IOException {
       List<String> lines = new ArrayList<>();

       materials.forEach(material -> {
           StringBuffer line = new StringBuffer();

           line.append(material.getId()).append(",");
           line.append(material.getNombre()).append(",");
           line.append(material.getDescripcion()).append(",");
           line.append(material.getEstado().name()).append(",");
           line.append(material.getTipo().name()).append(",");
           line.append(material.getDepartamento().name()).append(",");
           line.append(material.getLocalizacion().getId());

           lines.add(line.toString());

       });

       Files.write(Paths.get("resourcess/material.csv") , lines
       , StandardOpenOption.CREATE, StandardOpenOption.WRITE ,
               StandardOpenOption.TRUNCATE_EXISTING);

    }
}
