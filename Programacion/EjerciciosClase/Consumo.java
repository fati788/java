package Programacion.EjerciciosClase;

public class Consumo {
    private Double kms;
    private Double litros;
    private Double vmed;
    private Double precio;
    private Integer tiempo;

    public Consumo(Double kms, Double litros, Double vmed, Double precio) {

        this.kms = kms;
        this.litros = litros;
        this.vmed = vmed;
        this.precio = precio;
        this.tiempo = 35;
    }

    public Integer getTiempo() {
        return tiempo;
    }
    public Double ConsumoMedio(){
        return (litros/kms)*100;


    }
    public Double consumoEuros(){
        return ((litros*precio)/kms)*100;
    }

    public void setKms(Double kms) {
        this.kms = kms;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public void setVmed(Double vmed) {
        this.vmed = vmed;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Consumo{");
        sb.append("kms=").append(kms);
        sb.append(", litros=").append(litros);
        sb.append(", vmed=").append(vmed);
        sb.append(", precio=").append(precio);
        sb.append(", tiempo=").append(tiempo);
        sb.append('}');
        return sb.toString();
    }
}
