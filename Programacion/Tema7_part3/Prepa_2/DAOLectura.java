package Programacion.Tema7_part3.Prepa_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.*;

public class DAOLectura {
    private Set<Lectura> lecturas;

    public DAOLectura() {
        //LLAMAR AL METODO CARGARDATOS
        this.lecturas = new HashSet<>(cargarDatos());

    }
     public void addLectura(Lectura lectura) {
        this.lecturas.add(lectura);
     }
     public void deleteLectura(Lectura lectura) {
        this.lecturas.remove(lectura);
     }

    public void grabarDatos() {

        List<String> lineasLectura = new ArrayList<>();
        lecturas.forEach(line -> {
            StringBuffer sb = new StringBuffer();
            sb.append(line.getId()).append(",");
            sb.append(line.getTemperatura()).append(",");
            sb.append(line.getHumedad()).append(",");
            sb.append(line.getMomento()).append(",");
            sb.append(line.getFinca().getId());

            lineasLectura.add(sb.toString());

        });

        try {
            Files.write(Paths.get("resources/lecturas.csv") , lineasLectura ,
                    StandardOpenOption.CREATE , StandardOpenOption.WRITE ,
                    StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Lectura> cargarDatos(){

          List<Lectura> lecturas1 = new ArrayList<>();
        try {
            Files.lines(Paths.get("resources/lecturas.csv"))
                    .forEach(line -> {
                        List<String> tokens = Arrays.asList(line.split(","));

                        DAOFinca dadoFinca =  new DAOFinca();
                        Lectura l = new Lectura(Integer.valueOf(tokens.get(0)) , Double.parseDouble(tokens.get(1)) ,
                                Double.parseDouble(tokens.get(2)) , LocalDate.parse(tokens.get(3))
                                ,dadoFinca.findById(Integer.parseInt(tokens.get(4))));

                        lecturas1.add(l);

                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

           return lecturas1;

    }


}
