package Programacion.Tema7_part_2.Canciones;

public class Datos {

    /*Ejercicios 🎉

Ejercicios clase Streams
Canciones
- Artista:
o Atributos: nombre, pais
o Métodos: constructor, getters, setters, toString.
- Canción:
o Atributos: titulo, artista, anioLanzamiento, duracionSegs, popularidad (double),
genero (enum)
o Métodos: constructor, getters, setters, toString
Haz una clase de prueba y crea 10 canciones:
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
Métodos de streams:
1. Muestra las canciones de 2025
2. Muestra las canciones de Doja Cat
3. Muestra las canciones ordenadas de mayor a menor por popularidad.
4. Calcula la duración total de todas las canciones en minutos
5. Agrupa las canciones por país de origen y cuántas canciones por país.
6. Muestra las canciones agrupadas por género, cuántas por cada uno.
7. Comprueba si hay alguna canción con más del 95% de popularidad, y 90%
8. Muestra las tres canciones de más duración
9. Genera una lista: titulo – artista, de todas las canciones ordenada alfabéticamente.
10. Muestra la duración media de las canciones
11. Muestra las estadísticas de popularidad (summarizingDouble)
12. Muestra el promedio de popularidad por género.
Ejercicios clase Streams
Pedidos
- Cliente:
o Atributos: id (long), nombre, nivel (Integer)
o Métodos: constructor con todos los campos, getters, setters, toString.
- Producto
o Atributos: id (long), nombre, categoria (enum), precio (double)
o Métodos: constructor con todo, getters, setters, toString
- Pedido:
o Atributos: id (long), fechaPedido (LocalDate), fechaEnvio (LocalDate), estado (enum –
recibido, procesado, enviado), cliente (Cliente), productos (Set<Producto>)
o Métodos: constructor con todo menos productos. Getters y setters, toString,
addProducto.
Genera una clase de prueba TestPedidos que cree al menos tres clientes, 5 productos para
cada una de tres categorías (15 en total), por ejemplo, Libros, Juegos, Perifericos. Realiza al
menos cuatro pedidos con al menos 5 productos en cada pedido.
Cliente c1 = new Cliente(1L, "Manuel García", 2);
Cliente c2 = new Cliente(2L, "Esther Expósito", 1);
Cliente c3 = new Cliente(3L, "Goyo Jiménez", 2);
Producto prod1 = new Producto(1L, "Libro1", Producto.CategoriaProducto.LIBROS, 19.95);
Producto prod2 = new Producto(2L, "Libro2", Producto.CategoriaProducto.LIBROS, 27.95);
Producto prod3 = new Producto(3L, "Libro3", Producto.CategoriaProducto.LIBROS, 22.95);
Producto prod4 = new Producto(4L, "Libro4", Producto.CategoriaProducto.LIBROS, 15.95);
Producto prod5 = new Producto(5L, "Libro5", Producto.CategoriaProducto.LIBROS, 19.95);
Producto prod6 = new Producto(6L, "Juego1", Producto.CategoriaProducto.JUEGOS, 59.95);
Producto prod7 = new Producto(7L, "Juego2", Producto.CategoriaProducto.JUEGOS, 67.95);
Producto prod8 = new Producto(8L, "Juego3", Producto.CategoriaProducto.JUEGOS, 52.95);
Producto prod9 = new Producto(9L, "Juego4", Producto.CategoriaProducto.JUEGOS, 55.95);
Producto prod10 = new Producto(10L, "Juego5", Producto.CategoriaProducto.JUEGOS, 69.95);
Ejercicios clase Streams
Producto prod11 = new Producto(11L, "Periferico1", Producto.CategoriaProducto.PERIFERICOS, 19.95);
Producto prod12 = new Producto(12L, "Periferico2", Producto.CategoriaProducto.PERIFERICOS, 27.95);
Producto prod13 = new Producto(13L, "Periferico3", Producto.CategoriaProducto.PERIFERICOS, 32.95);
Producto prod14 = new Producto(14L, "Periferico4", Producto.CategoriaProducto.PERIFERICOS, 45.95);
Producto prod15 = new Producto(15L, "Periferico5", Producto.CategoriaProducto.PERIFERICOS, 59.95);
Pedido ped1 = new Pedido(1L, c1, Pedido.EstadoProducto.RECIBIDO, LocalDate.now().plusDays(5),null);
Pedido ped2 = new Pedido(2L, c2, Pedido.EstadoProducto.RECIBIDO, LocalDate.now().plusDays(20), null);
Pedido ped3 = new Pedido(3L, c3, Pedido.EstadoProducto.RECIBIDO, LocalDate.now().plusDays(7), null);
Pedido ped4 = new Pedido(4L, c1, Pedido.EstadoProducto.RECIBIDO, LocalDate.now().plusDays(2), null);
ped1.setProductos(new HashSet<>( List.of(prod1, prod3, prod5, prod10)));
ped2.setProductos(new HashSet<>( List.of(prod2, prod4, prod8, prod12)));
ped3.setProductos(new HashSet<>( List.of(prod11, prod13, prod14, prod15)));
ped4.setProductos(new HashSet<>( List.of(prod6, prod7, prod9, prod1, prod2, prod10)));
ArrayList<Pedido> pedidos = new ArrayList<>(List.of(ped1, ped2, ped3, ped4));
En la clase TestPedidos realiza los siguientes ejercicios de Streams:
1. Muestra los libros cuyo precio sea mayor de 20€
2. Muestra los pedidos que tengan algún pedido de "Juegos"
3. Genera una lista con todos los Productos, pero cambia su precio para que lleven un 10%
de descuento
4. Saca los productos que aparecen en los pedidos de clientes de nivel 2, realizados entre
el 01-04-2025 y el 01-05-2025. Hay que usar flatmap para unir todos los productos de
todos los pedidos: .flatMap(p -> p.getProductos().stream())
5. Muestra el producto más caro de la categoría Juegos
6. Devuelve los dos pedidos más recientes
7. Muestra los pedidos hechos hoy, debe aparecer el pedido y debajo la lista de productos
de ese pedido (peek y flatmap)
8. Calcula el total de todos los pedidos de abril de 2025
Ejercicios clase Streams
9. Obtén una colección de estadísticas de los Juegos: número, media, máximo, mínimo,
total. Hay que usar el método de Streams summaryStatistics() que devuelve un
DoubleSummaryStatistics.
10. Genera un Map<Long, Integer> donde como clave aparezca el id de pedido y como
valor el número de productos en el pedido. Collectors.toMap, que el primer parámetro
será función lambda para quedarnos con el id, y el segundo parámetro una función
lambda para el tamaño del Set de productos.
11. Genera un Map<Pedido, Double> donde la clave sea cada pedido y el valor sea el total
del pedido. Hay que usar Collectors.toMap pero al poner la clave es el propio pedido,
se pone Function.identity() en el primer parámetro de Collectors.toMap.
12. Genera un Map<String, List<Producto>> con la clave la categoría, y el valor los
productos de esa categoría. Usar Collectors.groupingBy
13. Saca el producto más caro de cada categoría. Genera un Map<String,
Optional<Producto>>. Usar Collectors.groupingBy y Collectors.maxBy

Corrección Canciones :


Test 👍

package tema7_parte2.streams.canciones;

import java.util.Comparator;
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

    	//Streams -------------------------------------------

    	//EJ1 - Canciones 2025
    	canciones.stream()
            	.filter(c -> c.getAnio().equals(2025) )
            	.forEach(System.out::println);

    	System.out.println("---------------------------");

    	//EJ2 - Canciones de DojaCat
    	canciones.stream()
            	.filter(c -> c.getArtista().getNombre().equals("Doja Cat"))
            	.forEach(System.out::println);

    	System.out.println("---------------------------");

    	//EJ3 - Canciones ordenadas mayor menor popularidad
    	canciones.stream()
            	.sorted(Comparator.comparing(Cancion::getPopularidad).reversed())
            	//.sorted( (c1,c2) -> c2.getPopularidad().compareTo(c1.getPopularidad()))
            	.forEach(System.out::println);

    	System.out.println("---------------------------");

    	//EJ4 - Duración en minutos
    	Integer duracionSegs = canciones.stream()
            	.collect(Collectors.summingInt(Cancion::getDuracionSegs));
    	System.out.println(duracionSegs / 60);

    	duracionSegs = canciones.stream()
                    	.mapToInt(Cancion::getDuracionSegs)
                    	.sum();
    	System.out.println(duracionSegs / 60);

    	System.out.println("---------------------------");

    	//EJ5 - Agrupar por país
    	Map<String, Long> agrupPais = canciones.stream()
            	.collect(Collectors.groupingBy(c -> c.getArtista().getPais() ,
                    	Collectors.counting()));
    	agrupPais.forEach((k,v) -> System.out.println(k + " " + v));

    	System.out.println("---------------------------");

    	//EJ6 - Agrupar por genero
    	Map<Genero, Long> agrupGenero = canciones.stream()
            	.collect(Collectors.groupingBy(Cancion::getGenero,
                    	Collectors.counting()));
    	agrupGenero.forEach((k,v) -> System.out.println(k + " " + v));

    	System.out.println("---------------------------");

    	//EJ7 Canción 95% popularidad
    	try {
        	Cancion popular = canciones.stream()
                	.filter(c -> c.getPopularidad() >= 90.0)
                	.findAny()
                	.orElseThrow();
        	System.out.println(popular);
    	} catch (Exception e) {
        	System.out.println("No hay canción con esa popularidad");
    	}

    	System.out.println("---------------------------");

    	//EJ8 Las tres de más duracion
    	canciones.stream()
            	.sorted(Comparator.comparing(Cancion::getDuracionSegs).reversed())
            	.limit(3)
            	.forEach(System.out::println);

    	System.out.println("---------------------------");

    	//EJ9 Genera lista titulo - artista
    	List<String> resumen = canciones.stream()
            	.map( c -> c.getTitulo() + " - " + c.getArtista().getNombre())
            	.sorted()
            	.toList();
    	resumen.forEach(System.out::println);

    	//EJ10 Duración media
    	Double mediaDuracion = canciones.stream()
            	.mapToInt(Cancion::getDuracionSegs)
            	.average()
            	.orElseThrow();
    	System.out.println(mediaDuracion);

    	//EJ11 Media popularidad
    	Double mediaPopularidad = canciones.stream()
            	.collect(Collectors.summarizingDouble(Cancion::getPopularidad))
            	.getAverage();
    	System.out.println(mediaPopularidad);

	}
}



 //1. Muestra los libros cuyo precio sea mayor de 20€
        Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,
                        prod11,prod12,prod13,prod14,prod15)
                .filter( pr -> pr.getCategoria().equals(CategoriaProducto.LIBROS))
                .filter(pr -> pr.getPrecio() > 20)
                .forEach(System.out::println);

        //2. Muestra los pedidos que tengan algún producto de "Juegos"
        pedidos.stream()
                .filter(ped -> ped.getProductos().stream()
                        .anyMatch(pr -> pr.getCategoria().equals(CategoriaProducto.JUEGOS))
                )
                .forEach(p -> {
                    System.out.println(p.getId());
                });

        //3. Genera una lista con todos los Productos, pero cambia su precio para que lleven un 10%
        //de descuento
        List<Producto> productosDescuento = Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,
                        prod11,prod12,prod13,prod14,prod15)
                .peek( pr -> pr.setPrecio(pr.getPrecio() * 0.9))
                .toList();
        productosDescuento.forEach(System.out::println);

        System.out.println("----------------------");

        //4. Saca los productos que aparecen en los pedidos de clientes de nivel 2, realizados entre
        //el 01-04-2025 y el 01-05-2025.
        pedidos.stream()
                .filter( ped -> ped.getCliente().getNivel() == 2)
                .filter( ped -> ped.getFechaPedido().isAfter(LocalDate.of(2025,4,1))
                        && ped.getFechaPedido().isBefore(LocalDate.of(2025,5,1)))
                .flatMap(ped -> ped.getProductos().stream())
                .distinct()
                .forEach(System.out::println);

        System.out.println("----------------------");
        //5. Muestra el producto más caro de la categoría Juegos
        Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,
                        prod11,prod12,prod13,prod14,prod15)
                .filter(pr -> pr.getCategoria().equals(CategoriaProducto.JUEGOS))
                .sorted(Comparator.comparing(Producto::getPrecio).reversed())
                .limit(1)
                .forEach(System.out::println);

        Producto juegoCaro = Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,
                        prod11,prod12,prod13,prod14,prod15)
                .filter(pr -> pr.getCategoria().equals(CategoriaProducto.JUEGOS))
                .max(Comparator.comparing(Producto::getPrecio))
                .orElse(null);
        System.out.println(juegoCaro);

        System.out.println("--------------");
        //6. Devuelve los dos pedidos más recientes
        pedidos.stream()
                .sorted(Comparator.comparing(Pedido::getFechaPedido).reversed())
                .limit(2)
                .forEach(System.out::println);

        System.out.println("--------------------");
        //7. Muestra los pedidos hechos hoy, debe aparecer el pedido y debajo la lista de productos
        //de ese pedido
        pedidos.stream()
                .filter(ped -> ped.getFechaPedido().equals(LocalDate.now()))
                .forEach(ped -> {
                    System.out.println(ped);
                    ped.getProductos().stream().forEach(System.out::println);
                });

        System.out.println("xxxxx");
        pedidos.stream()
                .filter(ped -> ped.getFechaPedido().equals(LocalDate.now()))
                .peek(System.out::println)
                .flatMap(ped -> ped.getProductos().stream())
                .forEach(System.out::println); //Pinta todos los productos de esos pedidos

        System.out.println("------------------------");
        //8. Calcula el total de todos los pedidos de abril de 2025
        Double totalAbril = pedidos.stream()
                .filter(ped -> ped.getFechaPedido().getMonth().equals(Month.APRIL))
                //.peek(ped -> System.out.println(ped.getId()))
                .flatMap(ped -> ped.getProductos().stream())
                //.peek( prod -> System.out.println(prod.getId() + "-" + prod.getPrecio()))
                .mapToDouble(Producto::getPrecio)
                .sum();
        System.out.println("Total pedidos Abril= " + totalAbril);

        System.out.println("-----------------------");
        //9. Obtén una colección de estadísticas de los Juegos: número, media, máximo, mínimo,
        //total
        DoubleSummaryStatistics dss = Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,
                        prod11,prod12,prod13,prod14,prod15)
                .filter(pr -> pr.getCategoria().equals(CategoriaProducto.JUEGOS))
                .mapToDouble(Producto::getPrecio)
                .summaryStatistics();

        DoubleSummaryStatistics dss2 = Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,
                        prod11,prod12,prod13,prod14,prod15)
                .filter(pr -> pr.getCategoria().equals(CategoriaProducto.JUEGOS))
                .collect(Collectors.summarizingDouble(Producto::getPrecio));

        System.out.println("Número: " + dss2.getCount());
        System.out.println("Media: " + dss2.getAverage());
        System.out.println("Max: " + dss2.getMax());
        System.out.println("Min: " + dss2.getMin());
        System.out.println("Total: " + dss2.getSum());

        System.out.println("-----------------------");
        //10. Genera un Map<Long, Integer> donde como clave aparezca el id de pedido y como
        //valor el número de productos en el pedido
        Map<Long, Integer> pedidoCount = pedidos.stream()
                .collect(Collectors.toMap(Pedido::getId, ped -> ped.getProductos().size()));
        pedidoCount.forEach( (k,v) -> System.out.println(k + ": " + v));

        System.out.println("-----------------------");
        //11. Genera un Map<Pedido, Double> donde la clave sea cada pedido y el valor sea el total
        //del pedido.
        Map<Pedido,Double> pedidosTotal = pedidos.stream()
                .collect(Collectors.toMap(Function.identity(), ped ->
                        ped.getProductos().stream()
                                .mapToDouble(Producto::getPrecio)
                                .sum()));
        pedidosTotal.forEach((k,v) -> System.out.println(k.getId() + ": "+ v));

        HashMap<Pedido, Double> pedidosTotalMutable = new HashMap<>(pedidosTotal);

        System.out.println("--------------------");
        //12. Genera un Map<String, List<Producto>> con la clave la categoría, y el valor los
        //productos de esa categoría.
        Map<CategoriaProducto, List<Producto>> productosByCategoria = Stream.of(prod1,prod2,prod3,
                        prod4,prod5,prod6,prod7,prod8,prod9,prod10,prod11,prod12,prod13,prod14,prod15)
                .collect(Collectors.groupingBy(Producto::getCategoria));
        productosByCategoria.forEach((k,v) -> {
            System.out.print(k + " -> ");
            v.stream().forEach( pr -> System.out.print(pr.getId() + ", "));
            System.out.println();
        });

        System.out.println("-----------------------");
        //13. Saca el producto más caro de cada categoría
        Map<CategoriaProducto, Optional<Producto>> categoriaMasCaro = Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,prod11,prod12,prod13,prod14,prod15)
                .collect(Collectors.groupingBy(Producto::getCategoria,
                        Collectors.maxBy(Comparator.comparing(Producto::getPrecio))));

        categoriaMasCaro.forEach((k,v) ->
                System.out.println(k + " -> " + v.orElse(null)));


        boolean encontrado = false;
        for(Producto p: productosDescuento) {
            if (p.getCategoria().equals(CategoriaProducto.LIBROS)) {
                encontrado = true;
                break;
            }

            //else
            //    encontrado = false;
        }
        System.out.println(encontrado);

        encontrado = productosDescuento.stream()
                .anyMatch(pr -> pr.getCategoria().equals(CategoriaProducto.LIBROS));

        ArrayList<Producto> nuevaLista = new ArrayList<>(Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,prod11,prod12,prod13,prod14,prod15)
                .toList());
        nuevaLista.remove(2);

*/
}
