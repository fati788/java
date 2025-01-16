package Programacion.EjerciciosClase;

public class Finanza {
    /*Realiza una clase Finanzas que convierta dólares a euros y viceversa. Como propiedad se almacena únicamente el
cambio dólar-euro, no se almacena una cantidad sino el tipo de cambio. Codifica los métodos
dolaresToEuros(double dolares) y eurosToDolares(double euros). Prueba que dicha clase funciona
correctamente haciendo conversiones entre euros y dólares. La clase debe tener:
- Un constructor Finanzas() por defecto el cual establecerá el cambio dólar-euro en 1.36.
- Un constructor Finanzas(double), el cual permitirá configurar el cambio dólar-euro.
- Getters y setters
Prueba la clase en otra clase TestFinanzas.*/

   private double valor;

    public double dolaresToEuros(double dolares){
        return dolares * this.valor;

    }
    public double eurosToDolares(double euros){
        return euros / this.valor;

    }
    public Finanza(){
        this.valor = 1.36;

    }

    public Finanza(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Finanza{");
        sb.append("valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
}
