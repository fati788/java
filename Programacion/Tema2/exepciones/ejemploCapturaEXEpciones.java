package Programacion.Tema2.exepciones;

import java.util.Scanner;

public class ejemploCapturaEXEpciones {
    public static void main(String[] args) {

        // vamos a pedir un precio por teclado y vamos a mostrar el precio econ IVA
        //controlar el precio sea un double y n o escriba otra cosa
        // controlar di es un num negativo vamos a exepcion (no importanttttte )

        double precio;


        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese el precio del producto: ");
            precio = Double.parseDouble(sc.nextLine());
            System.out.println("El precio con iva es " + (precio * 1.21));


        }catch (Exception ex) {
            System.out.println("    ");
        }




    }
}
