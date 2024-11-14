package Programacion.Tema3.matrice;

public class ejemplo1 {

    public static int numero_aleatorio(int min , int max){
        return (int) (Math.random()*(max-min+1) +min);
    }

    public static void pintar(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        // Ej1 : crea una matriz 6x6 de enteros . rellenala de valores aleatorios y
        // dime la suma de la diagonal principal y de la diajgonal segundaria


        int matriz[][] = new int[6][6];
        int sumaPrincipal = 0;
        int sumaSegundar =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero_aleatorio( 1,5);
                sumaPrincipal = matriz[0][0]+matriz[1][1]+matriz[2][2] + matriz[3][3] + matriz[4][4] + matriz[5][5];
                sumaSegundar = matriz[0][5]+matriz[1][4]+matriz[2][3] + matriz[3][2] + matriz[4][1] + matriz[5][0];
            }
        }
        pintar(matriz);
        System.out.println("la suma de la diagonal principal es : " + sumaPrincipal);
        System.out.println("la suma de la diagonal segundar es : " + sumaSegundar);




    }


}
