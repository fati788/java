package Programacion.Tema7_part2.Canciones;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Cancion> canciones = List.of(
                new Cancion("Blinding Lights", new Artista("The Weeknd", "Canadá"), 2024, 200, 90.5, Genero.POP),
                new Cancion("Levitating", new Artista("Dua Lipa", "Reino Unido"), 2024, 203, 88.7, Genero.POP),
                new Cancion("Lost Souls", new Artista("Foo Fighters", "EE. UU."), 2024, 210, 91.0, Genero.ROCK),
                new Cancion("Rise Again", new Artista("Sam Smith", "Reino Unido"), 2025, 220, 92.5, Genero.POP),
                new Cancion("Phoenix Rising", new Artista("Paramore", "EE. UU."), 2025, 180, 89.7, Genero.ROCK),
                new Cancion("The Final Frontier", new Artista("Ghost", "Suecia"), 2025, 215, 92.1, Genero.METAL),
                new Cancion("Shining Star", new Artista("Doja Cat", "EE. UU."), 2025, 185, 88.7, Genero.HIPHOP),
                new Cancion("Crimson Skies", new Artista("Foo Fighters", "EE. UU."), 2025, 225, 93.3, Genero.ROCK),
                new Cancion("Kiss Me More", new Artista("Doja Cat", "EE. UU."), 2024, 205, 87.1, Genero.POP)
        );
        
        //Consultas:::::
       // 1. Muestra las canciones de 2025
        System.out.println("Canciones 2025");
        canciones.stream()
                .filter(c -> c.getAnioLanzamiento() == 2025)
                .forEach(System.out::println);
       // 2. Muestra las canciones de Doja Cat
        System.out.println("Canciones Doja Cat");
        canciones.stream()
                .filter(c -> c.getArtista().getNombre().equals("Doja Cat"))
                .forEach(System.out::println);
       // 3. Muestra las canciones ordenadas de mayor a menor por popularidad.
        System.out.println("Canciones ordenados por Popularidad");
        canciones.stream()
                .sorted(Comparator.comparing(Cancion::getPopuliridad).reversed())
                .forEach(System.out::println);

        //4. Calcula la duración total de todas las canciones en minutos
       Integer duracionSegs = canciones.stream()
               .mapToInt(Cancion::getDuracionSegs)
               .sum();
        System.out.println("Duracion en minutos : " + duracionSegs/60);
         //or :
        //duracionSegs = canciones.stream().
        //                         .collect(Collectors.summingInt(Cancion::getDuracionSegs));
        //5. Agrupa las canciones por país de origen y cuántas canciones por país.
        Map<String , Long> cancionesPrPais = canciones .stream()
                .collect(Collectors.groupingBy(c -> c.getArtista().getPais() , Collectors.counting()));

                cancionesPrPais.forEach((k , v) -> System.out.println(k +" --> " + v));
        //6. Muestra las canciones agrupadas por género, cuántas por cada uno.
        Map<Genero , Long> cancionesPorGenero = canciones.stream()
                .collect(Collectors.groupingBy(Cancion::getGenero, Collectors.counting()));

        cancionesPorGenero.forEach((k , v) -> System.out.println(k +" --> " + v));
        //7. Comprueba si hay alguna canción con más del 95% de popularidad, y 90%
        System.out.println("------------------------");
        try {
            Cancion cacionMa = canciones.stream()
                    .filter(c -> c.getPopuliridad() > 90)
                    .findAny()
                    .orElseThrow();
            System.out.println(cacionMa);

        } catch (Exception e) {
            System.out.println("No hay canciones con esa popularidad");
        }
        System.out.println("--------------------------------------");
        //8. Muestra las tres canciones de más duración
        canciones.stream()
                .sorted(Comparator.comparing(Cancion::getDuracionSegs).reversed())
                .limit(3)
                .forEach(System.out::println);
        System.out.println("-------------------------------");
        //9. Genera una lista: titulo – artista, de todas las canciones ordenada alfabéticamente.
        canciones.stream()
                .map(c -> c.getTitulo() + " --> " + c.getArtista())
                .sorted()
                .forEach(System.out::println);
        System.out.println("-------------------------------");
       // 10. Muestra la duración media de las canciones
        Double mediaDura = canciones.stream()
                .collect(Collectors.averagingDouble(Cancion::getDuracionSegs));
        System.out.println(mediaDura);
        /**Metodo 2***/
         mediaDura = canciones.stream()
                 .mapToInt(Cancion::getDuracionSegs)
                 .average()
                 .orElseThrow();
        System.out.println(mediaDura);
      //  11. Muestra las estadísticas de popularidad (summarizingDouble)
        DoubleSummaryStatistics ssp = canciones.stream()
                .collect(Collectors.summarizingDouble(Cancion::getPopuliridad));
        System.out.println("suma: " + ssp.getSum() );
        System.out.println("min: " + ssp.getMin() );
        System.out.println("max: " + ssp.getMax() );
        System.out.println("media: " + ssp.getAverage() );

       // 12. Muestra el promedio de popularidad por género.

       Map<Genero , Double> popPorGenero = canciones.stream()
               .collect(Collectors.groupingBy( Cancion::getGenero , Collectors.averagingDouble(Cancion::getPopuliridad)));
       popPorGenero.forEach((k , v ) -> System.out.println(k +" --> " + v));

    }
}
