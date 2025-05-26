package TerceraEvaluacion_Fatima.services;

import TerceraEvaluacion_Fatima.models.*;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class DockService {
    private List<Muelle> muelles;
    private Set<ReservarMuelle> reservas;

    public DockService() {
        this.muelles = new ArrayList<>();
        this.reservas = new HashSet<>();

    }

    public List<Muelle> getMuelles() {
        return muelles;
    }

    public void setMuelles(List<Muelle> muelles) {
        this.muelles = muelles;
    }

    public Set<ReservarMuelle> getReservas() {
        return reservas;
    }

    public void setReservas(Set<ReservarMuelle> reservas) {
        this.reservas = reservas;
    }

    /**
     * añadir el muelle a la lista de los muelles
     * @param m
     */

    public void addMuelle(Muelle m) {
        this.muelles.add(m);
    }

    /**
     * Este metodo buscar un muelle desde su id
     * duevelve el muelle si esta si no devuelve null
     * @param id
     * @return
     */

    public Muelle findMuelleById(int id) {
        return muelles.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    /**
     * remove Muelle --> remove un muelle de la lista de red dado su id
     * @param id
     * @return
     */
    public boolean removeMuelle(int id) {
       return this.muelles.removeIf(m -> m.getId().equals(id));
    }

    /**
     * buscar un muelle libre y devuelve el primer Muelle libre
     * @return
     */

    public Optional<Muelle> findFreeMuelle() {
        return this.muelles.stream()
                .filter(m -> m.getOcupado() == false)
                .findFirst();
    }

    /**
     * crear un reserva el primero buscar si hay un muelle libre
     * si hay crear un objeto reserva con ese muelle  y añadir la al set del reservas
     * sino Salta un exeption que no hay muelles disponibles
     * @param c
     * @param llegada
     * @return
     * @throws NoHayMullesLibres
     */

    public ReservarMuelle cerateReserva(Camion c , LocalDateTime llegada) throws NoHayMullesLibres {

        Muelle muelle = this.findFreeMuelle().orElse(null);

        int id = this.reservas.stream()
                .mapToInt(ReservarMuelle::getId)
                .max()
                .orElse(0);
        ReservarMuelle reservarMuelle = null;

        if (muelle != null) {
             reservarMuelle = new ReservarMuelle(id+1 , c,muelle,llegada);

            muelle.asignarCamion(c);
            this.reservas.add(reservarMuelle);
        }else {
          throw new NoHayMullesLibres("No hay muelles libres");
        }
        return reservarMuelle;
    }

    /**
     * liberar muelle --> el primero buscar una reserva con ese id
     * si hay y si la salida == false --> llama al registrar salida y devuelve true
     * sino devuelve  false
     * @param idReserva
     * @param salida
     * @return
     */
    public boolean liberarMuelle(int idReserva , LocalDateTime salida){

        ReservarMuelle reserva = null;
        for (ReservarMuelle rm : this.reservas) {
            if (rm.getId().equals(idReserva)) {
                reserva = rm;
                break;
            }
        }
        if (reserva != null && reserva.getSalida() == null) {
            reserva.registrarSalida(salida);
            return true;
        }
        return false;
    }

    /**
     * devuelve todas las reservas cuyo fecha de salida == null --> esta activa
     * @return
     */
    public List<ReservarMuelle> getReservasActivas(){

        return reservas.stream()
                .filter(r -> r.getSalida() == null)
                .toList();

    }

    /**
     * devuelve una lista de reservas ordenadas por fecha de llegada
     * @return
     */
    public List<ReservarMuelle> getHistorial(){
        return reservas.stream()
                .sorted(Comparator.comparing(ReservarMuelle::getLlegada))
                .toList();

    }

    /**
     * devuelve el numero de los reservas
     * agrupadas por Muelle
     * @return
     */
    public Map<Muelle , Long> getNumeroReservasPorMuelle(){

        return reservas.stream()
                .collect(Collectors.groupingBy(ReservarMuelle::getMuelle, Collectors.counting()));

    }

    /**
     * devuelve todas los reservas activas (fecha salida == null)
     * agrupada por fecha de llegada
     * @return
     */
    public Map<DayOfWeek , Long> getConteoReservasPorDia(){
        return reservas.stream()
                .filter(r -> r.getSalida() == null)
                .collect(Collectors.groupingBy(r -> r.getLlegada().getDayOfWeek(), Collectors.counting()));

    }

    /**
     * devuelve todas las reservas de camiens frigorificos
     * ordenadas por fecha de llegada segun el boolean asc
     * si es true ordena de menor a mayor
     * si es false ordena de mayor a menor
     * @param asc
     * @return
     */

    public List<ReservarMuelle> getReservasFrigorificasOrdenadasPorLlegada(boolean asc){
        if (asc == true) {
            return this.reservas.stream()
                    .filter(r -> r.getCamion().getClass().equals(CamionFrigorifico.class))
                    .sorted(Comparator.comparing(ReservarMuelle::getLlegada))
                    .toList();
        }else {
            return this.reservas.stream()
                    .filter(r -> r.getCamion().getClass().equals(CamionFrigorifico.class))
                    .sorted(Comparator.comparing(ReservarMuelle::getLlegada).reversed())
                    .toList();
        }
    }

    /**
     * devuelve una lista de los reservas
     * agroupadas por empresa transportista
     * @return
     */
    public Map<String , List<ReservarMuelle>> getReservasPorEmpresaTransportista(){

        return reservas.stream()
                .collect(Collectors.groupingBy(r -> r.getCamion().getEmpresaTransportista()));

    }

    /**
     * duevelve una lista de n camiones mas pesados
     * --> ordenados por peso de mayor a menor
     * @param n
     * @return
     */
    public List<Camion> getCamionesMasPesadps(int n){
        return reservas.stream()
                .map(ReservarMuelle::getCamion)
                .sorted(Comparator.comparing(Camion::getPesoEstimado).reversed())
                .limit(n)
                .toList();
    }


}
