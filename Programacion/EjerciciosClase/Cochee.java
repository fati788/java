package Programacion.EjerciciosClase;

public class Cochee {
    /*Tenemos la siguiente clase Coche:
public class Coche {
private int velocidad; //Atributo
Coche() { velocidad = 0;} //Constructor
}
Añade a la clase coche los siguientes métodos:
 int getVelocidad(). Este método devuelve la velocidad actual.
 void acelera(int mas). Este método actualiza la velocidad a mas kilómetros más (suma).
 void frena(int menos). Este método actualiza la velocidad a menos kilómetros menos (resta).*/
    private int velocidade;

    public Cochee(int velocidade) {
        this.velocidade = velocidade;
    }

    public Cochee() {
        this.velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }
    public void acalera(int mas ){
        velocidade += mas;
    }
    public void frena(int menos){

        velocidade -= menos;
        if (this.velocidade < 0){
            this.velocidade = 0;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cochee{");
        sb.append("velocidade=").append(velocidade);
        sb.append('}');
        return sb.toString();
    }
}
