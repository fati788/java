package Programacion.Tema7_part_2.Pactica_2.SensoresPlantacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;

public class TestRegistro {

    /**
     * metodo para generar numeros aleatorios
     * @param min
     * @param max
     * @return
     */
    public static double numeroAleatorio(double min , double max){
        return  (Math.random()*(max-min+1))+min;
    }

    public static void main(String[] args) {

        ArrayList<Registro> registros = new ArrayList<Registro>();
        for (int i = 0; i < 100; i++) {
            registros.add(new Registro(LocalDateTime.of(2025 , 3 ,12,12,30).plusMinutes(i),numeroAleatorio(0 , 50),
                                  numeroAleatorio(0 ,100)));
        }

        /*1. Filtrar los registros de temperatura que sean mayores a 25 grados, la humedad sea menor a 70 y la
        fecha sea anterior a la fecha actual, y mostrarlos.*/

        registros.stream()
                .filter(s -> (s.getTemperatura() > 25 && s.getHumedad()<70 && s.getFachaHora().isBefore(LocalDateTime.now())))
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");

        //2. Encontrar el registro con la temperatura más alta y mostrar el registro completo.
        System.out.println("Registro de temp mas alta: ");
        Registro registroMaxTemp = registros.stream()
                .max(Comparator.comparing(Registro::getTemperatura))
                .orElseThrow();
        System.out.println(registroMaxTemp);
        System.out.println("----------------------------------------------");
        
       // 3. Obtener una lista con las fechas/horas de todas las tomas de datos.
        registros.stream()
                .map(Registro::getFachaHora)
                .toList()
                .forEach(System.out::println);
        System.out.println("-----------Incrementa 5 unidades de humedad---------");
        /*4. Incrementar en 5 unidades la humedad de todos los registros y mostrar las temperaturas,
                humedades y fechas/horas actualizadas.*/

         registros.stream()
                 .peek(r -> r.setHumedad(r.getTemperatura()+5))
                         .forEach(System.out::println);

        /*5. Encontrar el registro con la temperatura más baja que tenga una humedad mayor a 80 y mostrar la
        temperatura, humedad y fecha.*/
        System.out.println("Registro de temp mas baja: ");
        Registro registroMinTemp = registros.stream()
                .filter(s -> s.getHumedad()>80)
                .min(Comparator.comparing(Registro::getTemperatura))
                .orElse(null);
        if (registroMinTemp != null) {
            System.out.println("temp : " + registroMinTemp.getTemperatura()
                    + " khumedad : " + registroMinTemp.getHumedad()
                    + " fecha : " + registroMinTemp.getFachaHora());
        }else {
            System.out.println("No hay ningun registro que cumple las condiciones");
        }
        /*6. Verificar si algún registro tiene una temperatura mayor a 30 grados, humedad mayor a 90 y la fecha
        es de hoy. Mostrar un mensaje indicando si hay algún registro que cumple esta condición o no.*/
        System.out.println("Hay registro que cumple la condicion ?");
        Registro registroFinded = registros.stream()
                .filter(r -> (r.getTemperatura()>30 && r.getHumedad()>90 && r.getFachaHora().equals(LocalDateTime.now())))
                .findAny()
                .orElse(null);

        if (registroFinded != null){
            System.out.println("Si , hay un registro que comple la condicion eso: " + registroFinded);
        }else{
            System.out.println("No , no hay");
        }


        System.out.println("------------------------------------------------------");

        //7. Muestra 10 registros saltándote los 5 primeros.
        System.out.println("10 Registros saltándote los 5 primeros ");
        registros.stream()
                .skip(5)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("------------------------------------------------------");
        //8. Muestra los registros ordenados por fecha (sorted(Comparator))
        System.out.println("Registros ordenados por facha : ");
        registros.stream()
                .sorted(Comparator.comparing(Registro::getFachaHora))
                .forEach(System.out::println);
        System.out.println("------------------------------------------------------");
       // 9. Cuenta los registros que tengan temperatura mayor a 35 grados (count()).

       long tempMayor35 = registros.stream()
                .filter(r -> r.getTemperatura() >35)
                .count();
        System.out.println("El numero do los registros que tengan temp mayor que 35 es: " + tempMayor35);
        System.out.println("------------------------------------------------------");

        /*10. Calcular la temperatura promedio de todos los registros (transformarlo en Stream<Double> y
        llamar a average()).*/

        double avgTemp = registros.stream()
                .mapToDouble(Registro::getTemperatura)
                .average()
                .orElseThrow();
        System.out.println("La temperatura promedio :" +avgTemp );

    }
}
