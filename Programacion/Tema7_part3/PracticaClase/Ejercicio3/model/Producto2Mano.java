package Programacion.Tema7_part3.PracticaClase.Ejercicio3.model;

import java.util.Objects;

public class Producto2Mano {
    private Integer id;
    private String nombre;
    private String descripcion;
   private Categoria categoria;
   private Estado estado;
   private Boolean envio;
   private Double precio;
   private Usuario usuario;

    public Producto2Mano(Integer id, String nombre, String descripcion, Categoria categoria, Estado estado, Boolean envio, Double precio, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.envio = envio;
        this.precio = precio;
        this.usuario = usuario;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Boolean getEnvio() {
        return envio;
    }

    public void setEnvio(Boolean envio) {
        this.envio = envio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto2Mano{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append(", estado=").append(estado);
        sb.append(", envio=").append(envio);
        sb.append(", precio=").append(precio);
        sb.append(", usuario=").append(usuario);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto2Mano that = (Producto2Mano) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
