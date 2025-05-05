package Programacion.Tema7_part3.PracticaClase.Ejercicio2;

public class Test {
    public static void main(String[] args) {

        Discord d = new Discord();

        d.addGamer(new Gamer("Fatima" , "fati@gmail.com","Sabway" , Nivel.MAQUINA));
        d.saveGamers();
        d.mostrarGamers();

    }

}
