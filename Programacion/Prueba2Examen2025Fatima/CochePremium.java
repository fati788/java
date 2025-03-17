package Programacion.Prueba2Examen2025Fatima;

public class CochePremium extends Coche {

    private Boolean gps;
    private Boolean seguroExtra;

    public CochePremium(Long id, String marca, String modelo, String matricula, Integer anio, TipoCombustible combustible, TipoCoches tipo, Double precioBase,Boolean gps, Boolean seguroExtra) {
        super(id, marca, modelo, matricula, anio, combustible, tipo, precioBase);
        this.gps = gps;
        this.seguroExtra = seguroExtra;
    }

    public CochePremium(Long id, String marca, String modelo, String matricula, Integer anio, TipoCombustible combustible, TipoCoches tipo, Double precioBase) {
        super(id, marca, modelo, matricula, anio, combustible, tipo, precioBase);
    }

    public Boolean getGps() {
        return gps;
    }

    public void setGps(Boolean gps) {
        this.gps = gps;
    }

    public Boolean getSeguroExtra() {
        return seguroExtra;
    }

    public void setSeguroExtra(Boolean seguroExtra) {
        this.seguroExtra = seguroExtra;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CochePremium{");
        sb.append("id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", anio=").append(anio);
        sb.append(", combustible=").append(combustible);
        sb.append(", tipo=").append(tipo);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", disponible=").append(disponible);
        sb.append(", gps=").append(gps);
        sb.append(", seguroExtra=").append(seguroExtra);
        sb.append('}');
        return sb.toString();
    }

    /**
     * devuelve el precio del alquiler imcrementado un 20% porque esta
     * de tipo premium
     * y se suma un 10€ si tiene gps
     * y se suma un 15€ si tiene seguro
     * @param dias
     * @return
     */

    @Override
    public Double calcularPrecioAlquiler(int dias) {
        double precioAlq = (precioBase *1.2)*dias;
        if (this.gps && this.seguroExtra) {
            return precioAlq+(dias*10)+precioAlq +(dias*15);
        }
        if(this.gps && !this.seguroExtra) {
            return precioAlq+(dias*10);
        }
        if (this.seguroExtra && !this.gps) {
            return precioAlq +(dias*15);
        }
            return precioAlq;

    }
}
