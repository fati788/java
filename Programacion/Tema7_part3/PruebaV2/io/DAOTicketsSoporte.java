package Programacion.Tema7_part3.PruebaV2.io;

import Programacion.Tema7_part3.PruebaV2.models.*;
import Programacion.Tema7_part3.PruebaV2.services.ServicioSoporte;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.*;

public class DAOTicketsSoporte {

    public static ServicioSoporte cargarCSV() throws IOException {

        ServicioSoporte ss = new ServicioSoporte();


        Files.lines(Paths.get("resourcess/ussuarios.csv"))
                .forEach(line -> {
                    List<String> tokens = Arrays.asList(line.split(","));
                    Usuario u = new Usuario(Integer.valueOf(tokens.get(0)) , tokens.get(1),tokens.get(2) ,
                            tokens.get(3) , tokens.get(4), LocalDate.parse(tokens.get(5)));
                  ss.addUsuario(u);

                });

        Files.lines(Paths.get("resourcess/tecnicos.csv"))
        .forEach(line -> {
            List<String> tokens = Arrays.asList(line.split(","));
            Tecnico t = new Tecnico(Integer.valueOf(tokens.get(0)) , tokens.get(1) , tokens.get(2),
                    tokens.get(3), tokens.get(4), Especiadad.valueOf(tokens.get(5)) , Integer.valueOf(tokens.get(6)));
            ss.addTechnico(t);

        });

        Files.lines(Paths.get("resourcess/TicketSoporte.csv"))
                .forEach(line -> {
                    List<String> tokens = Arrays.asList(line.split(","));


                    ss.addTicketSoporte(LocalDate.parse(tokens.get(1)),
                            LocalDate.parse(tokens.get(2)) ,Integer.parseInt(tokens.get(4)),tokens.get(7) ,
                                    ss.buscarUsuario(Integer.parseInt(tokens.get(5))) ,
                                    ss.buscarTechnico(Integer.parseInt(tokens.get(6))));

                });


        return ss;

    }
    public static void grabarCSV(ServicioSoporte ss) throws IOException {

        //Grabar usuarios en USUARIO.CSV

        List<String> linesUser = new ArrayList<>();

        ss.getUsuarios().forEach(usuario -> {
            StringBuffer line = new StringBuffer();

            line.append(usuario.getId()).append(",");
            line.append(usuario.getNombre()).append(",");
            line.append(usuario.getApellido()).append(",");
            line.append(usuario.getEmail()).append(",");
            line.append(usuario.getTelefono()).append(",");
            line.append(usuario.getFechaAla());
            linesUser.add(line.toString());

        });

        Files.write(Paths.get("resourcess/ussuarios.csv"),linesUser ,
                StandardOpenOption.CREATE , StandardOpenOption.WRITE ,
                StandardOpenOption.TRUNCATE_EXISTING);

        //Grabar tecnicos.csv
        List<String> linesTechnico = new ArrayList<>();

        ss.getTecnicos().forEach(tecnico -> {
            StringBuffer line = new StringBuffer();

            line.append(tecnico.getId()).append(",");
            line.append(tecnico.getNombre()).append(",");
            line.append(tecnico.getApellido()).append(",");
            line.append(tecnico.getEmail()).append(",");
            line.append(tecnico.getTelefono()).append(",");
            line.append(tecnico.getEspeciadad()).append(",");
            line.append(tecnico.getValoracion());

            linesTechnico.add(line.toString());

        });
        Files.write(Paths.get("resourcess/tecnicos.csv") , linesTechnico ,
                StandardOpenOption.CREATE , StandardOpenOption.WRITE , StandardOpenOption.TRUNCATE_EXISTING);



        //GRABAR TICKETSOPORTE.CSV

        List<String> linesTicketSoporte = new ArrayList<>();

        ss.getTicketSoportes().forEach(ticket -> {

            StringBuffer linetic = new StringBuffer();
            linetic.append(ticket.getId()).append(",");
            linetic.append(ticket.getFechaCreacion()).append(",");
            linetic.append(ticket.getFechaFinalizacion()).append(",");
            linetic.append(ticket.getEstado()).append(",");
            linetic.append(ticket.getPrioridad()).append(",");
            linetic.append(ticket.getSolicitante().getId()).append(",");
            linetic.append(ticket.getAsignado().getId()).append(",");
            linetic.append(ticket.getComentarios());

            linesTicketSoporte.add(linetic.toString());

        });
        Files.write(Paths.get("resourcess/TicketSoporte.csv") , linesTicketSoporte,
                StandardOpenOption.CREATE , StandardOpenOption.WRITE , StandardOpenOption.TRUNCATE_EXISTING);




    }
}
