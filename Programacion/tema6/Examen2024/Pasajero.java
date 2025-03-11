package Programacion.tema6.Examen2024;

public class Pasajero extends Persona{

    private String preferenciasComida;
    private String restricionesMedicas;
    private Asiento asiento;

    public Pasajero(Long id, String nombre, String apellido, String dniPasaporte, String email, String ciudad, String pais, String telefono, String preferenciasComida, String restricionesMedicas, Asiento asiento) {
        super(id, nombre, apellido, dniPasaporte, email, ciudad, pais, telefono);
        this.preferenciasComida = preferenciasComida;
        this.restricionesMedicas = restricionesMedicas;
        this.asiento = asiento;
    }
    public Pasajero(Pasajero otro){
        this.id = otro.id;
        this.nombre = otro.nombre;
        this.apellido = otro.apellido;
        this.dniPasaporte = otro.dniPasaporte;
        this.email = otro.email;
        this.ciudad = otro.ciudad;
        this.pais = otro.pais;
        this.telefono = otro.telefono;
        this.preferenciasComida = otro.preferenciasComida;
        this.restricionesMedicas = otro.restricionesMedicas;
        this.asiento = otro.asiento;
    }

    public String getPreferenciasComida() {
        return preferenciasComida;
    }

    public void setPreferenciasComida(String preferenciasComida) {
        this.preferenciasComida = preferenciasComida;
    }

    public String getRestricionesMedicas() {
        return restricionesMedicas;
    }

    public void setRestricionesMedicas(String restricionesMedicas) {
        this.restricionesMedicas = restricionesMedicas;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pasajero{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", dniPasaporte='").append(dniPasaporte).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", preferenciasComida='").append(preferenciasComida).append('\'');
        sb.append(", restricionesMedicas='").append(restricionesMedicas).append('\'');
        sb.append(", asiento=").append(asiento);
        sb.append('}');
        return sb.toString();
    }
}
