package Programacion.Tema5.EjemploExpidiente;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Expidiente {


    enum Modalidad{FPB , FPMEDIO , FPSUPERIOR};

    private  static int numExpidientes=0;

    private final Integer id = Expidiente.numExpidientes+10000;
    private String nombre;
    private String apellidos;
    private Character sexo;
    private Modalidad modalidad ;
    private LocalDate fechaNacimiento;
    private Integer curso;
    private List<NotasCurso> calificador;

    public Expidiente(String nombre, String apellidos, Character sexo, Modalidad modalidad, LocalDate fechaNacimiento, Integer curso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.modalidad = modalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.curso = curso;
        this.calificador = new ArrayList<>();
        Expidiente.numExpidientes++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public List<NotasCurso> getCalificador() {
        return calificador;
    }

    public void setCalificador(List<NotasCurso> calificador) {
        this.calificador = calificador;
    }

    public Integer getId() {
        return id;
    }

    public static int getNumExpidientes() {
        return numExpidientes;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Expidiente{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", sexo=").append(sexo);
        sb.append(", modalidad=").append(modalidad);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", curso=").append(curso);
        sb.append(", calificador=").append(calificador);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Expidiente that = (Expidiente) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /**
     * añade una nueva calificacion  a la calificaciones
     * @param nc
     */
    public void add(NotasCurso nc){
        this.calificador.add(nc);
    }

    /**
     * Añade varias calificaciones a la calificaciones de un expidiente
     * @param notas
     */
    public void addNotas(List<NotasCurso> notas){
        this.calificador.addAll(notas);
    }

    /**
     * Si es de fpb puede tener dos sudpensos
     * sino tiene que tenerlo qprobqdo todo para titular
     * @return
     */
    public boolean titula(){

        Integer numSuspensos=getNumSuspensos();
        if (this.modalidad == Modalidad.FPB){
            if (numSuspensos>2){
                return false;
            }else {
                return true;
            }

        }else {
            if (numSuspensos!=0){
                return false;
            }else {
                return true;
            }

        }

    }
    private Integer getNumSuspensos(){
        Integer numSuspensos=0;
        for (NotasCurso nc : this.calificador) {
            if (nc.getNotaFinal()<5){
                numSuspensos++;
            }
        }
      /*  for (int i=0; i<this.calificador.size(); i++){
            NotasCurso nc = this.calificador.get(i);

        }*/
        return numSuspensos;

    }

    /**
     * suma l anuta final de cada nota curso de la calificaciones
     * y lo divize entre el total d calificaciones
     * @return
     */
    public Double getMediaExpidiente(){
        Double media=0.0;
        for (NotasCurso nc : this.calificador) {
            media+=nc.getNotaFinal();
        }
        return media/this.calificador.size();
    }

    /**
     * calcule la edad desde fecha_nac
     * @return
     */
    public Integer getEdad(){
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(this.fechaNacimiento, fechaActual);
        return periodo.getYears();

    }

    /**
     * si la edad es mayor que 18 duevelve true , sino false
     * @return
     */
    public boolean EsMayorEdad(){
        return  this.getEdad()>=18;
    }



}
