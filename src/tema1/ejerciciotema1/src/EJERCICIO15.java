public class EJERCICIO15 {
    public static void main(String[] args) {


        double dinero = 2000;
        double interesGenerado = 2000*2.75/100;
        interesGenerado = interesGenerado/2;

        System.out.println("El banco me da de interes"+interesGenerado);

        double resterHaciemda = interesGenerado*0.18;
        System.out.println("al restar la retencion me queda " + (interesGenerado- resterHaciemda));
    }
}
