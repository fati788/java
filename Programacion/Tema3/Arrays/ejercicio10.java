package Programacion.Tema3.Arrays;

public class ejercicio10 {
    public static int  NumeroAleatorio(int  min , int max){
        return (int ) (Math.random()*(max-min+ 1)+min);
    }
    public static void pintar (int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static boolean buscar (int cambinacion[], int numero){
        for (int i = 0; i < cambinacion.length; i++) {
            if (cambinacion[i] == numero) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int numeros[] = new int[6];

          int num=0;
          for (int i = 0; i < numeros.length; i++) {
              numeros[i] = NumeroAleatorio(1,49);

              while (buscar(numeros,num)){
                  num = NumeroAleatorio(1,49);
              }
              numeros[i] = num;



          }

      pintar(numeros);




    }
}
