package Programacion.Tema7_part3.PracticaClase.Ejercicio3.io;

import Programacion.Tema5.PracticaClase.Producto;
import Programacion.Tema7_part3.PracticaClase.Ejercicio3.model.*;
import Programacion.Tema7_part3.PracticaClase.Ejercicio3.service.GestionComprasVentas;
import Programacion.Tema7_part3.PracticaClase.Ejercicio3.service.VentasUsuario;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class FileUtils {


    public List<Usuario> cargarUsuarios(){
        try {
            List<Usuario> usuarios = Files.lines(Paths.get("Programacion/Tema7_part3/PracticaClase/Ejercicio3/io/Usuarios.csv"))
                    .map(line -> {
                        List<String> tokens = Arrays.asList(line.split(","));
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                        return new Usuario(tokens.get(0) , tokens.get(1) , Genero.valueOf(tokens.get(2)) ,
                                LocalDate.parse(tokens.get(3) , dtf) ,tokens.get(4) , tokens.get(5) , tokens.get(6));

                    }).toList();
            return usuarios;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Producto2Mano> cargarProductos(){
        try {
            List<Producto2Mano> productos = Files.lines(Paths.get("Programacion/Tema7_part3/PracticaClase/Ejercicio3/io/Productos.csv"))
                    .map(line -> {
                        List<String> tokens = Arrays.asList(line.split(","));

                        Usuario u = cargarUsuarios().stream()
                                .filter( us -> us.getDni().equals(tokens.get(7)))
                                .findFirst()
                                .orElse(null);

                        return new Producto2Mano(Integer.parseInt(tokens.get(0)) , tokens.get(1) , tokens.get(2)
                                , Categoria.valueOf(tokens.get(3)) , Estado.valueOf(tokens.get(4)) ,Boolean.valueOf(tokens.get(5))
                                ,Double.parseDouble(tokens.get(6)) , u);
                    }).toList();

            return productos;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public List<Compra> cargarCompras(){
        try {
            List<Compra> compras = Files.lines(Paths.get("Programacion/Tema7_part3/PracticaClase/Ejercicio3/io/compas.csv"))
                    .map(line -> {
                        List<String> tokens = Arrays.asList(line.split(","));
                        Usuario userComp = cargarUsuarios().stream()
                                .filter( u -> u.getDni().equals(tokens.get(0)))
                                .findFirst()
                                .orElse(null);

                        Usuario userVen = cargarUsuarios().stream()
                                .filter( u -> u.getDni().equals(tokens.get(1)))
                                .findFirst()
                                .orElse(null);
                        Producto2Mano pr = cargarProductos().stream()
                                .filter( p -> p.getId().equals(tokens.get(2)))
                                .findFirst()
                                .orElse(null);
                        DateTimeFormatter dttf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                        return new Compra(userComp , userVen , pr ,LocalDate.parse(tokens.get(3) ,dttf) , Double.parseDouble(tokens.get(4) ));
                    }).toList();
            return compras;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public GestionComprasVentas cargarCSV(){
        VentasUsuario vu = new VentasUsuario();
        vu.getCompras().addAll(cargarCompras());
        vu.getVentas().addAll(cargarCompras());
        vu.getProductosDisponibles().addAll(cargarProductos());
        vu.setUsuario(cargarCompras().getFirst().getUsuarioComprador());

        GestionComprasVentas gv = new GestionComprasVentas();
        gv.getVentasUsuarios().add(vu);
        gv.getCompras().addAll(vu.getCompras());

        return gv;
    }
}
