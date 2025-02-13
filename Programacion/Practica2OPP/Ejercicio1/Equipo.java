package Programacion.Practica2OPP.Ejercicio1;

import java.util.ArrayList;

public class Equipo {

        private String nombre;
        private String pais;
        private static Integer SumaTimpos;
        private ArrayList<Ciclista> ciclistas;


    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.SumaTimpos=0;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Ciclista> getCiclistas() {
        return ciclistas;
    }

    public void setCiclistas(ArrayList<Ciclista> ciclistas) {
        this.ciclistas = ciclistas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Equipo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", ciclistas=").append(ciclistas);
        sb.append('}');
        return sb.toString();
    }

    /**
     * metodo para imprimir los datos del equipo
     */
    protected void imprimir() {
        System.out.println("*************Datos del equipo**************");
        System.out.println("Nombre : " + this.nombre);
        System.out.println("Pais : " + this.pais);
        System.out.println("Ciclistas : " + this.ciclistas);
        System.out.println("********************************************");
    }

    /**
     * metodo para añadir un ciclista al equipo
     * @param cic
     */
    protected void addCiclista(Ciclista cic) {
        this.ciclistas.add(cic);
        SumaTimpos +=cic.getTiempoAcumulado();

    }

    /**
     * metolo para calcular el tiempo acumulado para todas las ciclistas
     */
    protected void CalcularTiempoCiclistas() {
        System.out.println("El tiempo acumulado es: " + SumaTimpos);

    }

    /**
     * metodo para listar los nombres del ciclistas del equipo
     */
    public void listarNombres(){
        System.out.println("**************************************************");
        if (this.ciclistas.size() ==0){
            System.out.println("Equipo vacio");
        }else {
            for (Ciclista cic: ciclistas) {
                System.out.println(cic.getNombre());
            }
        }
        System.out.println("*****************************************************");
    }

    /**
     * metodo par buscar un ciclista desde el identificador
     * @param identificador
     * @return
     */
    public Ciclista buscarCiclista(Integer identificador) {
       for (Ciclista cic: ciclistas) {
           if (cic.getIdentificador().equals(identificador)) {
               return cic;
           }
       }
        return null;
    }

}
