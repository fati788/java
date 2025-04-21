package Programacion.Tema7_Part1.Colas;

import java.util.LinkedList;

public class Pila<E> {
    LinkedList<E>procesos;

    public Pila() {
        this.procesos = new LinkedList<>();
    }
    public void insertarProceso(E elemento) {
         this.procesos.push(elemento);
    }
    public E sacarProceso() {
        return this.procesos.pop();
    }
    public E mostrarProceso() {
        return this.procesos.peek();
    }

}
