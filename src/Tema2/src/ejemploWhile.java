import java.util.Scanner;

public class ejemploWhile {
    public static void main(String[] args) {



       /* int num = 1 ;
        while (num <= 10){
            num = num + 1 ;

        System.out.println(num);

            }
        num = 2 ;
        while (num <= 20){
            num+=2 ;
            System.out.println(num );
        }
        num = 10;
        while (num >=1){

            System.out.println(num);
            num -- ;
        }
        int num = 10 ;
        while (num <= 100){
            System.out.println(num);
            num += 10 ;
        }
        int num = 1 ;
        while (num <= 100){
            if (num % 10 == 0){
                System.out.println(num);
            }
            num++;
        }
             // del 1 al 200 muestra los num impares que no sean multiplos 7
        int num = 1 ;
        while (num <= 200){
            if ( (num % 7 != 0 ) &&  (num % 2 !=0)){
                System.out.println(num);
            }
            num++;
        }
        // pida por declado un contrasena mientras sea menor de 8 caracteres
        // password.length()-----> devuelve la longitud del string password
        String password = "1234567";
        Scanner sc = new Scanner(System.in);


        while (password.length()< 8){
            System.out.println("Dime l acontraseña");
            password = sc . nextLine();
        }
        System.out.println("Tu contraseña valida es : " +password);*/
        // PIDA POR TECLADO una contraseña mientras la longitud sea menoe de 10n caracteres
        // y tenga al menioa uma letra mayusquela
        // password.toUpperCase() pasa la cadena mayusquela
        // password .toLowerCase() pasa al maniscula
        String password = "hola";
        Scanner sc = new Scanner(System.in);
        //Mientras pass igual passMinuscula  Y  pass menor 10
        while ( (password.equals(password.toLowerCase()) ) || (password.length() < 10) ) {
            System.out.println("Introduce contraseña:");
            password = sc.nextLine(); //Lo que nos acerca a que se cumpla es pedir por teclado
        }
        System.out.println("Tu contraseña válida es " + password);



    }
}
