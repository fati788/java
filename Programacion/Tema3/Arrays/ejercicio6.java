package Programacion.Tema3.Arrays;

public class ejercicio6 {
    public static int  NumeroAleatorio(int  min , int max){
        return (int ) (Math.random()*(max-min+ 1)+min);
    }

    public static void main(String[] args) {
        //Generar 10 números enteros aleatorios. Debemos mostrarlos en el siguiente orden: el primero, el último, el
        //segundo, el penúltimo, el tercero, etc… Pista: primero los guardas en un array y luego lo recorres como indica.
        // bolean buscar(int matric[][] , int

        int numeros[] = new  int[10];
        for(int i = 0 ; i < numeros.length ; i++){
            numeros[i] = NumeroAleatorio(0,10);
        }
        for(int i = 0 ; i < numeros.length ; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        for(int i = 0 ; i < numeros.length/2 ; i++){

            System.out.println( numeros[i] + " - " + numeros[numeros.length -1 -i] + " ");

        }

    }
}
