package Programacion.tema6.Ejercico1ClaseRepaso;

import java.util.ArrayList;

public class TiendaComics {

    private ArrayList<Comic> comics;

    public TiendaComics() {
        this.comics = new ArrayList<>();
    }

    public ArrayList<Comic> getComics() {
        return comics;
    }

    public void addComic(Comic comic) {
        if (!this.comics.contains(comic)) {
            this.comics.add(comic);
        }
    }
    public void removeComic(Comic comic) {
        this.comics.remove(comic);
    }
    public void ListarComics() {
        for (Comic comic : comics) {
            System.out.println(comic);
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TiendaComics{");
        sb.append("comics=").append(comics);
        sb.append('}');
        return sb.toString();
    }
}
