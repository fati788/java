package Programacion.Practica1OPP.Ejercicio1;

public class Jugador {
    enum  Clase{MAGO , BRUJO , BARBARO , CABALLERO}

    private  String nombre;
    private Clase clase;
    private  Integer nivel ;
    private  Integer experiencia;
    private  Double salud;
    private Arma armaDerecha;
    private  Arma armaIzquierda;

    public Jugador(String nombre, Clase clase) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = 1;
        this.experiencia=0;
        this.salud=200.0;
        this.armaDerecha=null;
        this.armaIzquierda=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", salud=").append(salud);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append('}');
        return sb.toString();
    }
    public void subirNivel() {
        if (this.nivel<10){
            this.nivel++;
            this.salud += Math.pow(2.5, this.nivel);
        }
    }
    public  boolean equipqr(Arma arma){
        boolean equipqr=false;
        if (arma.getDosManos()==true){
            if (this.armaIzquierda==null && this.armaDerecha==null){
                this.armaDerecha=arma;
                this.armaIzquierda=arma;
                equipqr= true;
            }

        }else {
            if (this.armaIzquierda!=null && this.armaDerecha ==null){
                this.armaDerecha=arma;

            } else if (this.armaIzquierda==null && this.armaDerecha !=null) {
                this.armaIzquierda=arma;
            }
        }
        if (equipqr==false){
            System.out.println("No se puede equiprar el arma los dos manos son equipados");
        }
        return equipqr;
    }
    public void tomarPocion(int puntos) {
        if (this.salud<10000){
            this.salud+=puntos;
        }
    }
    public boolean reducirVida(int puntosD) {

        this.salud-=puntosD;
        if (this.salud<=0){
            this.salud=0.0;
            return true;
        }
        return false;

    }





    public void golear(Monstruo monstruo){
        if (this.getArmaDerecha()!=null){
            monstruo.reducirVida(this.getArmaDerecha().getPuntosD());
            if (! this.getArmaDerecha().getDosManos()){
                if (this.getArmaIzquierda()!=null){
                    monstruo.reducirVida(this.getArmaIzquierda().getPuntosD());
                }


            }
        }
        if (monstruo.getSalud() <=0){
            this.experiencia +=10* monstruo.getNivel();

        }
        if (this.experiencia %100==0 ){
            this.subirNivel();
        }

    }

    }






