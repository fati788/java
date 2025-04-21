package Programacion.Tema7_Part1.EjerciciosMapas.Ejercicio2;

public class Test {
    public static void main(String[] args) {
        Hobbie hobbies = new Hobbie();
        Persona p1 = new Persona("Fatima",19);
        hobbies.addPersona(p1);
        hobbies.addHobbie(p1,"Cocinar");
        hobbies.addHobbie(p1,"dormir");


        Persona p2 = new Persona("Hajar" , 12);
        hobbies.addPersona(p2);
        hobbies.addHobbie(p2,"football");
        hobbies.addHobbie(p2,"basketball");




        Persona p3 = new Persona("Juan" , 9);
        hobbies.addPersona(p3);
        hobbies.addHobbie(p3,"football");
        hobbies.addHobbie(p3,"handball");

        hobbies.listarTodo();
        System.out.println("----------------");
        hobbies.listarTodoV2();

    }
}
