package Programacion.Tema7_Part1.EjerciciosRepaso.HashMapHashSet;

import java.util.*;

public class Project {
    private String id;
    private String name;
    private Set<Employee> membres;
    private Map<Employee,Set<Task>> tasks;

    public Project(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.membres = new HashSet<>(5);
        this.tasks = new HashMap<>(5);

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Employee> getMembres() {
        return membres;
    }

    public Map<Employee, Set<Task>> getTasks() {
        return tasks;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Añadimos el empleado a los miembres del pr
     * @param e
     */
    public boolean addTeamMember(Employee e) {
        if (!this.membres.contains(e)) {
            this.membres.add(e);
            this.tasks.put(e, new HashSet<>());
            return true;

        }else {
            return false;
        }
    }

    /**
     * Si el empleado no esta en el proyecto return false
     * si el proyecto esta en el proyectos , obtenemos su lista de tareas
     * y añadirla una nueva
     * @param e
     * @param t
     * @return
     */
    public boolean assignTask(Employee e, Task t) {
        //comprobar que el empleado este en elproyectp
        if (!this.membres.contains(e)) {
            return false;
        }else {
            //sacar el set de tareas de ese empleado y añadirle la tarea
            tasks.get(e).add(t);
            return true;
        }
    }
    public void showInfoProject() {
        for (Employee e : membres) {
            System.out.println(e);
            System.out.println("-------------------");
            //Saco las tareas del empleado e

            for (Task t : tasks.get(e)) {
                System.out.println(t);
            }
            System.out.println("_____________________");
        }
    }
}
