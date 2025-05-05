package Programacion.Tema7_part3.Practica3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class DAOLecturas {
    private Set<Lectura>lecturas;

    public DAOLecturas() {
        this.lecturas = new HashSet<>(cargarDatos());
        //llamar al metodo cargarDatos()
    }
    public List<Lectura> cargarDatos(){

        try {
            List<Lectura> lecturas1 = Files.lines(Paths.get("Programacion/Tema7_part3/Practica3/lecturas.csv"))
                    .map(line -> {
                        List<String> tokens = Arrays.asList(line.split(","));
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        DAOFinca d = new DAOFinca();
                        return new Lectura(Integer.valueOf(tokens.get(0)) , Double.valueOf(tokens.get(1)) ,
                                Double.valueOf(tokens.get(2)) , LocalDate.parse(tokens.get(3) , formatter)
                        , d.findById(Integer.parseInt(tokens.get(4) )));
                    })
                    .toList();
            return lecturas1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void mostrarLecturas(){
        lecturas.forEach(System.out::println);
    }
    public void grabarDatos(){

        try {
            Files.write(Paths.get("Programacion/Tema7_part3/Practica3/lecturas.csv") ,
                    lecturas.stream()
                            .map(Lectura::toString)
                            .toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void addLectura(Lectura l){
        lecturas.add(l);
    }

    public void deleteLectura(Lectura l){
        lecturas.remove(l);
    }

    public HashMap<Integer , List<Lectura>> getLecturasPorFinca(){
        return (HashMap<Integer, List<Lectura>>) lecturas.stream()
                .collect(Collectors.groupingBy( l -> l.getFinca().getId()));
    }

    public Double getTempMaximaFinca(int id){
        return  lecturas.stream()
                .filter( l -> l.getFinca().getId() == id)
                .mapToDouble(Lectura::getTemperatura)
                .max()
                .orElse(Double.NaN);

    }

    public Double getTempMinimaFinca(int id){
        return  lecturas.stream()
                .filter( l -> l.getFinca().getId() == id)
                .mapToDouble(Lectura::getTemperatura)
                .min()
                .orElse(Double.NaN);

    }

    public List<Double> getHumedadPorFinca(int id){
         return lecturas.stream()
                   .filter( l -> l.getFinca().getId() == id)
                   .sorted(Comparator.comparing(Lectura::getMomento))
                   .map(Lectura::getHumedad)
                   .toList();
    }

    public List<Double> getTemperaturaPorFinca(int id){
        return lecturas.stream()
                .filter(l -> l.getFinca().getId() == id)
                .sorted(Comparator.comparing(Lectura::getMomento))
                .map(Lectura::getTemperatura)
                .toList();
    }

    public List<Double> getTemperaturaDiaPorFinca(int id , LocalDate dia){
       return lecturas.stream()
                .filter(l -> l.getFinca().getId() == id)
                .filter( l -> l.getMomento().getDayOfWeek() == dia.getDayOfWeek())
                .sorted(Comparator.comparing(Lectura::getMomento))
                .map(Lectura::getTemperatura)
                .toList();
    }

}
