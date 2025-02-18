package Programacion.PracticaOPPIII;

public class Main {
    public static void main(String[] args) throws Exception {

        EquipoMOBA equipoMoba1 = new EquipoMOBA("Moba1" , 10 ,3);
        EquipoMOBA equipoMoba2 = new EquipoMOBA("Moba2" , 15 ,2);
        EquipoMOBA equipoMoba3 = new EquipoMOBA("Moba3" , 20 ,4);

        EquipoFPS equipoFps1 = new EquipoFPS("FPS1" , 25 ,6);
        EquipoFPS equipoFps2 = new EquipoFPS("FPS2" , 50 ,8);
        EquipoFPS equipoFps3 = new EquipoFPS("FPS3" , 35 ,7);

        TorneoMOBA torneoMoba = new TorneoMOBA("TorneoMoba");
        TorneoFPS torneoFbs = new TorneoFPS("TorneoFbs");

        torneoMoba.inscribirEquipo(equipoMoba1);
        torneoMoba.inscribirEquipo(equipoMoba2);
        torneoMoba.inscribirEquipo(equipoMoba3);

        torneoFbs.inscribirEquipo(equipoFps1);
        torneoFbs.inscribirEquipo(equipoFps2);
        torneoFbs.inscribirEquipo(equipoFps3);
        System.out.println("Equipos inscritos en el Torneo Moba : ");
        torneoMoba.imprimirEquipos();
        System.out.println("Equipos incritos en el Torneo FPS : ");
        torneoFbs.imprimirEquipos();

        System.out.println("Ganador del equipo  Moba: ");
        System.out.println(torneoMoba.jugarTorneo());
        System.out.println("Ganador del equipo  FPS: ");
        System.out.println(torneoFbs.jugarTorneo());



    }
}
