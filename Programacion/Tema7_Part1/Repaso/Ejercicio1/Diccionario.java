package Programacion.Tema7_Part1.Repaso.Ejercicio1;

import java.util.Comparator;
import java.util.TreeSet;

public class Diccionario {

    private TreeSet<Entrada>entradas;

    public Diccionario() {
      /*  this.entradas = new TreeSe t<>(new Comparator<Entrada>() {


            @Override
            public int compare(Entrada o1, Entrada o2) {
               return o1.getPalabra().compareTo(o2.getPalabra());
            }
        });
      */
        this.entradas = new TreeSet<>(Comparator.comparing(Entrada::getPalabra));
    }

    public TreeSet<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(TreeSet<Entrada> entradas) {
        this.entradas = entradas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Diccionario{");
        sb.append("entradas=").append(entradas);
        sb.append('}');
        return sb.toString();
    }
    public void addEntrada(Entrada e){
        this.entradas.add(e);
    }
    public void removeEntrada(Entrada e){
        this.entradas.remove(e);
    }
    public void listarPalabras(){
        for(Entrada e: entradas){
            System.out.println(e.getPalabra() + " --> " + e.getPalabraTraduccion());

        }
    }
    public String buscarEntrada(String palabra){
        for(Entrada e: entradas){
            if(e.getPalabra().equalsIgnoreCase(palabra)){
                return e.getPalabraTraduccion();
            }
        }
        return null;
    }

}
