package Programacion.Tema5.PracticaClase;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {

    private String nombre ;
    private Integer edad ;
    private  String dni;
    private Character sexo;
    private Double peso;
    private Double altura;

    public Persona() {
        this.nombre ="";
        this.edad =0;
        this.dni ="";
        this.sexo ='H';
        this.peso =0.0;
        this.altura =0.0;
    }

    public Persona(String nombre, Integer edad, String dni, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso =0.0;
        this.altura =0.0;
    }

    public Persona(String nombre, Integer edad, String dni, Character sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public Persona(Persona otro){
        this.nombre = otro.nombre;
        this.edad = otro.edad;
        this.dni = otro.dni;
        this.sexo = otro.sexo;
        this.peso = otro.peso;
        this.altura = otro.altura;
    }
    public Integer calcularMC(){
        Double Mc = (this.peso/this.altura*this.altura);

        if (Mc<20){
            System.out.println("La persona esta en su peso ideal");
            return 1;

        }else if (Mc>20 && Mc<=25){
            System.out.println("la persona esta por debajo de su peso ");
            return 0;

        }else if (Mc>25){
            System.out.println("La persona tiene sobrePeso");
            return -1;
        }
        return null;
    }
   public boolean esMayorEdad(){
        if (this.edad>=18){
            return true;
        }else {
            return false;
        }
   }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", sexo=").append(sexo);
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
