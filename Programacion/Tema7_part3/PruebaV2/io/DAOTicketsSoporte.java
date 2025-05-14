package Programacion.Tema7_part3.PruebaV2.io;

import Programacion.Tema7_part3.PruebaV2.models.*;
import Programacion.Tema7_part3.PruebaV2.services.ServicioSoporte;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;

public class DAOTicketsSoporte {

    public static ServicioSoporte cargarCSV() throws IOException {

        ServicioSoporte ss = new ServicioSoporte();


        Files.lines(Paths.get("resources/ussuarios.csv"))
                .forEach(line -> {
                    List<String> tokens = Arrays.asList(line.split(","));
                    Usuario u = new Usuario(Integer.valueOf(tokens.get(0)) , tokens.get(1),tokens.get(2) ,
                            tokens.get(3) , tokens.get(4), LocalDate.parse(tokens.get(5)));
                  ss.addUsuario(u);

                });

        Files.lines(Paths.get("resources/tecnicos.csv"))
        .forEach(line -> {
            List<String> tokens = Arrays.asList(line.split(","));
            Tecnico t = new Tecnico(Integer.valueOf(tokens.get(0)) , tokens.get(1) , tokens.get(2),
                    tokens.get(3), tokens.get(4), Especiadad.valueOf(tokens.get(5)) , Integer.valueOf(tokens.get(6)));
            ss.addTechnico(t);

        });

        Files.lines(Paths.get("resources/TicketSoporte.csv"))
                .forEach(line -> {
                    List<String> tokens = Arrays.asList(line.split(","));


                    ss.addTicketSoporte(LocalDate.parse(tokens.get(1)),
                            LocalDate.parse(tokens.get(2)) ,Integer.parseInt(tokens.get(4)),tokens.get(7) ,
                                    ss.buscarUsuario(Integer.parseInt(tokens.get(5))) ,
                                    ss.buscarTechnico(Integer.parseInt(tokens.get(6))));

                });


        return ss;

    }
 /*package io;

import models.*;
import services.ServicioSoporte;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class DAOTicketsSoporte {

    public static void grabarCSV(ServicioSoporte servicio) {
        try {
            // === USUARIOS ===
            List<String> linesUsuarios = new ArrayList<>();
            linesUsuarios.add("id,nombre,apellidos,email,movil,fechaAlta");

            servicio.getUsuarios().forEach(u -> {
                StringBuffer line = new StringBuffer();
                line.append(u.getId()).append(",");
                line.append(u.getNombre()).append(",");
                line.append(u.getApellidos()).append(",");
                line.append(u.getEmail()).append(",");
                line.append(u.getMovil()).append(",");
                line.append(u.getFechaAlta());
                linesUsuarios.add(line.toString());
            });

            Files.write(Paths.get("usuarios.csv"), linesUsuarios,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE,
                    StandardOpenOption.TRUNCATE_EXISTING);

            // === TECNICOS ===
            List<String> linesTecnicos = new ArrayList<>();
            linesTecnicos.add("id,nombre,apellidos,email,movil,especialidad,valoracion");

            servicio.getTecnicos().forEach(t -> {
                StringBuffer line = new StringBuffer();
                line.append(t.getId()).append(",");
                line.append(t.getNombre()).append(",");
                line.append(t.getApellidos()).append(",");
                line.append(t.getEmail()).append(",");
                line.append(t.getMovil()).append(",");
                line.append(t.getEspecialidad().name()).append(",");
                line.append(t.getValoracion());
                linesTecnicos.add(line.toString());
            });

            Files.write(Paths.get("tecnicos.csv"), linesTecnicos,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE,
                    StandardOpenOption.TRUNCATE_EXISTING);

            // === TICKETS ===
            List<String> linesTickets = new ArrayList<>();
            linesTickets.add("id,fechaCreacion,fechaFinalizacion,estado,prioridad,idUsuario,idTecnico,comentarios");

            servicio.getTickets().forEach(t -> {
                StringBuffer line = new StringBuffer();
                line.append(t.getId()).append(",");
                line.append(t.getFechaCreacion()).append(",");
                line.append((t.getFechaFinalizacion() != null ? t.getFechaFinalizacion() : "")).append(",");
                line.append(t.getEstado().name()).append(",");
                line.append(t.getPrioridad()).append(",");
                line.append(t.getUsuario().getId()).append(",");
                line.append(t.getTecnico().getId()).append(",");
                line.append("\"").append(t.getComentarios().replace("\"", "")).append("\"");

                linesTickets.add(line.toString());
            });

            Files.write(Paths.get("tickets.csv"), linesTickets,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE,
                    StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("✅ Archivos guardados correctamente al estilo solicitado.");

        } catch (IOException e) {
            System.out.println("❌ Error al guardar archivos CSV: " + e.getMessage());
        }
    }
}
*/



}
