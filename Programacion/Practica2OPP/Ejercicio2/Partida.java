package Programacion.Practica2OPP.Ejercicio2;

import java.util.ArrayList;

public class Partida {
    private Jugador jugador;
    private ArrayList<Monstruo>monstruos;

    public Partida(Jugador jugador) {
        this.jugador = jugador;
        this.monstruos = new ArrayList<>(10);
        this.iniciarPartida();
    }

    public void iniciarPartida() {
        for (int i = 0; i < 8; i++) {
            monstruos.add(new Monstruo("mons1" , Monstruo.Clase.DEMONIO , 10));
        }
        monstruos.add(new MonstruoFinalNivel("mosFinalNivel1" , Monstruo.Clase.DEMONIO , 15 , 27));
        monstruos.add(new MonstruoFinalNivel("mosFinalNivel1" , Monstruo.Clase.DEMONIO , 15 , 27));

        for (int i = 0; i < 100; i++) {
            this.monstruos.add(new Monstruo("supermons" , Monstruo.Clase.FANTASMA , 10));

        }
        Arma espada = new Arma("Espada ", Arma.Tipo.ESPADA, 15, true);

        this.jugador.equipar(espada);

    }
    public void turnoJugador() {
        int contador = 0;
        for (Monstruo mons : this.monstruos) {
            if(jugador.getSalud()>0) {
                jugador.golpear(mons);

                if (mons.getSalud() <= 0) {
                    monstruos.remove(mons);
                    contador++;
                    if (monstruos.isEmpty()) {
                        System.out.println("El jugador gana la partida");

                    }
                    System.out.println("El jugador ha matado " + contador + " monstruos");
                }
            }
            if (contador>=8){
                System.out.println("El jugador ha matado 8 monstruos");

            }

        }


    }

    public void turnoEnemigos() {
        for (Monstruo mons : this.monstruos) {
            if (mons.getSalud()>0){
                mons.golpear(jugador);
                if (jugador.getSalud()<=0){
                    System.out.println("El jugador ha perdido la partida");
                    return;
                }
            }

        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Partida{");
        sb.append("jugador=").append(jugador);
        sb.append(", monstruos=").append(monstruos);
        sb.append('}');
        return sb.toString();
    }

}
