package Programacion.Tema3.String;
import java.text.DecimalFormat;
public class ejemplos {


        public static void main(String[] args) {

            String cadena = new String("Hola mundo");
            String cadena2 = "Hola mundo";

            System.out.println("Hola " + "Mundo");
            System.out.println((new String("Hola ") + (new String("Mundo"))));

            String mensaje = "Qué bonita es la programación";
            System.out.println(mensaje.length()); //Longitud de una cadena
            System.out.println(mensaje.startsWith("Qu"));
            System.out.println(mensaje.endsWith("ción"));
            System.out.println(mensaje.indexOf("es")); //Posición donde aparece "es" en la cadena
            System.out.println(mensaje.indexOf("ess")); //-1 si no lo encuentra

            String cad1 = "Pro";
            String cad2 = "fesor";

            String cad3 = cad1 + cad2;
            System.out.println(cad3);
            cad3 = cad1.concat(cad2); //Igual que + para cadenas
            System.out.println(cad3);

            String mensa = "En un lugar de la Mancha";
            //El primer índice de una cadena es 0
            System.out.println(mensa.substring(18));
            System.out.println(mensa.substring(6,11));

            int numero = 345;
            String numeroS = String.valueOf(numero); //Es la cadena con el caracter 3,
            // el 4 y el 5, no el número 345
            System.out.println(numeroS + ".");

            String numeroString = "127";
            int numeroInt = Integer.parseInt(numeroString); //Pasar un String a int
            numeroInt += 5;
            System.out.println(numeroInt);

            double precio = 129.9935D;
            System.out.printf("El precio es %.3f", precio);
            System.out.println();
            System.out.printf("El hora es %d y los minutos son %d", 17, 45);
            System.out.println();

            DecimalFormat df = new DecimalFormat("#.###");
            System.out.println(df.format(precio));

            double n1 = 334.51;
            double n2 = 3333.3437;
            System.out.println(df.format(n1 * n2));

            String c1 = "R1aBc";
            String c2 = "R1aBc";
            if (c1.equals(c2)) {
                System.out.println("Son iguales");
            }
            if (c1 == c2) {
                System.out.println("Son iguales");
            }

            //Cortar una cadena con un patrón
            String ip = "192#168#1#111";
            String[] trozos = ip.split("#");
            for(int i=0; i < trozos.length; i++){
                System.out.println(trozos[i]);
            }

        }
    }

