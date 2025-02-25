package Programacion.tema6.practicaClase;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tienda {

    private ArrayList<ProductoBase>productos;
    private ArrayList<Compra>compras;

    public Tienda() {
        this.productos = new ArrayList<>();
        this.compras = new ArrayList<>();
    }


    public  boolean anadirProducto(ProductoBase p){
        return productos.add(p);

    }
    public boolean  eliminarProducto(String codigo){
        Producto pro = null ;
       for(ProductoBase p : productos){
           if(p.getCodigo().equals(codigo)){
               pro = p;
           }
       }
       this.productos.remove(pro);
       return true;
    }
    public boolean actualizarProducto(String codigo, Double precio, Integer stock){

        for(ProductoBase p : productos){
            if (p.getCodigo().equals(codigo)){
                p.setPrecio(precio);
                p.setStock(stock);
                return true;
            }
        }
          return false;
    }
    /*public ProductoBase buscarProducto(String codigo){
        for (ProductoBase p : productos) {
            if (p.getCodigo().equals(codigo)){
              return p;
            }
        }
        return null;
    }*/
    public boolean realizarCompra(String codigo, int cantidad) throws Exception{

        for (ProductoBase p : productos) {
            if (p.getCodigo().equals(codigo)) {
                if (cantidad > p.stock) {
                  throw new   StockInsuficienteExcepcion("No hay stock insuficiente de : " + p.getCodigo());
                } else {
                    p.setStock(p.getStock() - cantidad);
                    compras.add(new Compra(LocalDate.now() , cantidad, p));
                    return true;
                }
            }

        }
     return false;
    }
     public void mostrarInventario(){
         System.out.println("************Productos***********************");
        for (ProductoBase p : productos) {
            System.out.println(p.getInfo());
        }
         System.out.println("******************************************");

     }
     public void  mostrarHistorialCompras(){
         System.out.println("*********************Historial de compras **************************");
        for (Compra c : compras) {
            System.out.println(c);
        }
         System.out.println("*******************************************************************");
     }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("productos=").append(productos);
        sb.append(", compras=").append(compras);

        return sb.toString();
    }
}
