package Programacion.Tema7_Part1.EjerciciosRepaso.HashMapHashSet;

public class Test {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"emp1","e1@empresa.es",Department.DIRECCION);
        Employee e2= new Employee(2,"emp2","e2@empresa.es",Department.DESARROLLO);
        Employee e3 = new Employee(3,"emp2","e3@empresa.es",Department.DESARROLLO);
        Employee e4 = new Employee(4,"emp4","e4@empresa.es",Department.DESARROLLO);

        Project pr1 = new Project("Pagina web d eventas de la empresa");
        pr1.addTeamMember(e1);
        pr1.addTeamMember(e2);
        pr1.addTeamMember(e3);
        pr1.addTeamMember(e4);

        Task t1 = new Task("Task1" );
        Task t2 = new Task("Task2" );
        Task t3 = new Task("Task3" );
        Task t4 = new Task("Task4" );
        Task t5 = new Task("Task5" );
        Task t6 = new Task("Task6" );
        Task t7 = new Task("Task7" );
        Task t8 = new Task("Task8" );

        pr1.assignTask(e1,t1);
        pr1.assignTask(e2,t2);
        pr1.assignTask(e3,t3);
        pr1.assignTask(e4,t4);
        pr1.assignTask(e1,t5);
        pr1.assignTask(e2,t6);
        pr1.assignTask(e3,t7);
        pr1.assignTask(e4,t8);

        pr1.showInfoProject();


    }
}
