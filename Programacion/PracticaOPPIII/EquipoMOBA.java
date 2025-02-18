package Programacion.PracticaOPPIII;

public class EquipoMOBA extends Equipo{

    private Integer estrategia;

    public EquipoMOBA(String nombre, Integer nivel , Integer estrategia) {
        super(nombre, nivel);
        this.estrategia = estrategia;
    }

    public Integer getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Integer estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public int calcularPuntos() {
        return this.nivel * this.estrategia;
    }
}
