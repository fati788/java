package TerceraEvaluacion_Fatima.models;

public class Muelle {

    private Integer id;
    private String ubicacion;
    private Boolean ocupado;
    private  Camion camionAsignado;

    public Muelle(Integer id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.ocupado = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Camion getCamionAsignado() {
        return camionAsignado;
    }

    public void setCamionAsignado(Camion camionAsignado) {
        this.camionAsignado = camionAsignado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Muelle{");
        sb.append("id=").append(id);
        sb.append(", ubicacion='").append(ubicacion).append('\'');
        sb.append(", ocupado=").append(ocupado);
        sb.append(", camionAsignado=").append(camionAsignado);
        sb.append('}');
        return sb.toString();
    }

    /**
     * asignar un camion a una muelle
     * y hacer ocupado == true ya esta ocupado
     * @param c
     */
    public void asignarCamion(Camion c){
        this.setCamionAsignado(c);
        this.ocupado = true;

    }

    /**
     * Liberar un muelle --> asignar el camion a null
     * y ocupado = fale --> ya esta libre
     */
    public void  liberarMuelle(){
        this.setCamionAsignado(null);
        this.ocupado = false;
    }
}
