package Programacion.EjerciciosClase;

public class Pajaro {
    /*public class Pajaro {
public void setedad(int e) { edad=e; }
public void printedad() { System.out.println(edad); }
public void setcolor(char c) { color=c; }
private int edad;
private char color;
}*/
    private  int edad;
    private char color;

    public Pajaro(int edad, char color) {
        this.edad = edad;
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pajaro{");
        sb.append("edad=").append(edad);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }
}
