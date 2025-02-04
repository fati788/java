package Programacion.Tema5.PracticaClase;

public class TestPasswordC {
    public static void main(String[] args) {

        PasswordClase password = new PasswordClase(10);
        System.out.println(password);
        System.out.println(password.esFuerte());
    }
}
