import java.util.Scanner;

public class notaFinal {
    public static void main(String[] args) {

        double nota1;
        double nota2 ;
        double nota3 ;
        double notaMedia ;
        double notaExamenFinal ;
        double notaTrabajoFinal ;
        double notaFinal ;


        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el valor del nota 1");
        nota1 = sc.nextDouble();

        System.out.println("Dame el valoe del nota2 ");
        nota2 = sc.nextDouble();

        System.out.println("Dame el valor del nta 3");
        nota3 = sc .nextDouble();

        notaMedia = (nota1+nota2+nota3)/3 ;


        System.out.println("Dame el valor del nota de examen final");
        notaExamenFinal =sc.nextDouble();

        System.out.println("Dame el valor del nota de trabajo final ");

        notaTrabajoFinal = sc.nextDouble();
        notaFinal = (notaMedia*55)/100 + (notaExamenFinal*30)/100 + (notaTrabajoFinal*15)/100 ;

        System.out.println("La notaa final de este alumno es :" + notaFinal);

        sc.close();

    }
}
