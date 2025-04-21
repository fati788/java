package Programacion.Tema7_Part1.EjerciciosRepaso.ArrayQueue;

public class Test {
    public static void main(String[] args) {
        LogBuffer lb = new LogBuffer(100);

        for (int i = 0; i <= 105; i++) {
            lb.addLog("Menasge" + i);
        }
        lb.showLogs();
    }
}
