package Programacion.Tema4;

public class TarjetaRegalo {
      /*TarjetaRegalo: numero, saldo. Gasta, getters y setters, toString, fusionarTarjeta(TarjetaRegalo t).*/

    private String numero;
    private Double saldo;

    public TarjetaRegalo(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public TarjetaRegalo() {

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TarjetaRegalo{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
    public void gasta(Double cantidad) {
        double gasto = saldo-cantidad;
        System.out.println(gasto);

    }
    public  void fusionarTarjeta(TarjetaRegalo tarjetaRegalo){
        this.setSaldo(tarjetaRegalo.getSaldo()+this.getSaldo());

    }
}
