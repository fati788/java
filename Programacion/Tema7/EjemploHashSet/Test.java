package Programacion.Tema7.EjemploHashSet;

public class Test {
    public static void main(String[] args) {


        Aula aula = new Aula("Aula1" , "Cuevas");
        Alumno al1 = new Alumno("al1","perez","al1@gmail.com",25,"vera","Q12346Z");
        Alumno al2 = new Alumno("al2","perez","al2@gmail.com",20,"vera","M12346L");
        Alumno al3 = new Alumno("al3","perez","al3@gmail.com",18,"vera","R12346V");
        Alumno al4 = new Alumno("al4","perez","al4@gmail.com",22,"vera","W12346X");
        Alumno al5 = new Alumno("al5","perez","al5@gmail.com",23,"vera","E12346K");
        aula.addAlumno(al1);
        aula.addAlumno(al2);
        aula.addAlumno(al3);
        aula.addAlumno(al4);
        aula.addAlumno(al5);

        Alumno al6 = new Alumno("al1","perez","al1@gmail.com",25,"vera","Q12346Z");
       aula.addAlumno(al6);
        System.out.println("-----------Resultados del aula----------");
       aula.listarAlumnos();

       AulaNueva aulaNueva = new AulaNueva("aulaNueva" , "Cuevas");
       aulaNueva.addAlumno(al1);
        aulaNueva.addAlumno(al2);
        aulaNueva.addAlumno(al3);
        aulaNueva.addAlumno(al4);
        aulaNueva.addAlumno(al5);
     //  aulaNueva.listarAlumnos();
       aulaNueva.addAlumno(al6);
        System.out.println("-----------Resultados del aula Nueva----------");
       aulaNueva.listarAlumnos();


       /* 6.¿Muestra en el mismo orden listarTodos en Aula que en AulaNueva? ¿Por qué?
       en el aula que usa el ArrayList son ordenadas
         no es el mismo porque en aula hay repitidos pero en aula nueva no hay repitidos
         entonces el ArrayList puedes agregar objetos repetidos
         pero en HashSet no ae agrega objetos repetidos (!!! TIENE UNA RELACIÓN CON EL EQUALS)
         */
        /*7. ¿Hay una manera de quitar repetidos de un ArrayList de forma fácil?

         */
    }
}
