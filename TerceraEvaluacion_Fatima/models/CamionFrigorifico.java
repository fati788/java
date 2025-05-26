package TerceraEvaluacion_Fatima.models;

public class CamionFrigorifico extends  Camion{

    private Double temperaturaObjetivo;

    public CamionFrigorifico(String matricula, String empresaTransportista, String tipoMertcancia, Double pesoEstimado , Double temperaturaObjetivo) {
        super(matricula, empresaTransportista, tipoMertcancia, pesoEstimado);
        this.temperaturaObjetivo = temperaturaObjetivo;
    }

    public Double getTemperaturaObjetivo() {
        return temperaturaObjetivo;
    }

    public void setTemperaturaObjetivo(Double temperaturaObjetivo) {
        this.temperaturaObjetivo = temperaturaObjetivo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CamionFrigorifico{");
        sb.append("matricula='").append(matricula).append('\'');
        sb.append(", empresaTransportista='").append(empresaTransportista).append('\'');
        sb.append(", tipoMertcancia='").append(tipoMertcancia).append('\'');
        sb.append(", pesoEstimado=").append(pesoEstimado);
        sb.append(", temperaturaObjetivo=").append(temperaturaObjetivo);
        sb.append('}');
        return sb.toString();
    }
}
