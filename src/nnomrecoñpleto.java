import java.util.Scanner;

public class nnomrecoñpleto {
    public static void main(String[] args) {

        String nombre, apellido1  , apellido2  ;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Dime tu primero apellido ");
        apellido1 = sc.nextLine() ;
        System.out.println(" Tu primero apellido es " + apellido1);

        System.out.println("Dime tu segundo apellido");
        apellido2 = sc.nextLine() ;
        System.out.println("Tu segundo apellido es :" + apellido2);

        System.out.println("Dime tu nombre");
        nombre = sc.nextLine();
        System.out.println("Tu nombre es :" + nombre);


        System.out.println("Tu nombre completo es : " + apellido1+" "+ apellido2+","+nombre);
        sc.close();





    }

}
