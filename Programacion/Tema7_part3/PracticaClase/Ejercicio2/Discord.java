package Programacion.Tema7_part3.PracticaClase.Ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Discord {
    private HashSet<Gamer>gamers;

    public Discord() {
        this.gamers = new HashSet<>(this.loadGamers());

    }

    public HashSet<Gamer> getGamers() {
        return gamers;
    }

    public void setGamers(HashSet<Gamer> gamers) {
        this.gamers = gamers;
    }
   public void  addGamer(Gamer g ){
        this.gamers.add(g);
   }
public void removeGamer(Gamer g){
        this.gamers.remove(g);
}
public Gamer findGamer(String nick){
        return this.gamers.stream()
                .filter(g -> g.getNick().equals(nick))
                .findFirst()
                .orElse(null);
}
public void mostrarGamers(){
        this.gamers
                .forEach(System.out::println);
}

        public List<Gamer> loadGamers(){

            try {
               List<Gamer> gamers1 =  Files.lines(Paths.get("Programacion/Tema7_part3/PracticaClase/Ejercicio2/gamers.csv"))
                        .map(line -> {
                            List<String>tokens = Arrays.asList(line.split(";"));
                            return new Gamer(tokens.get(0),tokens.get(1) , tokens.get(2) , Nivel.valueOf(tokens.get(3)));
                        })
                        .toList();
                        return gamers1;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        public void  saveGamers(){
            try {
                Files.write(Paths.get("Programacion/Tema7_part3/PracticaClase/Ejercicio2/gamers.csv"),
                        gamers.stream()
                                .map(Gamer::toString)
                                .toList());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }









}
