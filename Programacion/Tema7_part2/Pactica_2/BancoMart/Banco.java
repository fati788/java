package Programacion.Tema7_part2.Pactica_2.BancoMart;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Banco {
    private List<Cuenta>cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }
    public void addCuenta(Cuenta c) {
        this.cuentas.add(c);
    }
    public Cuenta getCuentaPrId(UUID id) {
        for (Cuenta c : cuentas) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }
    public ArrayList<Transaccion> getTodasTranscciones() {
        ArrayList<Transaccion> trans = new ArrayList<>();
        for (Cuenta c : cuentas) {
            trans.addAll(c.getTransacciones());
        }
        return trans;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Banco{");
        sb.append("cuentas=").append(cuentas);
        sb.append('}');
        return sb.toString();
    }

    /**
     * mostrar todas las transacciones con importe
     * superior a un valor dado
      * @param valor
     */
    public void  getTranccionesImporteMinimo(double valor){
        this.cuentas.stream()
                .flatMap(c -> c.getTransacciones().stream())
                .filter(t -> t.getImporte() > valor)
                .sorted(Comparator.comparing(Transaccion::getFecha))
                .forEach(System.out::println);
    }

    /**
     * Mostrar el total de ingresos del banco
     */
    public void  getIngresosTotales(){
       DoubleSummaryStatistics dss =  cuentas.stream()
                .flatMap(c -> c.getTransacciones().stream())
                .filter(t -> t.getTipo().equals(TipoTransaccion.INGRESO))
                .collect(Collectors.summarizingDouble(Transaccion::getImporte));
        System.out.println("El total de los ingresos es: "+dss.getSum());

    }

    /**
     * Mostrar el total de gastos del banco
     */

    public void  getGastosTotales(){
        DoubleSummaryStatistics dss2 =  cuentas.stream()
                .flatMap(c -> c.getTransacciones().stream())
                .filter(t -> t.getTipo().equals(TipoTransaccion.GASTO))
                .collect(Collectors.summarizingDouble(Transaccion::getImporte));
        System.out.println("El total de los gastos es: "+dss2.getSum());

    }

    /**
     * mostrar las cuentas ordenadas por saldo de mayor a menor
     */

    public void getCuentasPorSaldo(){
        cuentas.stream()
                .sorted(Comparator.comparing(Cuenta::getSaldo).reversed())
                .forEach(System.out::println);
    }

    /**
     * generar un mapa donde las claves sean los ids de cuentas
     * y los valores sean el número de transacciones de cada cuenta
     */

    public void  getNumTransaccionesPorCuenta(){

        Map<UUID, Long> NumTransaccionesPorCuenta = cuentas.stream()
                .collect(Collectors.groupingBy(Cuenta::getId,
                        Collectors.flatMapping(c -> c.getTransacciones().stream(), Collectors.counting())));

        NumTransaccionesPorCuenta.forEach((k , v ) -> System.out.println(k+" --> "+v));
    }

    /**
     * mostrar las cuentas que tengan al menos una transacción este mes
     */

    public void getCuentasActivas() {
        cuentas.stream()
               .filter(c -> c.getTransacciones().stream()
                    .anyMatch(t -> t.getFecha().getMonth().equals(LocalDate.now().getMonth()) &&
                                   t.getFecha().getYear() == LocalDate.now().getYear()))
                .forEach(System.out::println);
    }

    /**
     *  devuelve un mapa donde la clave sea el id de
     *  cuenta, y el valor un set de las transacciones de esa cuenta que contengan la palabra
     * @param palabra
     */
    public void  getTransaccionesPorDescripcion(String palabra){

        Map<UUID ,Set<Transaccion> > TransaccionesPorDescripcion =  cuentas.stream()
                .collect(Collectors.toMap(Cuenta::getId , c -> c.getTransacciones().stream()
                        .filter(t -> t.getDescripcion().contains(palabra))
                .collect(Collectors.toSet())));
        TransaccionesPorDescripcion.forEach((k , v ) ->
                System.out.println(k+" --> "+v));

    }

    /**
     * mostrar transacciones agrupadas por mes la suma total de ingresos y gastos
     */

   public void showAnalisisTemporal(){
        Map<Month , List<Transaccion>> transPorMes=  cuentas.stream()
                .flatMap(c -> c.getTransacciones().stream())
                .collect(Collectors.groupingBy(t -> t.getFecha().getMonth()));


         transPorMes.forEach((k , v ) -> {
             System.out.print(k + " - ");
             double totalIngreso = v.stream()
                     .filter(t -> t.getTipo().equals(TipoTransaccion.INGRESO))
                     .mapToDouble(Transaccion::getImporte)
                     .sum();
             double totalGasto = v.stream()
                     .filter(t -> t.getTipo().equals(TipoTransaccion.GASTO))
                     .mapToDouble(Transaccion::getImporte)
                     .sum();
             System.out.println("Ingresos: "+totalIngreso + " Gastos: "+totalGasto);

         });
     }

}
