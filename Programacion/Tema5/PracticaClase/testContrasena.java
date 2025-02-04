package Programacion.Tema5.PracticaClase;

public class testContrasena {
    public static void main(String[] args) {
        Password contasena1 = new Password();
        Password contrasena2 = new Password(15);

        System.out.println(contasena1);
        System.out.println(contrasena2);
        if (contasena1.esFuerte()){
            System.out.println(" la contrasena es fuerte");
        }else {
            System.out.println("la contrasena no es fuerte");
        }

        if (contrasena2.esFuerte()){
            System.out.println(" la contrasena es fuerte");
        }else {
            System.out.println("la contrasena no es fuerte");
        }
    }
}

