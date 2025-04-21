package Programacion.Tema7_Part1.Repaso.Ejercicio3;

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

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee> getMembres() {
        return membres;
    }

    public void setMembres(Set<Employee> membres) {
        this.membres = membres;
    }

    public Map<Employee, Set<Task>> getTasks() {
        return tasks;
    }

    public void setTasks(Map<Employee, Set<Task>> tasks) {
        this.tasks = tasks;
    }
    public boolean addTeamMember(Employee emp){
        if (!this.membres.contains(emp)) {
            this.membres.add(emp);
            this.tasks.put(emp, new HashSet<>());
            return true;
        }else {
            return false;
        }
    }
    public boolean assignTask(Employee emp, Task task){
        if (this.membres.contains(emp)) {
            this.tasks.get(emp).add(task);
            return true;
        }
        return false;
    }
    public void showInfoProject(){
        for (Employee emp : this.membres) {
            System.out.println("Empleado: " +emp);
            for (Task t : this.tasks.get(emp)){
                System.out.println(t);
            }
            System.out.println("-----------------");
        }
    }
}
