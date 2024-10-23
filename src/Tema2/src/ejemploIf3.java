package src.Tema2.src;
public class ejemploIf3 {
    public static void main(String[] args) {


        //vidaP  , magiaP , escudoEspecial (boolean)
        // si vida es menor que 50 y no tiene escudo pinta Toma Pocion Vida
        //si magia es menor que 50 y no tinene escudo Tomaq pocion Magia
        // si vida es menoer que 50 y magia menor que 50 --< toma algo CORRE

        int vidaP = 40 ;
        int magiaP = 55 ;
        boolean escudoEspecial = false;

        if (vidaP < 50 && escudoEspecial ==false) {
            System.out.println("Toma pocion de vida ");
        }
        if (magiaP < 50 && escudoEspecial==false) {
            System.out.println("Toma pociom de magia ");
        }
        if (vidaP< 50 && magiaP<50){
            System.out.println("Tomate algo y corre");

        }
        }
    }

