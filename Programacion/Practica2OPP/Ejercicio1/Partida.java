package Programacion.Practica2OPP.Ejercicio1;

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
            Monstruo monstruo =new Monstruo("mons1" , Monstruo.Clase.DEMONIO , 5);
            monstruo.setNivel(5);
            monstruos.add(monstruo);

        }
        monstruos.add(new MonstruoFinalNivel("mosFinalNivel1" , Monstruo.Clase.DEMONIO , 35 , 9));
        monstruos.add(new MonstruoFinalNivel("mosFinalNivel2" , Monstruo.Clase.DEMONIO , 30 , 9));
        Arma espada = new Arma("Espada ", Arma.Tipo.ESPADA, 250, true);

        this.jugador.equipar(espada);

    }
    public void turnoJugador() {

             this.jugador.golpear(this.monstruos.getFirst());
             if (this.monstruos.getFirst().getSalud()==0){
                 this.monstruos.removeFirst();
                 if (this.monstruos.isEmpty()){
                     System.out.println("El jugador gana la partida");
                 }
             }
    }

    public void turnoEnemigos() {
        for (Monstruo mons : this.monstruos) {
            if (mons.getSalud()>0){
                mons.golpear(jugador);
                if (jugador.getSalud()<=0){
                    return;
                } else if (monstruos.isEmpty()) {
                    break;

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
