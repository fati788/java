package Programacion.Practica2OPP.Ejercicio1;

public class MonstruoFinalNivel extends Monstruo{

   private Integer golpeEspecial ;
   private Integer  UsosGolpeEspecial =3;


    public MonstruoFinalNivel(String nombre, Clase clase, Integer puntosD , Integer  golpeEspecial ) {
        super(nombre, clase, puntosD);
        this.golpeEspecial=golpeEspecial;
    }

    public Integer getGolpeEspecial() {
        return golpeEspecial;
    }

    public void setGolpeEspecial(Integer golpeEspecial) {
        this.golpeEspecial = golpeEspecial;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MonstruoFinalNivel{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", clase=").append(clase);
        sb.append(", puntosD=").append(puntosD);
        sb.append(", golpeEspecial=").append(golpeEspecial);
        sb.append(", UsosGolpeEspecial=").append(UsosGolpeEspecial);
        sb.append('}');
        return sb.toString();
    }

  @Override
    protected  void golpear(Personaje persona){
        if (this.UsosGolpeEspecial>0){
            persona.reducirVida(this.golpeEspecial);
           this.UsosGolpeEspecial--;

        }else {
            super.golpear(persona);
        }
    }
}
