package Programacion.tema6.practicaClase;

public class Equipamiento extends ProductoBase {

    private String deporte;
    private String marca;

    public Equipamiento(String codigo, String nombre, Double precio, Integer stock ,String deporte , String marca) {
        super(codigo, nombre, precio, stock);
        this.deporte = deporte;
        this.marca = marca;

    }


    @Override
    public String getInfo() {
        final StringBuffer sb = new StringBuffer("Equipamiento{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", stock=").append(stock);
        sb.append(", deporte='").append(deporte).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
