package Programacion.Practica1OPP.Ejercicio1;

public class Arma {
    enum Tipo { ESPADA , HACHA , BASTON , ARCO }
    private  String nombre;
    private Tipo tipo;
    private  Integer puntosD;
    private  Boolean dosManos ;

    public Arma(String nombre, Tipo tipo, Integer puntosD, Boolean dosManos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.puntosD = puntosD;
        this.dosManos = dosManos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Boolean getDosManos() {
        return dosManos;
    }

    public void setDosManos(Boolean dosManos) {
        this.dosManos = dosManos;
    }

    public Integer getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Integer puntosD) {
        this.puntosD = puntosD;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Arma{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", puntosD=").append(puntosD);
        sb.append(", dosManos=").append(dosManos);
        sb.append('}');
        return sb.toString();
    }
}
