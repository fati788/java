package Programacion.Tema3.matrice;

public class ej2 {
    public static double numero_aleatorio(double min , double max){
        return (Math.random()*(max-min+1) +min);
    }

    public static void pintar(double matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        // Ej2 crea umn amatriz 7x3 de double rellenalña de valores aleatorios
        // dime la suma de cada una de las culumnas
        double matriz[][] = new double[7][3];

          double sumai =0;
          double sumaj=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numero_aleatorio(1.0, 9.0);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumai += matriz[i][j];
            }
            System.out.println("Fila" + i + " = " + sumai);
            sumai =0;
        }
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                sumaj += matriz[i][j];

            }
            System.out.println("Columna" + j + " = " + sumaj);
            sumaj=0;
        }
        pintar(matriz);
    }
}
