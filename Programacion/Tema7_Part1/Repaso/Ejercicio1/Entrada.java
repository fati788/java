package Programacion.Tema7_Part1.Repaso.Ejercicio1;

import java.util.Objects;

public class Entrada {
    private String palabra;
    private String palabraTraduccion;

    public Entrada(String palabra, String palabraTraduccion) {
        this.palabra = palabra;
        this.palabraTraduccion = palabraTraduccion;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabraTraduccion() {
        return palabraTraduccion;
    }

    public void setPalabraTraduccion(String palabraTraduccion) {
        this.palabraTraduccion = palabraTraduccion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Entrada{");
        sb.append("palabra='").append(palabra).append('\'');
        sb.append(", palabraTraduccion='").append(palabraTraduccion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Entrada entrada = (Entrada) o;
        return Objects.equals(palabra, entrada.palabra);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palabra);
    }
}
