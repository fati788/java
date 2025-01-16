package Programacion.Tema4;

public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private Double largo;
    private Double ancho;
    private Double altuo;

    public Coche(String marca, String modelo, String color, Double largo, Double ancho, Double altuo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
        this.altuo = altuo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAltuo() {
        return altuo;
    }

    public void setAltuo(Double altuo) {
        this.altuo = altuo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("coche{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", largo=").append(largo);
        sb.append(", ancho=").append(ancho);
        sb.append(", altuo=").append(altuo);
        sb.append('}');
        return sb.toString();
    }
}
