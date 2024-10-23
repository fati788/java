package src.Tema2.src;
public class EjemploAcumulador {

    public static void main(String[] args) {
        // genera 100 numeros aleatoires entre 1 y 100
        // muestra l asuma de los pares y la suma de los impares

        int total = 0;
        int total2 = 0;
        int num ;
        for (int i = 1; i <=100 ; i++) {
            num =(int) (Math.random()*(100 - 1 + 1 ) )+ 1 ;
            if (num % 2 == 0){
                total = total + num;
            }
            else {
                total2 = total2 + num;
            }

        }
        System.out.println("La suma de los numeros par es: " + total);
        System.out.println("La suma de los numeros impar es: " + total2);

    }
}
