package Programacion.tema6.Practica5;

import java.util.ArrayList;

public class Series extends  Multimedia{

   private ArrayList<Temporada>temporadas;

    public Series(String titulo, Boolean plus, Double precio) {
        super(titulo, plus, precio);
        this.temporadas = new ArrayList<>();
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Series{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", plus=").append(plus);
        sb.append(", precio=").append(precio);
        sb.append(", genero=").append(genero);
        sb.append(", temporadas=").append(temporadas);
        sb.append('}');
        return sb.toString();
    }
    public Integer getNumeroTemporadas() {
        return temporadas.size();
    }
    public void addTemporada(Temporada temporada) {
        temporada.setSerie(this);
        this.temporadas.add(temporada);



    }
    public void delTemporada(Temporada temporada) {
       temporadas.remove(temporada);
    }
}
