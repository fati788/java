package Programacion.Tema7_part3.Prepa_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class DAOFinca {
    private ArrayList<Finca> fincas;

    public DAOFinca() {
        //llamar al metodo CargarDatos
        this.fincas = new ArrayList<>(cargarDatos());

    }

    public  Finca findById(int id){
        return  this.fincas.stream()
                .filter( f -> f.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addFinca(Finca finca){
        this.fincas.add(finca);
    }

    public void  deleteFinca(Finca finca){
        this.fincas.remove(finca);
    }

    public Finca findByName(String name){
        return this.fincas.stream()
                .filter( f -> f.getNombre().equals(name))
                .findFirst()
                .orElse(null);
    }

    /**
     * El metodod cargarDatos lee
     * el archivo fincas.csv y aanadirlos en una lista
     * y llama a el en el constroctur
     * @return
     */
    public List<Finca> cargarDatos(){

              List<Finca> fincas1 = new ArrayList<>();

        try {
            Files.lines(Paths.get("resourcess/fincas.csv"))
                    .forEach(line -> {
                        List<String> tokens = Arrays.asList(line.split(","));
                        Finca f = new Finca(Integer.valueOf(tokens.get(0)) ,tokens.get(1),Double.parseDouble(tokens.get(2)),
                                Double.parseDouble(tokens.get(3)) , Double.parseDouble(tokens.get(4)),
                                tokens.get(5), tokens.get(6));
                        fincas1.add(f);
                    });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fincas1;
    }
     public List<Finca> getFincasPorSuperficie(){
        return this.fincas.stream()
                .sorted(Comparator.comparing(Finca::getSuperficiie))
                .collect(Collectors.toList());

     }

     public List<Finca> getMasGrandes(){
        return this.fincas.stream()
                .sorted(Comparator.comparing(Finca::getSuperficiie).reversed())
                .limit(3)
                .collect(Collectors.toList());

     }

     public HashMap<String , List<Finca>> getFincasPorCiudad(){
        return (HashMap<String, List<Finca>>) this.fincas.stream()
                .collect(Collectors.groupingBy(Finca::getProvincia));
     }
     


}
