package Programacion.Tema7_part3.PracticaClase.Ejercicio3.service;

import Programacion.Tema7_part3.PracticaClase.Ejercicio3.model.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class GestionComprasVentas {
    public Set<VentasUsuario> ventasUsuarios;
    private List<Compra> transaciones;

    public GestionComprasVentas() {
        this.ventasUsuarios = new HashSet<>();
        this.transaciones = new ArrayList<>();
    }


    public Set<VentasUsuario> getVentasUsuarios() {
        return ventasUsuarios;
    }

    public List<Compra> getCompras() {
        return transaciones;
    }
    public void addVentasUsuario(VentasUsuario vu) {
        this.ventasUsuarios.add(vu);
    }
    public void removeVentasUsuario(VentasUsuario vu) {
        this.ventasUsuarios.remove(vu);
    }




    public void realizarCompra(Usuario comprador , Producto2Mano producto) {
        Compra c = new Compra(comprador , producto.getUsuario() ,producto, LocalDate.now() , producto.getPrecio());
        this.transaciones.add(c);

        this.buscarVentasUsuario(producto.getUsuario()).addVenta(c);
       this.buscarVentasUsuario(comprador).addCompra(c);


    }
    private VentasUsuario buscarVentasUsuario(Usuario usuario) {
        return  this.ventasUsuarios.stream()
                .filter( vu -> vu.getUsuario().equals(usuario))
                .findFirst()
                .orElse(null);
    }


    public void CalcularImporteTotalDelCompra(){
      double importeTotal =  this.transaciones.stream()
               .mapToDouble(Compra::getPrecio)
               .sum();
        System.out.println("El importe total de compras es: " +importeTotal);

    }
    public void ComprasAgrupadasPorUsuario(){
        Map<Usuario , List<Compra>> comprasUsuario = this.transaciones.stream()
                .collect(Collectors.groupingBy(Compra::getUsuarioComprador));


        comprasUsuario.forEach((k , v) -> v.stream().sorted(Comparator.comparing(Compra::getFecha)));
        comprasUsuario.forEach((k, v) -> System.out.println( k + " -> " +v));

    }
    public void ComprasAgrupadasPorCategoria(){
        Map<Categoria , List<Compra>> categoriaListMap = this.transaciones.stream()
                .collect(Collectors.groupingBy(c -> c.getProducto().getCategoria()));

        categoriaListMap.forEach((k, v) -> System.out.println(k + " -> " +v));
    }

    public void TotalComprasAgrupadasPorEstado() {
        Map<Estado, Long> NumComprasPorEstado = this.transaciones.stream()
                .collect(Collectors.groupingBy(c -> c.getProducto().getEstado(), Collectors.counting()));

        NumComprasPorEstado.forEach((k, v) -> System.out.println(k + " -> " + v));

    }

    public void NumComprasPorCategoriaUsuarios(){
        
        Map<Categoria , Long> categoriaLongMap = this.transaciones.stream()
                .filter(c -> ChronoUnit.YEARS.between(c.getUsuarioComprador().getFechaNacimiento() , LocalDate.now()) <30)
                .collect(Collectors.groupingBy(c -> c.getProducto().getCategoria(), Collectors.counting()));

        categoriaLongMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
    public void NumComprasPorDiaSemana(){
        Map<DayOfWeek , Long> comprasPorDias = this.transaciones.stream()
                .collect(Collectors.groupingBy( c -> c.getFecha().getDayOfWeek() , Collectors.counting()));

        comprasPorDias.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
