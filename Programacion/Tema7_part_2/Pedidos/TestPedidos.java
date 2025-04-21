package Programacion.Tema7_part_2.Pedidos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class TestPedidos {
    public static void main(String[] args) {

        Cliente c1 = new Cliente(1L, "Manuel García", 2);
        Cliente c2 = new Cliente(2L, "Esther Expósito", 1);
        Cliente c3 = new Cliente(3L, "Goyo Jiménez", 2);

        Producto prod1 = new Producto(1L, "Libro1", CategoriaProducto.LIBROS, 19.95);
        Producto prod2 = new Producto(2L, "Libro2", CategoriaProducto.LIBROS, 27.95);
        Producto prod3 = new Producto(3L, "Libro3", CategoriaProducto.LIBROS, 22.95);
        Producto prod4 = new Producto(4L, "Libro4", CategoriaProducto.LIBROS, 15.95);
        Producto prod5 = new Producto(5L, "Libro5", CategoriaProducto.LIBROS, 19.95);
        Producto prod6 = new Producto(6L, "Juego1",CategoriaProducto.JUEGOS, 59.95);
        Producto prod7 = new Producto(7L, "Juego2", CategoriaProducto.JUEGOS, 67.95);
        Producto prod8 = new Producto(8L, "Juego3", CategoriaProducto.JUEGOS, 52.95);
        Producto prod9 = new Producto(9L, "Juego4", CategoriaProducto.JUEGOS, 55.95);
        Producto prod10 = new Producto(10L, "Juego5", CategoriaProducto.JUEGOS, 69.95);
        Producto prod11 = new Producto(11L, "Periferico1",CategoriaProducto.PERIFERICOS, 19.95);
        Producto prod12 = new Producto(12L, "Periferico2", CategoriaProducto.PERIFERICOS, 27.95);
        Producto prod13 = new Producto(13L, "Periferico3", CategoriaProducto.PERIFERICOS, 32.95);
        Producto prod14 = new Producto(14L, "Periferico4", CategoriaProducto.PERIFERICOS, 45.95);
        Producto prod15 = new Producto(15L, "Periferico5", CategoriaProducto.PERIFERICOS, 59.95);

        Pedido ped1 = new Pedido(1L, c1, EstadoProducto.RECIBIDO, LocalDate.now().minusDays(5),null);
        Pedido ped2 = new Pedido(2L, c2, EstadoProducto.RECIBIDO, LocalDate.now().minusDays(20), null);
        Pedido ped3 = new Pedido(3L, c3, EstadoProducto.RECIBIDO, LocalDate.now().minusDays(7), null);
        Pedido ped4 = new Pedido(4L, c1, EstadoProducto.RECIBIDO, LocalDate.now().minusDays(2), null);

        ped1.setProductos(new HashSet<>( List.of(prod1, prod3, prod5, prod10)));
        ped2.setProductos(new HashSet<>( List.of(prod2, prod4, prod8, prod12)));
        ped3.setProductos(new HashSet<>( List.of(prod11, prod13, prod14, prod15)));
        ped4.setProductos(new HashSet<>( List.of(prod6, prod7, prod9, prod1, prod2, prod10)));

        ArrayList<Pedido> pedidos = new ArrayList<>(List.of(ped1, ped2, ped3, ped4));


        //1. Muestra los libros cuyo precio sea mayor de 20€
        Stream.of(prod1 , prod2 , prod3 , prod5 , prod4)
                .filter(pr -> pr.getPrecio()>20)
                .forEach(System.out::println);
        System.out.println("----------------------------");
        //2. Muestra los pedidos que tengan algún producto de "Juegos"
        pedidos.stream()
                .filter( p -> p.getProductos().stream()
                        .anyMatch(pr -> pr.getCategoria().equals(CategoriaProducto.JUEGOS)
                ))
                .forEach(System.out::println);
        System.out.println("-------------------------------");

       // 3. Genera una lista con todos los Productos, pero cambia su precio para que lleven un 10%
        //de descuento

       List<Producto> productosDescuento= Stream.of(prod1 , prod2 , prod3 , prod5 , prod4 , prod6
                       ,prod7 , prod8 , prod9 , prod10 , prod11 , prod12 , prod13 , prod14 , prod15)
                .peek(pr -> pr.setPrecio(pr.getPrecio()*0.9))
                .toList();
       productosDescuento
               .forEach(System.out::println);

        System.out.println("-------------------------------");
        /*4. Saca los productos que aparecen en los pedidos de clientes de nivel 2, realizados entre
        el 01-04-2025 y el 01-05-2025. Hay que usar flatmap para unir todos los productos de
        todos los pedidos: .flatMap(p -> p.getProductos().stream())*/
        pedidos.stream()
                .filter(p -> p.getCliente().getNivel() == 2)
                .filter(p -> p.getFechaPedido().isAfter(LocalDate.of(2025,4,1))
                                                                   && p.getFechaPedido().isBefore(LocalDate.of(2025,5,1)))
                .flatMap(p -> p.getProductos().stream())
                .forEach(System.out::println);
        System.out.println("---------------------------------------");
       // 5. Muestra el producto más caro de la categoría Juegos
       // 6. Devuelve los dos pedidos más recientes
       /* 7. Muestra los pedidos hechos hoy, debe aparecer el pedido y debajo la lista de productos
        de ese pedido (peek y flatmap)*/
        //8. Calcula el total de todos los pedidos de abril de 2025

       /* 9. Obtén una colección de estadísticas de los Juegos: número, media, máximo, mínimo,
                total. Hay que usar el método de Streams summaryStatistics() que devuelve un
        DoubleSummaryStatistics.*/
       /* 10. Genera un Map<Long, Integer> donde como clave aparezca el id de pedido y como
        valor el número de productos en el pedido. Collectors.toMap, que el primer parámetro
        será función lambda para quedarnos con el id, y el segundo parámetro una función
        lambda para el tamaño del Set de productos.*/
        /*11. Genera un Map<Pedido, Double> donde la clave sea cada pedido y el valor sea el total
        del pedido. Hay que usar Collectors.toMap pero al poner la clave es el propio pedido,
        se pone Function.identity() en el primer parámetro de Collectors.toMap.*/
        /*12. Genera un Map<String, List<Producto>> con la clave la categoría, y el valor los
        productos de esa categoría. Usar Collectors.groupingBy*/
       /* 13. Saca el producto más caro de cada categoría. Genera un Map<String,
                Optional<Producto>>. Usar Collectors.groupingBy y Collectors.maxBy*/

    }
}
