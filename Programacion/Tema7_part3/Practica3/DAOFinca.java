package Programacion.Tema7_part3.Practica3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class DAOFinca {
    private ArrayList<Finca>fincas;

    public DAOFinca() {
        this.fincas = new ArrayList<>(cargarDatos());

        //llamr al metodo cargarDatos
    }

    public void addFinca(Finca f) {
        this.fincas.add(f);
    }
    public void deleteFinca(Finca f) {
        this.fincas.remove(f);
    }
    public Finca findByName(String nombre) {
        return  this.fincas.stream()
                .filter(f -> f.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }
    public Finca findById(int id) {
        return this.fincas.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    public List<Finca> cargarDatos() {

        try {
            List<Finca> fincas1 =  Files.lines(Paths.get("Programacion/Tema7_part3/Practica3/fincas.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        return new Finca(Integer.valueOf(tokens.get(0)) ,tokens.get(1) ,
                                Double.valueOf(tokens.get(2)) ,Double.valueOf(tokens.get(3)) ,
                                Double.valueOf(tokens.get(4)) , tokens.get(5) , tokens.get(6));


                    })
                    .toList();
            return fincas1;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void mostrarFincas(){
        fincas.forEach(System.out::println);
    }
    // Streams

    public List<Finca> getFincasPorSuperficie(){
       return  fincas.stream()
                .sorted(Comparator.comparing(Finca::getSuperficie))
                .toList();
    }


    public List<Finca> getMasGrandes(){
        return  fincas.stream()
                .sorted(Comparator.comparing(Finca::getSuperficie).reversed())
                .limit(3)
                .toList();
    }

    public HashMap<String , List<Finca>> getFincasPorCiudad(){
        return (HashMap<String, List<Finca>>) fincas.stream()
                .collect(Collectors.groupingBy(Finca::getProvincia));

    }


    public List<String> getFincasMedio(){
        return  fincas.stream()
                .filter( f -> (f.getSuperficie()>= 50) && (f.getSuperficie()<=150))
                .map(Finca::getNombre)
                .toList();
    }




}
