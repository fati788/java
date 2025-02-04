package Programacion.Tema5.PracticaClase;

public class testLibro {
    public static void main(String[] args) {

        Libreria libriria = new Libreria();
        Libro libro1 = new Libro("qsdh1", "Hola","jose" , 122 , false);
        Libro libro2 = new Libro("djkfhk", "Mundo","Ana" , 222 , false);
        Libro libro3 = new Libro("dkfjs", "King","Alex" , 412 , false);
        Libro libro4= new Libro("sldfh", "Oficial","Pepe" , 2334 , false);
        Libro libro5 = new Libro("eazf", "Algo","Isa" , 123 , false);
        Libro libro6 = new Libro("aùzekù", "Todo","Juan" , 234 , false);
        Libro libro7 = new Libro("aerjo", "Gracias","Folano" , 123 , false);
        Libro libro8 = new Libro("z^feipjezkfj", "Quiero","Javi" , 122 , false);
        Libro libro9 = new Libro("mejfjzedz", "Seya","Ana" , 243 , false);
        Libro libro10 = new Libro("mfkfkzemlz", "Lolo","Alex" , 167 , false);
        Libro libro11= new Libro("zpefu", "Mancha","Othy" , 189 , false);

        libriria.adquirir(libro1 , 12.34);
        libriria.adquirir(libro2 , 13.34);
        libriria.adquirir(libro3 , 14.34);
        libriria.adquirir(libro4 , 15.34);
        libriria.adquirir(libro5 , 16.34);
        libriria.adquirir(libro6 , 18.34);
        libriria.adquirir(libro7 , 20.34);
        libriria.adquirir(libro8 , 19.34);
        libriria.adquirir(libro9 , 24.34);
        libriria.adquirir(libro10 , 22.34);
        libriria.adquirir(libro11 , 21.34);
        System.out.println(libro1);

        libriria.vender(libro1,13.34);
        libriria.vender(libro2,14.34);
        libriria.vender(libro3,15.34);
        libriria.vender(libro4,16.34);
        libriria.vender(libro5,17.34);
        libriria.vender(libro6,19.34);
        libriria.vender(libro7,21.34);
        libriria.vender(libro8,20.34);
        libriria.vender(libro9,25.34);
        libriria.vender(libro10,23.34);
        libriria.vender(libro11,22.34);
        System.out.println(libriria.calcularGanancia(libro1));
        System.out.println(libriria);



    }
}
