package Programacion.tema6.Examen2024;

public class AsientoTurista extends Asiento {

    private Boolean ventana;
    public AsientoTurista(Long id, Double precioBase, Integer fila, String letra, Boolean ventana) {
        super(id, precioBase, fila, letra);
        this.ventana = ventana;
        this.tipo=TipoAsiento.TURISTA;
    }

    public Boolean getVentana() {
        return ventana;
    }

    public void setVentana(Boolean ventana) {
        this.ventana = ventana;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoTurista{");
        sb.append("codigp=").append(this.getCodigo());
        sb.append(", pasajero=").append(this.getPasajero()==null ? "X" :this.getPasajero().getDniPasaporte());
        sb.append(", precioBase=").append(this.CalcularPrecio());
        sb.append(", tipo=").append(tipo);
        sb.append(", ventana=").append(ventana);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double CalcularPrecio() {
        if (ventana) {
            return this.precioBase+10;
        }
        return this.precioBase;
    }
}
