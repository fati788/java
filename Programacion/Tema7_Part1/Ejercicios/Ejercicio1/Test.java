package Programacion.Tema7_Part1.Ejercicios.Ejercicio1;

public class Test {
    public static void main(String[] args) {

        Diccionario diccionario = new Diccionario();
        Entrada e1 = new Entrada("casa","house");
        Entrada e2 = new Entrada("rosa","pink");
        Entrada e3 = new Entrada("azul","blue");
        Entrada e4 = new Entrada("madre","mother");
        Entrada e5 = new Entrada("padre","father");
        Entrada e6 = new Entrada("hermana","sister");
        Entrada e7 = new Entrada("hermano","brother");
        Entrada e8 = new Entrada("bien","good");
        Entrada e9 = new Entrada("tu","you");
        Entrada e10 = new Entrada("hola","hello");
        Entrada e11 = new Entrada("casa","house");
        Entrada e12 = new Entrada("verde","green");
        Entrada e13 = new Entrada("escuela","school");
        Entrada e14 = new Entrada("morado","violet");
        Entrada e15 = new Entrada("rojo","red");
        Entrada e16 = new Entrada("hija","daughter");
        Entrada e17 = new Entrada("todo","all");
        Entrada e18 = new Entrada("yo","i");
        Entrada e19 = new Entrada("feliz","hapyy");
        Entrada e20 = new Entrada("triste","saad");
        Entrada e21 = new Entrada("blanco","white");
        diccionario.addEntrada(e1);
        diccionario.addEntrada(e2);
        diccionario.addEntrada(e3);
        diccionario.addEntrada(e4);
        diccionario.addEntrada(e5);
        diccionario.addEntrada(e6);
        diccionario.addEntrada(e7);
        diccionario.addEntrada(e8);
        diccionario.addEntrada(e9);
        diccionario.addEntrada(e10);
        diccionario.addEntrada(e11);
        diccionario.addEntrada(e12);
        diccionario.addEntrada(e13);
        diccionario.addEntrada(e14);
        diccionario.addEntrada(e15);
        diccionario.addEntrada(e16);
        diccionario.addEntrada(e17);
        diccionario.addEntrada(e18);
        diccionario.addEntrada(e19);
        diccionario.addEntrada(e20);
        diccionario.addEntrada(e21);
        //listar palabras
        diccionario.listarPalabras();
        //buscar palabra
        System.out.println(diccionario.buscarEntrada("casa"));
        System.out.println(diccionario.buscarEntrada("rosa"));



    }
}
