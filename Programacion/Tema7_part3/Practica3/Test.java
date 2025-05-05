package Programacion.Tema7_part3.Practica3;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {
        DAOFinca misFincas = new DAOFinca();


      // misFincas.mostrarFincas();
       // System.out.println("--------------------------------------------------");
        DAOLecturas lecturas = new DAOLecturas();
        //lecturas.addLectura(new Lectura(55555 , 12.0,14.0 , LocalDate.of(2015 , 5 , 2) ,misFincas.findById(10)));
     //   lecturas.grabarDatos();
     //   lecturas.mostrarLecturas();

     //Comprueba metodos de part3 :

        misFincas.getFincasPorSuperficie().forEach(System.out::println);
        System.out.println("--------------------------------------------");
        misFincas.getMasGrandes().forEach(System.out::println);
        System.out.println("-------------------------------");
        misFincas.getFincasPorCiudad().forEach((k , v) -> System.out.println(k + " -> " + v));
        System.out.println("-------------------------------");
        misFincas.getFincasMedio().forEach(System.out::println);
        System.out.println("-------------------------------------");

        lecturas.getLecturasPorFinca().forEach((k , v) -> System.out.println(k + " -> " + v));
        System.out.println("-------------------------------");
        System.out.println(lecturas.getTempMaximaFinca(10));
        System.out.println("---------------------------------");
        System.out.println(lecturas.getTempMinimaFinca(7));
        System.out.println("----------------------------------");
        lecturas.getHumedadPorFinca(10).forEach(System.out::println);
        System.out.println("-------------------------------");
        lecturas.getTemperaturaPorFinca(5).forEach(System.out::println);
        System.out.println("-------------------------------");
        lecturas.getTemperaturaDiaPorFinca(4 , LocalDate.now()).forEach(System.out::println);

        //eliminar 5 lecturas
        lecturas.deleteLectura(new Lectura(39 , 0.0 , 0.0 , null , null));
        lecturas.deleteLectura(new Lectura(2 , 0.0 , 0.0 , null , null));
        lecturas.deleteLectura(new Lectura(3 , 0.0 , 0.0 , null , null));
        lecturas.deleteLectura(new Lectura(4 , 0.0 , 0.0 , null , null));
        lecturas.deleteLectura(new Lectura(5 , 0.0 , 0.0 , null , null));
        lecturas.grabarDatos();


    }
}
