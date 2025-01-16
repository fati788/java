package Programacion.EjerciciosClase;

public class TestIncidencia {
    public static void main(String[] args) {
        Incidencia incidencia1 = new Incidencia(123, Incidencia.Estado.ABIERTA , "fsdhf" , "DGASFHDG");
        Incidencia incidencia2 = new Incidencia(1233, Incidencia.Estado.ENPROCESO , "fsdhf" , "DGASFHDG");
        Incidencia incidencia3 = new Incidencia(1253, Incidencia.Estado.ABIERTA , "fsdhf" , "DGASFHDG");
        Incidencia incidencia4 = new Incidencia(1223, Incidencia.Estado.ENPROCESO , "fsdhf" , "DGASFHDG");
        Incidencia incidencia5 = new Incidencia(1283, Incidencia.Estado.ABIERTA , "fsdhf" , "DGASFHDG");

        System.out.println(incidencia1);
        System.out.println(incidencia2);
        System.out.println(incidencia3);
        System.out.println(incidencia4);
        System.out.println(incidencia5);

        System.out.println(Incidencia.getPedientes());

        incidencia1.setEstado(Incidencia.Estado.RESUELTA);
        incidencia1.resuelve();
        incidencia3.setEstado(Incidencia.Estado.RESUELTA);
        incidencia3.resuelve();
        System.out.println(Incidencia.getPedientes());





    }
}
