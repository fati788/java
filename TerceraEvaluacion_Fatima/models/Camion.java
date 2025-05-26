package TerceraEvaluacion_Fatima.models;

public abstract class Camion {

    protected String matricula;
    protected String empresaTransportista;
    protected String tipoMertcancia;
    protected Double pesoEstimado;

    public Camion(String matricula, String empresaTransportista, String tipoMertcancia, Double pesoEstimado) {
        this.matricula = matricula;
        this.empresaTransportista = empresaTransportista;
        this.tipoMertcancia = tipoMertcancia;
        this.pesoEstimado = pesoEstimado;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmpresaTransportista() {
        return empresaTransportista;
    }

    public void setEmpresaTransportista(String empresaTransportista) {
        this.empresaTransportista = empresaTransportista;
    }

    public String getTipoMertcancia() {
        return tipoMertcancia;
    }

    public void setTipoMertcancia(String tipoMertcancia) {
        this.tipoMertcancia = tipoMertcancia;
    }

    public Double getPesoEstimado() {
        return pesoEstimado;
    }

    public void setPesoEstimado(Double pesoEstimado) {
        this.pesoEstimado = pesoEstimado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Camion{");
        sb.append("matricula='").append(matricula).append('\'');
        sb.append(", empresaTransportista='").append(empresaTransportista).append('\'');
        sb.append(", tipoMertcancia='").append(tipoMertcancia).append('\'');
        sb.append(", pesoEstimado=").append(pesoEstimado);
        sb.append('}');
        return sb.toString();
    }
}
