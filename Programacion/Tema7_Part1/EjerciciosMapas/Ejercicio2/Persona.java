package Programacion.Tema7_Part1.EjerciciosMapas.Ejercicio2;

public class Persona  {
    /*Vamos a realizar un ejemplo para guardar los hobbies de personas.
     Cada persona tendrá un nombre y una edad. La estructura para guardar los hobbies sería un TreeMap<Persona, List<String>>,
      donde se ordenarías las personas por edad. Añade datos y muéstralos. Añadir métodos addPersona,
       addHobbie(Persona, String), listarTodos().*/
    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

}
