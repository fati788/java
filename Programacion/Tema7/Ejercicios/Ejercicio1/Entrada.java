package Programacion.Tema7.Ejercicios.Ejercicio1;

import java.util.Objects;

public class Entrada {
    private  String palabra;
    private String traduccionES;

    public Entrada(String palabra, String traduccionES) {
        this.palabra = palabra;
        this.traduccionES = traduccionES;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getTraduccionES() {
        return traduccionES;
    }

    public void setTraduccionES(String traduccionES) {
        this.traduccionES = traduccionES;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Entrada{");
        sb.append("palabra='").append(palabra).append('\'');
        sb.append(", traduccionES='").append(traduccionES).append('\'');
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
