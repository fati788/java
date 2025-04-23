package Programacion.Tema7_part_2.Pactica_2.BancoMart;

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
                // 1. getTransaccionesImporteMinimo(double valor): mostrar todas las transacciones con importe
                //superior a un valor dado (por ejemplo, 500€), ordenadas cronológicamente. Filter y sorted
    public void  getTranccionesImporteMinimo(double valor){
        this.cuentas.stream()
                .flatMap(c -> c.getTransacciones().stream())
                .filter(t -> t.getImporte() > valor)
                .sorted()
                .forEach(System.out::println);
    }

    //2. getIngresosTotales(): el total de ingresos del banco. Filter, reduce y summarizingDouble
    public void  getIngresosTotales(){
       DoubleSummaryStatistics dss =  cuentas.stream()
                .flatMap(c -> c.getTransacciones().stream())
                .filter(t -> t.getTipo().equals(TipoTransaccion.INGRESO))
                .collect(Collectors.summarizingDouble(Transaccion::getImporte));
        System.out.println("El total de los ingresos es: "+dss.getSum());

    }
    //3. getGastosTotales(): ídem para gastos

    public void  getGastosTotales(){
        DoubleSummaryStatistics dss2 =  cuentas.stream()
                .flatMap(c -> c.getTransacciones().stream())
                .filter(t -> t.getTipo().equals(TipoTransaccion.GASTO))
                .collect(Collectors.summarizingDouble(Transaccion::getImporte));
        System.out.println("El total de los gastos es: "+dss2.getSum());

    }
    //4. getCuentasPorSaldo(): mostrar las cuentas ordenadas por saldo de mayor a menor (sorted)
    public void getCuentasPorSaldo(){
        cuentas.stream()
                .sorted(Comparator.comparing(Cuenta::getSaldo).reversed())
                .forEach(System.out::println);
    }
   //5. getNumTransaccionesPorCuenta(): generar un mapa donde las claves sean los ids de cuentas, y los
    //valores sean el número de transacciones de cada cuenta. Collectors.groupingBy,
    //Collectors.counting
    public void  getNumTransaccionesPorCuenta(){

        Map<UUID, Long> NumTransaccionesPorCuenta = cuentas.stream()
                .collect(Collectors.groupingBy(Cuenta::getId,
                        Collectors.flatMapping(c -> c.getTransacciones().stream(), Collectors.counting())));

        NumTransaccionesPorCuenta.forEach((k , v ) -> System.out.println(k+" --> "+v));
    }
    //6. getCuentasActivas(): mostrar las cuentas que tengan al menos una transacción este mes
    public void getCuentasActivas(){
        Transaccion transaccion = cuentas.stream()
                .flatMap(c -> c.getTransacciones().stream())
                .filter(t -> t.getFecha().getMonth().equals(LocalDate.now().getMonth()))
                .findAny()
                .orElse(null);
        System.out.println("Cuentas activas: ");
        for (Cuenta c : cuentas) {
            if (c.getTransacciones().contains(transaccion)) {
                System.out.println(c);
            }
        }
    }

    //7. getTransaccionesPorDescripcion(String palabra): devuelve un mapa donde la clave sea el id de
    //cuenta, y el valor un set de las transacciones de esa cuenta que contengan la palabra
    public void  getTransaccionesPorDescripcion(String palabra){

        Map<UUID ,Set<Transaccion> > TransaccionesPorDescripcion =  cuentas.stream()
                .collect(Collectors.toMap(Cuenta::getId , c -> c.getTransacciones().stream()
                        .filter(t -> t.getDescripcion().contains(palabra))
                .collect(Collectors.toSet())));
        TransaccionesPorDescripcion.forEach((k , v ) ->
                System.out.println(k+" --> "+v));

    }

  //8. showAnalisisTemporal(): debe mostrar agrupadas por mes la suma total de ingresos y gastos:
    //marzo 2025 – ingresos: 5000€, gastos: 3000€
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
