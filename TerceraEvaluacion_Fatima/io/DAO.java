package TerceraEvaluacion_Fatima.io;

import TerceraEvaluacion_Fatima.models.*;
import TerceraEvaluacion_Fatima.services.DockService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAO {

    /**
     * El metodo cargarDesdeCSV lea el fichero muelles.csv
     * y el fichero reservas.csv , luego transformarlos en Objetos
     * u añadirlos en el Objeto DockService y devuelve lo al final
     * @return
     */

    public static DockService cargarDesdeCSV(){
        //LEER MUELLE
        DockService ds = new DockService();

        try {
            Files.lines(Paths.get("resources/muelles.csv"))
                    .forEach(line -> {
                        List<String> tokens = Arrays.asList(line.split(","));
                        Muelle muelle = new Muelle(Integer.valueOf(tokens.get(0)), tokens.get(1));
                        ds.addMuelle(muelle);

                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //LEER RESERVAS
        //Crear Camion el primero

        try {
            Files.lines(Paths.get("resources/reservas.csv"))
                    .forEach(line -> {
                        List<String> tokens = Arrays.asList(line.split(","));

                        String tipoCamion = tokens.get(8);
                        Camion camion = null;
                        if (tipoCamion.equals("FRIGORIFICO")){
                            camion = new CamionFrigorifico(tokens.get(1), tokens.get(2) , tokens.get(3)
                            , Double.valueOf(tokens.get(4)),Double.valueOf(tokens.get(9)));
                        }else if (tipoCamion.equals("PELIGROSO")){
                            camion = new CamionPeligroso(tokens.get(1), tokens.get(2) , tokens.get(3)
                                    , Double.valueOf(tokens.get(4)),tokens.get(9));

                        }

                        //LocalDateTime fechaSalida = LocalDateTime.parse(tokens.get(6));
                        Muelle m = ds.findMuelleById(Integer.parseInt(tokens.get(7)));
                      /* if (fechaSalida == null){
                            m.setOcupado(true);
                        }*/
                        ReservarMuelle reserva = new ReservarMuelle(Integer.valueOf(tokens.get(0)), camion , m ,
                                LocalDateTime.parse(tokens.get(5)));
                        ds.getReservas().add(reserva);
                       /* try {
                            ds.cerateReserva(camion ,LocalDateTime.parse(tokens.get(5)));
                        } catch (NoHayMullesLibres e) {
                            System.out.println("No hay mulles libres.");
                        }*/
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return ds;
    }

    /**
     * el metodo guardarEnCSV --> crea el fichero muelles.csv
     * y el fichero reservas.csv de nuevo
     * y guarda todos los datos nuevos en ellos.
     * @param svc
     */

    public static void guardarEnCsv(DockService svc){

        //GUARDAR MUELLE

        List<String> linesMuelle = new ArrayList<>();

        svc.getMuelles().forEach(muelle -> {
            StringBuffer line = new StringBuffer();

            line.append(muelle.getId()).append(',');
            line.append(muelle.getUbicacion());

            linesMuelle.add(line.toString());

        });

        try {
            Files.write(Paths.get("resources/muelles.csv") , linesMuelle
                      , StandardOpenOption.CREATE , StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Guardar Reservas

        List<String> linesReservas = new ArrayList<>();

        svc.getReservas().forEach(reserva -> {
            StringBuffer line = new StringBuffer();
            line.append(reserva.getId()).append(',');
            line.append(reserva.getCamion().getMatricula()).append(',');
            line.append(reserva.getCamion().getEmpresaTransportista()).append(',');
            line.append(reserva.getCamion().getTipoMertcancia()).append(',');
            line.append(reserva.getCamion().getPesoEstimado()).append(',');
            line.append(reserva.getLlegada()).append(',');

            if (reserva.getSalida() != null) {
                line.append(reserva.getSalida()).append(',');
            }else {
                line.append("null,");
            }
            line.append(reserva.getMuelle().getId()).append(',');

            Camion camion = reserva.getCamion();
            if (camion.getClass().equals(CamionFrigorifico.class)) {

                line.append("FRIGORIFICO,");
              line.append(((CamionFrigorifico) camion).getTemperaturaObjetivo());


            } else if (camion.getClass().equals(CamionPeligroso.class)) {

                line.append("PELIGROSO,");
                line.append(((CamionPeligroso) camion).getClasePeligrosidad());
            }

            linesReservas.add(line.toString());

        });

        try {
            Files.write(Paths.get("resources/reservas.csv") , linesReservas
                    , StandardOpenOption.CREATE , StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
