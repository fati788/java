package Programacion.Tema4;

public class TestArma {
    public static void main(String[] args) {
      Arma Espalda = new Arma("Espada " , 20 , Arma.TipoArma.ESPADA);
      Arma martillo = new Arma("Martillo " , 20 , Arma.TipoArma.MARTILLO);
      Personaje pers = new Personaje("Fatima" , "soldado" , "Hombre" , 25 ,"Martillo " , 20 ,Arma.TipoArma.MARTILLO);
        System.out.println(pers);
           Espalda.golpear(pers);
        System.out.println(Espalda);
        System.out.println(martillo);
        System.out.println(pers);

    }
}
