package Programacion.Tema7_part3.Prepa_2;

import java.util.Objects;

public class Finca {

    private  Integer id;
    private String nombre;
    private Double longitud;
    private Double latitud;
    private Double superficiie;
    private String localidad;
    private String provincia;


    public Finca(Integer id, String nombre, Double longitud, Double latitud, Double superficiie, String localidad, String provincia) {
        this.id = id;
        this.nombre = nombre;
        this.longitud = longitud;
        this.latitud = latitud;
        this.superficiie = superficiie;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getSuperficiie() {
        return superficiie;
    }

    public void setSuperficiie(Double superficiie) {
        this.superficiie = superficiie;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Finca{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", longitud=").append(longitud);
        sb.append(", latitud=").append(latitud);
        sb.append(", superficiie=").append(superficiie);
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", provincia='").append(provincia).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Finca finca = (Finca) o;
        return Objects.equals(id, finca.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
