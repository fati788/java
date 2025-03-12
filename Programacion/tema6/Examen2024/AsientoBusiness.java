package Programacion.tema6.Examen2024;

public class AsientoBusiness extends Asiento {
    private Boolean comida;

    public AsientoBusiness(Long id, Double precioBase, Integer fila, String letra,Boolean comida) {
        super(id, precioBase, fila, letra);
        this.comida = comida;
        this.tipo= TipoAsiento.BUSINESS;
    }

    public Boolean getComida() {
        return comida;
    }

    public void setComida(Boolean comida) {
        this.comida = comida;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoBusiness{");
        sb.append("codigo=").append(this.getCodigo());
        sb.append(", pasajero=").append(this.getPasajero()==null ? "X" :this.getPasajero().getDniPasaporte());
        sb.append(", precioBase=").append(this.CalcularPrecio());
        sb.append(", tipo=").append(tipo);
        sb.append(", comida=").append(comida);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double CalcularPrecio() {
        if (comida) {
            return this.precioBase*1.25 + 30;
        }
        return this.precioBase+1.25;
    }
}
