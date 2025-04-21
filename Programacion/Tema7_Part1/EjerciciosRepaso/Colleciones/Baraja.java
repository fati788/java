package Programacion.Tema7_Part1.EjerciciosRepaso.Colleciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Baraja {
    //numeros 1(A),2,3,4,5,6,7,8,9,10,11(j),12(q),13(K)
    //palos : diamantes,corazones,treboles,picas

 private  ArrayList<Carta> cartas;

    public Baraja() {
        this.cartas = new ArrayList<>();
        //Añadir cartas
        for (int i = 1; i <= 12; i++) {
            this.cartas.add(new Carta(i, "Diamantes"));
            this.cartas.add(new Carta(i, "Corazones"));
            this.cartas.add(new Carta(i, "Treboles"));
            this.cartas.add(new Carta(i, "Picas"));

        }
        //barajar
        Collections.shuffle(this.cartas);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Baraja{");
        sb.append("cartas=\n");
                for (Carta c : this.cartas) {
                  switch (c.getNumero()){
                      case 2,3,4,5,6,7,8,9,10:
                          System.out.println(c.getNumero() + " de " + c.getPalo());
                          break;
                      case 1:
                          System.out.println( "AS de " + c.getPalo());
                          break;
                      case 11:
                          System.out.println( "Jota de " + c.getPalo());
                          break;
                       case 12:
                           sb.append( "Dama de " + c.getPalo());
                           break;
                      case 13:
                          sb.append( "Rey de " + c.getPalo());
                          break;
                  }
                }
        sb.append('}');
        return sb.toString();
    }
    public static StringBuffer pintarCartas(Carta c) {
        StringBuffer sb = new StringBuffer("Carta{");

            switch (c.getNumero()){
                case 2,3,4,5,6,7,8,9,10:
                    sb.append(c.getNumero() + " de " + c.getPalo());
                    break;
                case 1:
                    sb.append( "AS de " + c.getPalo());
                    break;
                case 11:
                    sb.append( "Jota de " + c.getPalo());
                    break;
                case 12:
                    sb.append( "Dama de " + c.getPalo());
                    break;
                case 13:
                    sb.append( "Rey de " + c.getPalo());
                    break;

            }
            sb.append('}');

        return sb;

    }
    public Carta sacarCartaArriba(){
        return this.cartas.removeFirst();
    }
    public Carta sacarCartaAbajo(){
        return this.cartas.removeLast();
    }
    public void barajar(){
        Collections.shuffle(this.cartas);
    }
    public void ordenarPorPalo(){
        //igual que collection.sort(Carta.comparator.comparing.....)
        cartas.sort(Comparator.comparing(Carta::getPalo));
    }
    public void ordenarPorNumero(){
        cartas.sort(Comparator.comparing(Carta::getNumero));
    }
}
