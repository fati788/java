package Ejercicioooooooos;

public class EjercicioOrden2 {
    public static void pintar(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");

        }
        System.out.println();
    }
    public static int numeroAmeatorio(int min , int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static void bubbleSort(int array[]){
        boolean intercambio = true;
        int temp;
        for (int i = array.length; i > 0 ; i--) {
            intercambio = false;
            for (int j = 0; j < i-1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] =array[j];
                    array[j] = temp;
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }
        }

    }
    public static void main(String[] args) {
        /*Mejora el método de la burbuja explicado anteriormente y utiliza una variable a modo de centinela o
      flag, de tal manera que ésta se active cuando hay algún intercambio. En el momento que no haya
    ningún intercambio, el algoritmo debería parar puesto que el vector ya está ordenado.
     Clases String y StringBuffer y algoritmos de ordenación*/

      int numeros[] = new int[40];
      for (int i = 0; i < numeros.length; i++) {
          numeros[i] = numeroAmeatorio(1,100);
      }
      pintar(numeros);
      bubbleSort(numeros);
      pintar(numeros);

    }
}
