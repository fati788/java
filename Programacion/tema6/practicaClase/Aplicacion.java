package Programacion.tema6.practicaClase;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {

        Tienda miTienda = new Tienda();
        miTienda.anadirProducto(new Equipamiento("QWRC-214" , "Equi 1" , 23.5,30,"FootBall " , " Fulk"));
        miTienda.anadirProducto(new RopaDeportiva("ADKSG-354" , "Camasita" , 24.7 , 24 , "fdt" , "XL"));
        miTienda.anadirProducto(new Equipamiento("QWRC-614" , "Equi 2" , 26.5,50,"FootBall " , " Fulk"));
        miTienda.anadirProducto(new RopaDeportiva("ADKSG-0054" , "Pantalon" , 29.7 , 89 , "fawer" , "L"));

       Scanner sc = new Scanner(System.in);
       int opcion =0;
        do {

            System.out.println("Tienda");
            System.out.println("********************");
            System.out.println("1.Mostrar inventario");
            System.out.println("2.Agregar producto");
            System.out.println("3.Eliminar producto");
            System.out.println("4.Actualizar producto");
            System.out.println("5.Realizar compra");
            System.out.println("6.Mostrar historial de compras");
            System.out.println("7.Salir");
            System.out.println("Elige opcion del 1 al 7");
            try {
                opcion = Integer.parseInt(sc.nextLine());
                String codigo;
                String nombre;
                double precio;
                int stock;
                String material;
                String talla;
                String deporte;
                String marca;
                switch (opcion) {
                    case 1:
                        miTienda.mostrarInventario();
                        break;
                    case 2:
                        System.out.println("Dime el codigo");
                        codigo = sc.nextLine();
                        System.out.println("Dime el nombre");
                        nombre = sc.nextLine();
                        System.out.println("Dime el precio");
                        precio = Double.parseDouble(sc.nextLine());
                        System.out.println("Dime el stock");
                        stock = Integer.parseInt(sc.nextLine());
                        System.out.println("Dime el tipo de Producto es (Equipamiento o Ropa Deportiva) ");
                        String tipo = sc.nextLine();
                        if (tipo.equalsIgnoreCase("Equipamiento")) {
                            System.out.println("Dime el deporte ");
                            deporte = sc.nextLine();
                            System.out.println("Dime la marca");
                            marca = sc.nextLine();
                            if (miTienda.anadirProducto(new Equipamiento(codigo, nombre, precio, stock, deporte, marca))) {
                                System.out.println("Producto añadido");

                            }

                        } else if (tipo.equalsIgnoreCase("Ropa Deportiva")) {
                            System.out.println("Dime el material");
                            material = sc.nextLine();
                            System.out.println("Dime el talla");
                            talla = sc.nextLine();
                            if (miTienda.anadirProducto(new RopaDeportiva(codigo, nombre, precio, stock, material, talla))) {
                                System.out.println("Producto añadido");
                            }

                        } else {
                            System.out.println("No existe este tipo de producto");
                        }
                        break;
                    case 3:
                            System.out.println("Dime el codigo");
                            codigo = sc.nextLine();
                            if (miTienda.eliminarProducto(codigo)) {
                                System.out.println("Producto eliminado");
                            } else {
                                System.out.println("No encontrado");
                            }
                        break;
                    case 4:
                        System.out.println("Dime el codigo");
                        codigo = sc.nextLine();
                        System.out.println("Dime el nuevo  precio");
                        precio = Double.parseDouble(sc.nextLine());
                        System.out.println("Dime el nuevo stock");
                        stock = Integer.parseInt(sc.nextLine());
                        if (miTienda.actualizarProducto(codigo, precio, stock)) {
                            System.out.println("Contacto actualizado");
                        } else {
                            System.out.println("No encontrado");
                        }
                        break;
                    case 5:
                        System.out.println("Dime el codigo");
                        codigo = sc.nextLine();
                        System.out.println("Dime la cantidad que quieres");
                        int cantidad = Integer.parseInt(sc.nextLine());
                        if (miTienda.realizarCompra(codigo, cantidad)) {
                            System.out.println("Compra realizada");
                        }
                        break;
                    case 6:
                        miTienda.mostrarHistorialCompras();
                        break;
                    case 7:
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println(" opcion invalida ");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(opcion != 7);
    }

}
