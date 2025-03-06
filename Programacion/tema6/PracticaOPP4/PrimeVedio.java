package Programacion.tema6.PracticaOPP4;

import java.util.ArrayList;

public class PrimeVedio {

    private ArrayList<Multimedia>catalogo;
    private ArrayList<Clienete>suscriptores;
    private Double ganancias;

    public PrimeVedio() {
        this.catalogo = new ArrayList<>();
        this.suscriptores = new ArrayList<>();
        this.ganancias = 0.0;
    }

    public ArrayList<Multimedia> getCatalogo() {
        return catalogo;
    }
    public ArrayList<Clienete> getSuscriptores() {
        return suscriptores;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PrimeVedio{");
        sb.append("catalogo=").append(catalogo);
        sb.append(", suscriptores=").append(suscriptores);
        sb.append(", ganancias=").append(ganancias);
        sb.append('}');
        return sb.toString();
    }

    /**
     *añade un suscriptor
     * @param clienete
     */
    public void addSuscriptore(Clienete clienete) {
           suscriptores.add(clienete);
    }

    /**
     *añade una multimedia al catálogo
     * @param multimedia
     */
    public void addMultimedia(Multimedia multimedia) {
            catalogo.add(multimedia);
    }

    /**
     *metodo para que los clientes ver multimidias
     * y lo añadimos el precio de esta multimidia al gananciaS del prime vedio
     * @param m
     * @param c
     */
    public void verMultimedia(Multimedia m ,Clienete c) {
        if (m.plus) {
            if (!c.esPro()) {
                this.ganancias += m.getPrecion();
            }
        }
    }

    /**
     *Este metodo para calcular el total del ganacias
     * que suma los gancncias quando ver un cliente un multimedia
     * mas el precio mensual del cliente por 12.
     * @return
     */
    public Double getGanancias(){
         double totalGanancias = ganancias;
        for (Clienete c : suscriptores) {
            totalGanancias+=c.getPrecioMensual()*12;
        }
        return totalGanancias;
    }
}
