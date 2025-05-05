package Programacion.Tema7_part2.Pactica_2.SensoresPlantacion;

import java.time.LocalDateTime;

public class Registro {

  private LocalDateTime fachaHora;
  private Double temperatura;
  private Double humedad;

    public Registro(LocalDateTime fachaHora, Double temperatura, Double humedad) {
        this.fachaHora = fachaHora;
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    public LocalDateTime getFachaHora() {
        return fachaHora;
    }

    public void setFachaHora(LocalDateTime fachaHora) {
        this.fachaHora = fachaHora;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getHumedad() {
        return humedad;
    }

    public void setHumedad(Double humedad) {
        this.humedad = humedad;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Registro{");
        sb.append("fachaHora=").append(fachaHora);
        sb.append(", temperatura=").append(temperatura);
        sb.append(", humedad=").append(humedad);
        sb.append('}');
        return sb.toString();
    }
}
