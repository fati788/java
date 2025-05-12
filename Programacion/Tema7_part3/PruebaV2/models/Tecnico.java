package Programacion.Tema7_part3.PruebaV2.models;

public class Tecnico extends Persona {
    private Especiadad especiadad;
    private Integer valoracion;


    public Tecnico(Integer id, String nombre, String apellido, String email, String telefono , Especiadad especiadad , Integer valoracion) {
        super(id, nombre, apellido, email, telefono);
        this.especiadad = especiadad;
        this.valoracion = valoracion;
    }

    public Especiadad getEspeciadad() {

        return especiadad;
    }

    public void setEspeciadad(Especiadad especiadad) {
        this.especiadad = especiadad;
    }

    public Integer getValoracion() {
        return valoracion;
    }

    public void setValoracion(Integer valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tecnico{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", especiadad=").append(especiadad);
        sb.append(", valoracion=").append(valoracion);
        sb.append('}');
        return sb.toString();
    }
}
