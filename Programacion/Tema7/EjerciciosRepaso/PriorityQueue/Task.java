package Programacion.Tema7.EjerciciosRepaso.PriorityQueue;

public class Task {
    private Integer priority; //numero low perioridad mas alta
    private String description;

    public Task(Integer priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Task{");
        sb.append("priority=").append(priority);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
