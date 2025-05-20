package Programacion.Tema7_part3.PruebaV2.io;

import Programacion.Tema7_part3.PruebaV2.models.*;
import Programacion.Tema7_part3.PruebaV2.services.ServecioSopotttte2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAOTicketSoporte2 {

    public static ServecioSopotttte2 cargarCSV() throws IOException {
        ServecioSopotttte2 ssv2 = new ServecioSopotttte2();

        //LEER LOS USUARIOS
        Files.lines(Paths.get("resources/usuarios2024.csv"))
                .forEach( line -> {
                    List<String> tokens = Arrays.asList(line.split(","));
                    Usuario u = new Usuario(Integer.valueOf(tokens.get(0)) , tokens.get(1) , tokens.get(2) , tokens.get(3),
                            tokens.get(4) , LocalDate.parse(tokens.get(5)));
                    ssv2.addUsuario(u);
                });

        //LEER TECNICOS

        Files.lines(Paths.get("resources/tecnico2024.csv"))
                .forEach(line -> {
                    List<String> tokens = Arrays.asList(line.split(","));

                    Tecnico t = new Tecnico(Integer.valueOf(tokens.get(0)) , tokens.get(1), tokens.get(2), tokens.get(3),
                            tokens.get(4), Especiadad.valueOf(tokens.get(5)) ,Integer.parseInt(tokens.get(6)));
                    ssv2.addTecnico(t);
                });

        //LEER TICKETS
        Files.lines(Paths.get("resources/tickets2.csv"))
                .forEach(line -> {
                    List<String> tokens = Arrays.asList(line.split(","));

                    Estado estado = Estado.valueOf(tokens.get(3));
                    LocalDate fecha = null;
                    if (estado.equals(Estado.RESUELTO)){
                        fecha = LocalDate.parse(tokens.get(2));
                    }
                    TicketSoporte ts = new TicketSoporte(Integer.valueOf(tokens.get(0)) , LocalDate.parse(tokens.get(1)),
                          fecha , estado ,Integer.parseInt(tokens.get(4)),
                            ssv2.finUsuarioById(Integer.parseInt(tokens.get(5))) , ssv2.findTecnicoById(Integer.parseInt(tokens.get(6))) ,
                            tokens.get(7));

                   /* if (ts.getEstado().equals(Estado.ABIERTO)){
                        ts.setFechaFinalizacion(null);
                    }*/

                    ssv2.getTicketSoportes().add(ts);

                });

        return ssv2;

    }

    public static void grabarCSV(ServecioSopotttte2 ssv2) throws IOException {


        List<String> lineUsers = new ArrayList<>();

        ssv2.getUsuarios().forEach(u -> {
            StringBuffer line = new StringBuffer();

            line.append(u.getId()).append(",");
            line.append(u.getNombre()).append(",");
            line.append(u.getApellido()).append(",");
            line.append(u.getEmail()).append(",");
            line.append(u.getTelefono()).append(",");
            line.append(u.getFechaAla());

            lineUsers.add(line.toString());
        });


        Files.write(Paths.get("resources/usuarios2024.csv") , lineUsers , StandardOpenOption.CREATE,
                StandardOpenOption.WRITE , StandardOpenOption.TRUNCATE_EXISTING);


        //GrabarTecnicos
        List<String> linesTecs = new ArrayList<>();

        ssv2.getTecnicos().forEach(t -> {
            StringBuffer line = new StringBuffer();

            line.append(t.getId()).append(",");
            line.append(t.getNombre()).append(",");
            line.append(t.getApellido()).append(",");
            line.append(t.getEmail()).append(",");
            line.append(t.getTelefono()).append(",");
            line.append(t.getEspeciadad()).append(",");
            line.append(t.getValoracion());

            linesTecs.add(line.toString());
        });

        Files.write(Paths.get("resources/tecnico2024.csv"), linesTecs,
                StandardOpenOption.CREATE, StandardOpenOption.WRITE,
                StandardOpenOption.TRUNCATE_EXISTING);

        //grabarTickets

        List<String> linesTickets = new ArrayList<>();
        ssv2.getTicketSoportes().forEach(t -> {
            StringBuffer line = new StringBuffer();
            line.append(t.getId()).append(",");
            line.append(t.getFechaCreacion()).append(",");
             if (t.getFechaFinalizacion() != null){
                 line.append(t.getFechaFinalizacion()).append(",");
             }else {
                 line.append("null,");
             }
            line.append(t.getEstado()).append(",");
            line.append(t.getPrioridad()).append(",");
            line.append(t.getSolicitante().getId()).append(",");
            line.append(t.getSolicitante().getId()).append(",");
            line.append(t.getComentarios());

            linesTickets.add(line.toString());

        });

        Files.write(Paths.get("resources/tickets2.csv") , linesTickets ,
                StandardOpenOption.CREATE , StandardOpenOption.WRITE,
                StandardOpenOption.TRUNCATE_EXISTING);


    }
}
