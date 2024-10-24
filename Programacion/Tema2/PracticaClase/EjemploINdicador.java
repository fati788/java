package Programacion.Tema2.PracticaClase;
public class EjemploINdicador {

    public static void main(String[] args) {

        // si teramos un dado 20 veces y queremos sabir si ha salido 6
        int tirada ;
        boolean haSalido6 = false;

        for (int i = 1; i <6 ; i++) {

            tirada = (int)(Math.random()*6)+ 1;
            if (tirada == 6) {
                haSalido6 = true;
            }

        }
        System.out.println(haSalido6);
    }
}
