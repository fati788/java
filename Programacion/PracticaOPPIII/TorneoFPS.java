package Programacion.PracticaOPPIII;

public class TorneoFPS extends Torneo{

    public TorneoFPS(String nombre) {
        super(nombre);
    }

    @Override
    public void inscribirEquipo(Equipo equipo) throws Exception {
        if(!(equipo instanceof EquipoFPS)){
            throw new Exception("El Equipo debe ser un tipo EquipoFPS");
        }else {
            super.inscribirEquipo(equipo);
        }
    }
}
