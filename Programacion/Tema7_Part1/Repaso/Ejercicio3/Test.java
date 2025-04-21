package Programacion.Tema7_Part1.Repaso.Ejercicio3;


public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("1","emp1","e1@empresa.es", Dapartment.DIRECCION);
        Employee e2 = new Employee("2","emp2","e2@empresa.es", Dapartment.DESARROLLO);
        Employee e3 = new Employee("3","emp3","e3@empresa.es", Dapartment.RRHH);
        Employee e = new Employee("4","emp4","e@empresa.es", Dapartment.MARKETING);

        Task t1 = new Task("Hacer pro");
            Task t2 = new Task("Hacer BBDD");
        Task t3 = new Task("Hacer SSII");
        Task t4 = new Task("Hacer EEDD");
        Task t5 = new Task("Hacer LLMMM");
        Task t6 = new Task("Hacer IPE");
        Task t7 = new Task("Hacer SSS");


        Project p = new Project("Project fatima");
        p.addTeamMember(e);
        p.addTeamMember(e2);
        p.addTeamMember(e3);
        p.addTeamMember(e1);

        p.assignTask(e,t1);
        p.assignTask(e,t2);
        p.assignTask(e1,t3);
        p.assignTask(e1,t4);
        p.assignTask(e2,t5);
        p.assignTask(e2,t6);
        p.assignTask(e3,t7);
        p.assignTask(e3,t1);
        p.assignTask(e,t4);
        p.assignTask(e1,t5);

        p.showInfoProject();


    }
}
