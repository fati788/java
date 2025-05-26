package TerceraEvaluacion_Fatima.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class ReservarMuelle {

    private Integer id;
    private Camion camion;
    private Muelle muelle;
    private LocalDateTime llegada;
    private LocalDateTime salida;

    public ReservarMuelle(Integer id, Camion camion, Muelle muelle, LocalDateTime llegada) {
        this.id = id;
        this.camion = camion;
        this.muelle = muelle;
        this.llegada = llegada;
        this.salida = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    public Muelle getMuelle() {
        return muelle;
    }

    public void setMuelle(Muelle muelle) {
        this.muelle = muelle;
    }

    public LocalDateTime getLlegada() {
        return llegada;
    }

    public void setLlegada(LocalDateTime llegada) {
        this.llegada = llegada;
    }

    public LocalDateTime getSalida() {
        return salida;
    }

    public void setSalida(LocalDateTime salida) {
        this.salida = salida;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ReservarMuelle{");
        sb.append("id=").append(id);
        sb.append(", camion=").append(camion);
        sb.append(", muelle=").append(muelle);
        sb.append(", llegada=").append(llegada);
        sb.append(", salida=").append(salida);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ReservarMuelle that = (ReservarMuelle) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /**
     * registrar salida que recibe el hora de salida
     * y llamar al liberrar molle() --> ya el molle esta libre
     * @param hora
     */
    public void  registrarSalida(LocalDateTime hora){
        this.setSalida(hora);
        muelle.liberarMuelle();
    }
}
