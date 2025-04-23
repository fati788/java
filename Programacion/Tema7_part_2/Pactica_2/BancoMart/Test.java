package Programacion.Tema7_part_2.Pactica_2.BancoMart;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        Cliente cl1 = new Cliente("A13425Z" , "fatima" , "fati@gmail.com" , "1123445","calle mar" , "vera" , "ES");
        Cliente cl2 = new Cliente("L127512W" , "ana" , "ana@gmail.com" , "1123445","calle mar" , "vera" , "ES");
        Cliente cl3 = new Cliente("D7231236F" , "haja" , "haja@gmail.com" , "1123445","calle mar" , "vera" , "ES");

        Cuenta c1 = new Cuenta(cl1);
        Cuenta c2 = new Cuenta(cl2);
        Cuenta c3 = new Cuenta(cl3);
        Cuenta c4 = new Cuenta(cl1);
        Cuenta c5 = new Cuenta(cl2);
        Cuenta c6 = new Cuenta(cl3);
        Cuenta c7 = new Cuenta(cl3);
        Cuenta c8 = new Cuenta(cl2);
        Cuenta c9 = new Cuenta(cl3);
        Cuenta c10 = new Cuenta(cl1);

        Banco b = new Banco();
        b.addCuenta(c1);
        b.addCuenta(c2);
        b.addCuenta(c3);
        b.addCuenta(c4);
        b.addCuenta(c5);
        b.addCuenta(c6);
        b.addCuenta(c7);
        b.addCuenta(c8);
        b.addCuenta(c9);
        b.addCuenta(c10);

          Transaccion t1 = new Transaccion(c1 , 1000.0 , LocalDate.now().minusMonths(1),TipoTransaccion.GASTO , "Quiro dinero ") ;
        Transaccion t2 = new Transaccion(c1 , 1500.0 , LocalDate.now().minusMonths(0),TipoTransaccion.INGRESO , "ingreso dinero ") ;
        Transaccion t3 = new Transaccion(c2 , 150.0 , LocalDate.now().minusMonths(2),TipoTransaccion.GASTO , "Quiro dinero ") ;
        Transaccion t4 = new Transaccion(c2 , 2000.0 , LocalDate.now().minusMonths(3),TipoTransaccion.INGRESO , "ingreso dinero ") ;
        Transaccion t5 = new Transaccion(c4 , 230.0 , LocalDate.now().minusMonths(4),TipoTransaccion.GASTO , "Quiro dinero ") ;
        Transaccion t6 = new Transaccion(c4 , 2500.0 , LocalDate.now().minusMonths(5),TipoTransaccion.INGRESO , "ingreso dinero ") ;
        Transaccion t7 = new Transaccion(c5 , 90.0 , LocalDate.now().minusMonths(6),TipoTransaccion.GASTO , "Quiro dinero ") ;
        Transaccion t8 = new Transaccion(c5 , 3000.0 , LocalDate.now().minusMonths(7),TipoTransaccion.INGRESO , "ingreso dinero ") ;

        c1.add(t1);
        c1.add(t2);
        c2.add(t3);
        c2.add(t4);
        c3.add(t3);
        c3.add(t4);
        c4.add(t5);
        c4.add(t6);
        c5.add(t7);
        c5.add(t8);


        System.out.println(b.getTodasTranscciones());
        System.out.println("--------------------------------------");
        //b.getTranccionesImporteMinimo(100);
        System.out.println("--------------------------------------");
        b.getIngresosTotales();
        System.out.println("--------------------------------------");
        b.getGastosTotales();
        System.out.println("---------------------------------------");
        b.getCuentasPorSaldo();
        System.out.println("55---------------------------------------");
       b.getNumTransaccionesPorCuenta();
        System.out.println("-------------------------------------");
        b.getCuentasActivas();
        System.out.println("-----------------------------------------");
        b.getTransaccionesPorDescripcion("dinero");
        System.out.println("------------------------------------------");
        b.showAnalisisTemporal();
    }
}
