package Programacion.PracticaOPPIII;

import java.util.ArrayList;

public class Torneo {
    protected String nombre;
    protected ArrayList<Equipo> equipos;

    public Torneo(String nombre) {
        this.equipos = new ArrayList<>();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void inscribirEquipo(Equipo equipo) throws Exception {
        equipos.add(equipo);
    }
    public Equipo jugarTorneo(){
        int mayor = Integer.MIN_VALUE;
        for (Equipo equipo: equipos) {
            if (equipo.calcularPuntos() > mayor) {
                mayor = equipo.calcularPuntos();
            }
        }

        for (Equipo equipo: equipos) {
            if (mayor == equipo.calcularPuntos()) {
                return equipo;
            }
        }
        return null;
    }
    public void imprimirEquipos() {
        System.out.println("*************Equipo**************");
        for (Equipo equipo: equipos) {
            if (equipo instanceof EquipoMOBA) {
                System.out.println(equipo.getNombre() + " (Nivel : " + equipo.getNivel() + " , Estrategia: "+ ((EquipoMOBA) equipo).getEstrategia() + ")  - Puntos : " + equipo.calcularPuntos());

            } else if (equipo instanceof EquipoFPS) {
                System.out.println(equipo.getNombre() + " (Nivel : " + equipo.getNivel() + " , Punteria: "+((EquipoFPS) equipo).getPunteria() + ") - Puntos : " + equipo.calcularPuntos());

            }

        }

    }
}
