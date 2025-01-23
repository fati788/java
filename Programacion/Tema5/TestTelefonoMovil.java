package Programacion.Tema5;

public class TestTelefonoMovil {

    public static void main(String[] args) {
        /*1. Crea una clase TelefonoMovil con las propiedades:
- String modelo
- String numero
- String codigoPais (ES, UK, ...)
- Double peso

2. Añádele:
- Constructor con las cuatro propiedades
- Constructor Copia
- Getters y setters de las cuatro propiedades
- toString con las cuatro propiedades
- equals que compare las cuatro propiedades

3. Crea una clase TestTelefonoMovil con un main:
- Crea t1 con los valores que tú decidas
- Crea t2 usando el constructor copia con t1
- Crea t3 usando el = con t1
- Imprime los tres objetos
- Muestra la comparación de t1, t2 y t3 con equals
- Muestra la comparación de t1, t2 y t3 con ==
- Observa que t1 y t2 son objetos diferentes y t1 y t3 son el mismo objeto.
- ¿Por qué utilizar equals en lugar de == ?*/
        TelefonoMoil t1 = new TelefonoMoil("Fatima" ,"1233fhsg" , "1233hfjt",10.4);
        TelefonoMoil t2 =new TelefonoMoil(t1);
        TelefonoMoil t3 = t1 ;


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        if (t1.equals(t2)) {
            System.out.println("iguales");

        }else {
            System.out.println("diferentes");
        }
        if (t1.equals(t3)) {
            System.out.println("iguales");

        }else {
            System.out.println("diferentes");
        }

        if (t1==t2) {
            System.out.println("iguales");

        }else {
            System.out.println("diferentes");
        }
        if (t1==t3) {
            System.out.println("iguales");

        }else {
            System.out.println("diferentes");
        }
        //cuando utulizamos el equales si mira solo los proporidades si son iguales o no .
        // pero cuando utulizamos el == si mira si la referncia de memoria son iguales
        //Enonces podemos usar el iquales si quieremos comparar los proporidades
        // y si quieremos comparar la refeiencia de la momoria usamos el==

    }
}
