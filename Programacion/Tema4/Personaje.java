package Programacion.Tema4;
/*1. Crear una clase Personaje
   Propiedades: (private)
   - nombre de tipo String
   - clase de tipo String (elfo, bárbaro, ...)
   - sexo de tipo String (hombre, mujer, nodefinido)
   - vida de tipo Integer (0 - 100)

   Constructor
   - Todas las propiedades -> new Personaje("Aragorn", "Guerrero", "hombre", 50)
   - Vacío -> new Personaje() -> que ponga por defecto ("SinNombre", "Humano", "nodefinido",10)

   Métodos
   - Getter
   - Setter
   - ToString

2. Crear una clase TestPersonaje
   - Crear un objeto jugador1 con los valores que queráis.
   - Crear un objeto jugador2 con los valores por defecto.
   - Cambiar la clase de jugador1 a "Enano"
   - Cambiar la vida de jugador2 a 75
   - Pintar jugador1 y jugador2
*/
public class Personaje {
    enum TipoArma{ ESPADA, MARTILLO, HACHA };
    private String nombre;
    private String clase;
    private String sexo;
    private int vida ;
    private Arma arma;

    public Personaje(String nombre, String clase, String sexo, int vida, Arma arma) {
        this.nombre = nombre;
        this.clase = clase;
        this.sexo = sexo;
        this.vida = vida;
        this.arma = arma;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append(", vida=").append(vida);
        sb.append(", arma=").append(arma);
        sb.append('}');
        return sb.toString();
    }

    public Personaje() {
        this.nombre = "Sin nombre";
        this.clase = "Humano";
        this.sexo = "nodefinido";
        this.vida = 10;
        this.arma= new Arma();

    }
    public void golpear(Personaje personaje) {
        this.arma.golpear(personaje);
    }
}
