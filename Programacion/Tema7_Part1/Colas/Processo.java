package Programacion.Tema7_Part1.Colas;

public class Processo {
    private Integer pid;
    private String name;
    private String path;
    private Integer priority;

    public Processo(Integer pid, String name, String path, Integer priority) {
        this.pid = pid;
        this.name = name;
        this.path = path;
        this.priority = priority;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Proceso{");
        sb.append("pid=").append(pid);
        sb.append(", name='").append(name).append('\'');
        sb.append(", path='").append(path).append('\'');
        sb.append(", priority=").append(priority);
        sb.append('}');
        return sb.toString();
    }
}
