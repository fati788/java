package Programacion.Tema3.String;

public class EjemploStringBuffer {

        public static void main(String[] args) {

            //String son objetos no mutables -> no puede cambiar,
            //se crea un objeto al asignar
            String cadena = "Hola"; //obj1
            cadena = "mundo"; //obj2
            cadena = "pepe"; //obj3 - new String("");

            System.out.println(cadena);
            System.out.println(cadena.charAt(2));

            //Lo que vamos a usar cuando cambie un String es la clase StringBuffer
            StringBuffer sb = new StringBuffer();
            sb.append("Hola");
            sb.append("Hola Mundo"); //Concatenar cadenas sin crear objetos nuevos

            //Modificar un caracter en concreto
            sb.setCharAt(0, 'h');

            //Insertar una cadena en una posición
            sb.insert(4, " Mundo ");
            System.out.println(sb);

            //Quitar un caracter
            sb.deleteCharAt(0);
            System.out.println(sb);

            //Quitar una cadena
            sb.delete(3,8);
            System.out.println(sb);

            //Darle la vuelta a una cadena
            System.out.println(sb.reverse());

            System.out.println(sb);
            String cadena2 = sb.toString(); //Asignar un StringBuffer a String





        }
    }

