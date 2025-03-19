package Programacion.Tema7.Colas;

public class TestPila {
    public static void main(String[] args) {
        Pila<Processo> processos = new Pila<>();

        Processo p1 = new Processo(1,"pro1","/usr/bin",5);
        Processo p2 = new Processo(2,"pro2","/usr/bin",3);
        Processo p3 = new Processo(3,"pro3","/usr/bin",2);
        Processo p4 = new Processo(4,"pro4","/usr/bin",1);

        processos.insertarProceso(p1);
        processos.insertarProceso(p2);
        processos.insertarProceso(p3);
        processos.insertarProceso(p4);

        System.out.println(processos.sacarProceso());

        Cola<Processo> processosCola = new Cola<>();
        processosCola.insertarElemento(p1);
        processosCola.insertarElemento(p2);
        processosCola.insertarElemento(p3);
        processosCola.insertarElemento(p4);
        System.out.println(processosCola.sacarElemento());



    }
}
