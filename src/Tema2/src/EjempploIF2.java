public class EjempploIF2 {
    public static void main(String[] args) {


        // Personaje tiene vide y tiene mana
        //siu la vida es menor de 50 pinto que tiene tomqr pocion de vida
        //siu la mana es menor de 50 pinto que tiene tomqr pocion de magia
        //siu la mana es menor de 50 Y mana menor que 50pinto que tiene tomqr pocion de magia
        int vidaP = 45 ;
        int manaP = 33;
        if (vidaP<=50){
            System.out.println("Toma un pocion de vida ");
        }
        if (manaP<=50) {
            System.out.println("Toma un opcion de mana ");
        }
        if (vidaP<=50 && manaP<=50){
            System.out.println("CORRE");
        }
    }
}
