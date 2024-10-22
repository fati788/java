import java.util.Scanner;

public class ejemploMenuEScrito {
    public static void main(String[] args) {

        int opcion = -1 ;
        Scanner sc = new Scanner(System.in);



        while (opcion!= 5){
            System.out.println("1. Hacer una cosa");
            System.out.println("2. Hacer otra cosa");
            System.out.println("3. Hacer una cosa difirente ");
            System.out.println("4. Hacer lo que dijo el prof");
            System.out.println("5. salir");



            // leer por teclado opcion
            System.out.println("Introduce opcion elegida");

            opcion = Integer.parseInt(sc.nextLine());


            switch (opcion){
                case  1 :
                    System.out.println("Has elegido opcion 1");
                    break;
                case  2 :
                    System.out.println("Has elegido opcion 2");
                    break;
                case  3 :
                    System.out.println("Has elegido opcion 3");
                    break;
                case  4 :
                    System.out.println("Has elegido opcion 4");
                    break;
                case  5 :
                    System.out.println("adios , gracias por usar este programa ");
                    break;
                default:
                    System.out.println("Error , opcion incorrecta");
            }

        }
    }
}
