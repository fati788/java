package Programacion.Tema7_Part1.Colas;

import java.util.LinkedList;

public class Cola<E> {
    LinkedList<E> processos;

    public Cola() {
        this.processos = new LinkedList<>();
    }
    public boolean insertarElemento(E elemento) {
        return this.processos.add(elemento);
    }
    public E sacarElemento() {
        return this.processos.poll();
    }
    public E mostrarElemento() {
        return this.processos.peek();
    }
}
