package Programacion.Tema7.Ejercicios.Ejercicio1;

import java.util.Comparator;
import java.util.TreeSet;

public class Diccionario {
    private TreeSet<Entrada>entradas;
    public Diccionario() {
        entradas = new TreeSet<>(Comparator.comparing(Entrada::getPalabra));
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
    public void addEntrada(Entrada entrada) {
        this.entradas.add(entrada);
    }
    public void removeEntrada(Entrada entrada) {
        this.entradas.remove(entrada);
    }
    public void listarPalabras() {
        for (Entrada entrada : entradas) {
            System.out.println(entrada);
        }
    }
    public String buscarEntrada(String palabra) {
        for (Entrada entrada : entradas) {
            if (entrada.getPalabra().equalsIgnoreCase(palabra)) {
               return entrada.getTraduccionES();
            }
        }
        return null;
    }

}
