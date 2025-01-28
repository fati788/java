package Programacion.Practica1OPP.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Mago {

    private String nombre;
    private Integer EnergiaMagica ; //(del 0 al 100)
    private List<Hechizo> hechizos;

    public Mago(String nombre, Integer energiaMagica) {
        this.nombre = nombre;
        EnergiaMagica = energiaMagica;
        this.hechizos = new ArrayList<Hechizo>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEnergiaMagica() {
        return EnergiaMagica;
    }

    public void setEnergiaMagica(Integer energiaMagica) {
        EnergiaMagica = energiaMagica;
    }

    public List<Hechizo> getHechizos() {
        return hechizos;
    }

    public void setHechizos(List<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mago{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", EnergiaMagica=").append(EnergiaMagica);
        sb.append(", hechizos=").append(hechizos);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Añadir el hechizo passado como parametro al lista del hechisos .
     * @param hechizo
     */

    public void aprenderHechizo(Hechizo hechizo){
        this.hechizos.add(hechizo);
    }

    /**
     * El metodo primero busca que el mago tenga un Hechizo con el mismo nombre
     * que se le pasa scomo String . Si no lo tiene duevelve false y acaba .
     * Si el mago si tiene ese Hechizo compprueba (esEfectivo) que puede suiperar al prueba .
     * Si el Hechizo es efectivo suma le recompensa de la prueba ala energia del mago
     * y devuelve true
     * Si no devuelve false y aplica una perdida de energia (la dificultad de la prueba ).
     * @param nombreHechizo
     * @param prueba
     * @return
     */
    public boolean lanzarHechizo(String nombreHechizo , Prueba prueba){
        Hechizo miHechizo = this.buscar(nombreHechizo);
        if (miHechizo == null){
            return false;
        }else {
            //coprobarsi el mgo
            if (!(this.getEnergiaMagica()>= miHechizo.getEnergiaNecessaria())) {
                return false;
            }else {
                if (!miHechizo.esEfectivo(prueba)){
                    this.setEnergiaMagica(this.getEnergiaMagica() - prueba.getRecompensa());
                    return false;

                }else {
                    this.recargarEnergia(this.getEnergiaMagica()+ prueba.getRecompensa());
                    return true;
                }



            }


        }

    }
   /* public void lanzarHechizo2(String nombreHechizo , Prueba prueba) throws Exception{
        Hechizo miHechizo = this.buscar(nombreHechizo);
        if (miHechizo == null){
            throw new Exception("Hechizo no encontrado");
        }else {
            //coprobarsi el mgo
            if (!(this.getEnergiaMagica()>= miHechizo.getEnergiaNecessaria())) {
            sout(""el mago no tiene energia para lanzar hechizo )

            }else {
                if (!miHechizo.esEfectivo(prueba)){
                    this.setEnergiaMagica(this.getEnergiaMagica() - prueba.getRecompensa());
                    throw new Exception("Hechizo no efectivo");


                }else {
                    this.recargarEnergia(this.getEnergiaMagica()+ prueba.getRecompensa());


                }



            }


        }

    }*/
   /* public boolean lanzarHechizo(String nombreHechizo , Prueba prueba){
        Hechizo miHechizo = this.buscar(nombreHechizo);

        if (miHechizo == null ){
            return false;
        }else {
            if (!miHechizo.esEfectivo(prueba)){
                this.setEnergiaMagica(this.getEnergiaMagica() - prueba.getRecompensa());
                return false;
            }else {
                this.setEnergiaMagica(this.getEnergiaMagica() + prueba.getRecompensa());
                return true ;
            }
        }
    }*/
    public Hechizo buscar (String nombreHechizo){
        for(Hechizo hechizo : hechizos){
            if (hechizo.getNombre().equalsIgnoreCase(nombreHechizo)){
                return hechizo;

            }
        }
        return null;
    }

    /**
     * Suma
     * @param cantidad
     */
    public void recargarEnergia(int cantidad){

        if (this.EnergiaMagica +cantidad >=100){

         this.setEnergiaMagica(100);
        }else {
            //this.getEnergiaMagica()+=cantidad;
            //this.setEnergiaMagica(this.getEnergiaMagica()+cantidad);
        }
    }
}
