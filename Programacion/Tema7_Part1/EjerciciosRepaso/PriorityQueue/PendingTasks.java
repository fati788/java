package Programacion.Tema7_Part1.EjerciciosRepaso.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PendingTasks {
    private PriorityQueue<Task> tasks;

    public PendingTasks() {
        this.tasks = new PriorityQueue<>(Comparator.comparing(Task::getPriority));

    }

    /**
     * Add task to periority
     * @param task
     * @return
     */
    public boolean addTask(Task task) {
        return tasks.offer(task);
    }

    /**
     * Muestra l atarea con higher periority
     * @return
     */

    public Task viewHighrPriorityTask() {
        return tasks.peek();
    }

    /**
     * REMOVE and show higher piriority task
     * @return
     */
    public Task pollhigherriorityTask() {
        return tasks.poll();
    }
  public void showPendingTasks() {
        //No las muestra ordenadas por perioridad
        for (Task task : tasks) {
            System.out.println(task);
        }
  }



}
