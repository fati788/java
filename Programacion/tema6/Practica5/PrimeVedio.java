package Programacion.tema6.Practica5;

import java.util.ArrayList;

public class PrimeVedio {
    private ArrayList<Multimedia>catalogo;
    private ArrayList<Cliente>suscriptores;
    private Double ganancias;

    public PrimeVedio() {
        this.catalogo = new ArrayList<>();
        this.suscriptores = new ArrayList<>();
        this.ganancias = 0.0;

    }
    public void addSuscriptor(Cliente cliente) {
      if (!suscriptores.contains(cliente)) {
          suscriptores.add(cliente);
      }
    }
    public void addCatalogo(Multimedia multimedia) {
        if (!catalogo.contains(multimedia)) {
            catalogo.add(multimedia);
        }
    }
    public void ver(Multimedia m , Cliente c ){
        if (c instanceof ClientePrimePro) {
                this.ganancias +=m.getPrecio();

        }
    }
    public Double getGanancias() {
        double totalGanancias = ganancias;
        for (Cliente c : suscriptores) {
           totalGanancias += c.getPrecioMensoal()* 12;

        }
        return totalGanancias;
    }
}
