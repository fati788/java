package Programacion.Tema3.String;

public class Ejercico13 {
    public  static int mayor(int num1 , int num2){
        if(num1>num2){
            return num1;
        }else
            return num2;


    }
    public static void main(String[] args) {

        //Encontrar la palabra de mayor longitud de este texto: “No se me ocurre ninguna frase larga”
        String cadena = "No se me ocurre ninguna frase larga";
        String[] toros = cadena.split(" ");
        int mayor = Integer.MIN_VALUE;

        for (int i = 0; i <toros.length ; i++) {
            mayor = mayor(toros[i].length(),mayor);

        }
        for (int i = 0; i <toros.length ; i++) {

            if (mayor == toros[i].length()){
                System.out.println(toros[i]);
            }
        }
    }
}
