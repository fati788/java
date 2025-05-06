package Programacion.Tema7_part3.PracticaClase.Ejercicio4.models;

import java.util.Objects;
import java.util.UUID;

public class Material {
    private String id;
    private String name;
    private String description;
    private Estado estado;
    private Tipo tipo;
   private Departamento departamento;
   private Localizacion localizacion;

    public Material(String id, String name, String description, Estado estado, Tipo tipo, Departamento departamento, Localizacion localizacion) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.estado = estado;
        this.tipo = tipo;
        this.departamento = departamento;
        this.localizacion = localizacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Material{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", tipo=").append(tipo);
        sb.append(", departamento=").append(departamento);
        sb.append(", localizacion=").append(localizacion.getNombre());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return Objects.equals(id, material.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
