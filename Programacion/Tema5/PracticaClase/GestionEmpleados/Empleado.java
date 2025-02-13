package Programacion.Tema5.PracticaClase.GestionEmpleados;

public abstract class Empleado {
    //no se puede crear objetos de esa clase.
    protected String nombre;
    protected Integer edad;
    protected Double sualario;
    protected static final Integer PLUS=300;

    public Empleado(String nombre, Integer edad, Double sualario) {
        this.nombre = nombre;
        this.edad = edad;
        this.sualario = sualario;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getSualario() {
        if (this.aplicaPLUS()){
            return this.getSualario()+Empleado.PLUS;
        }else return this.getSualario();

    }

    public void setSualario(Double sualario) {
        this.sualario = sualario;
    }

    /**
     * se aplica o no el plus al salario del empleado
     * el codigo esta en los clases hijas
     * * @return
     */
    public abstract boolean aplicaPLUS();

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empleado{");
        sb.append(super.toString());
        sb.append(", sualario=").append(sualario);
        sb.append('}');
        return sb.toString();
    }
}
