package Programacion.Tema7_Part1.EjerciciosRepaso.PriorityQueue;

public class Test {
    public static void main(String[] args) {

        PendingTasks pt = new PendingTasks();
        pt.addTask(new Task(5,"EStudiar programacion"));
        pt.addTask(new Task(1,"EStudiar programacion"));
        pt.addTask(new Task(2,"ver susper"));
        pt.addTask(new Task(3,"Hacer compras "));
        pt.addTask(new Task(3,"Salir con amigos"));
        pt.addTask(new Task(4,"Salir"));
        System.out.println(pt.viewHighrPriorityTask());

        System.out.println("++++++++++++++Pintar Tareas +++++++++++++++++++++++++++++++++++++++++");
        pt.showPendingTasks();
        System.out.println("+++++++++++++++++++++++Elimiar Tarea++++++++++++++++++++++++++++++++");
        while (true){
            Task t = pt.pollhigherriorityTask();

            if (t == null){ //vacia
                break;
            }
            System.out.println(t);
        }



    }
}
