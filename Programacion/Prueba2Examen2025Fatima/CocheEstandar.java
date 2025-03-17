package Programacion.Prueba2Examen2025Fatima;

public class CocheEstandar extends Coche {

    private Boolean aireAcondicionado;
    public CocheEstandar(Long id, String marca, String modelo, String matricula, Integer anio, TipoCombustible combustible, TipoCoches tipo, Double precioBase, Boolean aireAcondicionado) {
        super(id, marca, modelo, matricula, anio, combustible, tipo, precioBase);
        this.aireAcondicionado = aireAcondicionado;
    }

    public CocheEstandar(Long id, String marca, String modelo, String matricula, Integer anio, TipoCombustible combustible, TipoCoches tipo, Double precioBase) {
        super(id, marca, modelo, matricula, anio, combustible, tipo, precioBase);
    }

    public Boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(Boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CocheEstandar{");
        sb.append("id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", anio=").append(anio);
        sb.append(", combustible=").append(combustible);
        sb.append(", tipo=").append(tipo);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", disponible=").append(disponible);
        sb.append(", aireAcondicionado=").append(aireAcondicionado);
        sb.append('}');
        return sb.toString();
    }

    /**
     * devuelve el precio base por los dias
     * si tiene aire acondicionado le suma UN 5€ para cada dia
     * @param dias
     * @return
     */
    @Override
    public Double calcularPrecioAlquiler(int dias) {
        if (this.aireAcondicionado) {
            return (precioBase * dias) + dias*5;
        }else {

            return precioBase * dias;
        }
    }
}
