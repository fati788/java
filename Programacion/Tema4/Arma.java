package Programacion.Tema4;
/*1. Crear una nueva clase Arma
    Propiedades:
    - nombre de tipo String
    - tipo de tipo enum TipoArma
    - golpe de tipo Integer

    Para crear un enum -> enum TipoArma { ESPADA, MARTILLO, HACHA }

    Constructor:
    - con todas las propiedades
    - vacío sin valores (que tome los valores por defecto) -> dejar en blanco el constructor

    Métodos:
    - Getter y Setter y toString
    - public void golpear(Personaje personaje) {
        personaje.setVida(personaje.getVida() - this.golpe);
      }

2. Crear una clase TestArma, creando una espada y un martillo
   Crear un personaje como en el ejercicio anterior
   Golpear con la espada a ese personaje
   Pintar la espada, el martillo y el personaje*/

public class Arma {
     enum TipoArma{ ESPADA, MARTILLO, HACHA };
    private String nombre;
    public int golpe;
    private TipoArma tipo;

    public Arma(String nombre, int golpe, TipoArma tipo) {
        this.nombre = nombre;
        this.golpe = golpe;
        this.tipo = tipo;
    }

    public Arma() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGolpe() {
        return golpe;
    }

    public void setGolpe(int golpe) {
        this.golpe = golpe;
    }

    public TipoArma getTipo() {
        return tipo;
    }

    public void setTipo(TipoArma tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Arma{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", golpe=").append(golpe);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
    public void golpear(Personaje personaje) {
        personaje.setVida(personaje.getVida()-this.getGolpe());
    }

}
