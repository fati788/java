package Programacion.PracticaOPPIII;

public class TorneoMOBA extends Torneo {

    public TorneoMOBA(String nombre) {
        super(nombre);

    }

    @Override
    public void inscribirEquipo(Equipo equipo) throws Exception {
        if(!(equipo instanceof EquipoMOBA)){
            throw new Exception("El Equipo debe ser un tipo EquipoMOBA");

        }else {
        super.inscribirEquipo(equipo);
        }
    }
}
