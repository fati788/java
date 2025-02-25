package Programacion.tema6.practicaClase;

public interface Producto {

    String getCodigo();
    String getNombre();
    Double getPrecio();
    Integer getStock();
    void setStock(Integer stock);
    void setPrecio(Double precio);
    void descontarStock(int cantidad);
    String getInfo();

}
