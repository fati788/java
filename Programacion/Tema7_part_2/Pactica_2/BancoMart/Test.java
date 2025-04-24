package Programacion.Tema7_part_2.Pactica_2.BancoMart;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
       //crear clientes
        Cliente cl1 = new Cliente("A13425Z" , "fatima" , "fati@gmail.com" , "1123445","calle mar" , "vera" , "ES");
        Cliente cl2 = new Cliente("L127512W" , "ana" , "ana@gmail.com" , "1123445","calle mar" , "vera" , "ES");
        Cliente cl3 = new Cliente("D7231236F" , "haja" , "haja@gmail.com" , "1123445","calle mar" , "vera" , "ES");

      //crear cuentas con estos clientes
        Cuenta c1 = new Cuenta(cl1);
        Cuenta c2 = new Cuenta(cl2);
        Cuenta c3 = new Cuenta(cl3);
        Cuenta c4 = new Cuenta(cl1);
        Cuenta c5 = new Cuenta(cl2);

        //crear banco
        Banco b = new Banco();

        //anadir el cuentas al banco
        b.addCuenta(c1);
        b.addCuenta(c2);
        b.addCuenta(c3);
        b.addCuenta(c4);
        b.addCuenta(c5);

       //anadir tarnsacciones al banco
        c1.add( new Transaccion(c1 , 1000.0 , LocalDate.now().minusMonths(1),TipoTransaccion.GASTO , "Quiro dinero ")) ;
        c1.add(new Transaccion(c1 , 1500.0 , LocalDate.now().minusMonths(0),TipoTransaccion.INGRESO , "ingreso dinero ")) ;
        c2.add(new Transaccion(c2 , 150.0 , LocalDate.now().minusMonths(2),TipoTransaccion.GASTO , "Quiro dinero ")) ;
        c2.add(new Transaccion(c2 , 2000.0 , LocalDate.now().minusMonths(3),TipoTransaccion.INGRESO , "ingreso dinero ")) ;
        c4.add(new Transaccion(c4 , 230.0 , LocalDate.now().minusMonths(4),TipoTransaccion.GASTO , "Quiro dinero ")) ;
        c4.add( new Transaccion(c4 , 2500.0 , LocalDate.now().minusMonths(5),TipoTransaccion.INGRESO , "ingreso dinero ")) ;
        c5.add( new Transaccion(c5 , 90.0 , LocalDate.now().minusMonths(6),TipoTransaccion.GASTO , "Quiro dinero ")) ;
        c5.add(new Transaccion(c5 , 3000.0 , LocalDate.now().minusMonths(7),TipoTransaccion.INGRESO , "ingreso dinero ")) ;
        c5.add( new Transaccion(c5 , 30.0 , LocalDate.now(),TipoTransaccion.GASTO , "Quiero dinero ")) ;


        //System.out.println(b.getTodasTranscciones());
        System.out.println("----mostrar todas las transacciones con importe superior a un 100-----");
        b.getTranccionesImporteMinimo(100);
        System.out.println("--------------------------------------");
        b.getIngresosTotales();
        System.out.println("--------------------------------------");
        b.getGastosTotales();
        System.out.println("------Cuentas ordenadas por sueldo-----");
        b.getCuentasPorSaldo();
        System.out.println("------Numero de transacciones Por Cuenta-------");
       b.getNumTransaccionesPorCuenta();
        System.out.println("-----Cuentas Activas-----");
        b.getCuentasActivas();
        System.out.println("-----Mapa con id de cuentas y un Set de transacciones-----");
        b.getTransaccionesPorDescripcion("dinero");
        System.out.println("-----Suma de ingresos y gastos agrupadas por mes-----");
        b.showAnalisisTemporal();
    }
}
