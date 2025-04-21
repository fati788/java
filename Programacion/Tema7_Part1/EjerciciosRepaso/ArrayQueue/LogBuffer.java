package Programacion.Tema7_Part1.EjerciciosRepaso.ArrayQueue;

import java.util.ArrayDeque;

/**
 * vamos guardarmos mensajes de log en la baffer
 * cuandi superamos a la capacidad , borrar el primer log que ae inserto
 * asi siempre tenemos un buffer de tamaño elligido con los ultimos logs
 */
public class LogBuffer {
    private ArrayDeque<String> logs; //igual que LinkedList
    private Integer capacity;

    public LogBuffer(Integer capacity) {
        this.logs = new ArrayDeque<>();
        this.capacity = capacity;
    }
    public Integer getCapacity() {
        return this.capacity;
    }
    public Integer getLogSize() {
        return this.logs.size(); //Tamaño actual de buffer
    }

    /**
     * si el tamaño actual es menor que la capacidad se añade el log
     * si el tamaño actual igual a la capacidad se borra el log antiguo u se añade el nuevo
     * @param log
     */
    public void  addLog(String log) {
        if (this.capacity > this.getLogSize() ) {
            this.logs.add(log);
        }else {
            this.logs.removeFirst();
            this.logs.add(log);

        }
    }
    public void  showLogs(){
        for (String log : this.logs) {
            System.out.println(log); //Array
        }
    }

}
