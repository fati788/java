package Programacion.Tema7_Part1.Repaso.Ejercicio4.ExpedienteAlumnos;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class CentroEducativo {
    private TreeSet<Expediente>expedientes;
    private String nombreCentro;
    private String direccion;
    private String localidad;
    private String telefono;
    private String email;

    public CentroEducativo(String nombreCentro, String direccion, String localidad, String telefono, String email) {
        this.nombreCentro = nombreCentro;
        this.direccion = direccion;
        this.localidad = localidad;
        this.telefono = telefono;
        this.email = email;
        this.expedientes = new TreeSet<>(new Comparator<Expediente>() {
            @Override
            public int compare(Expediente o1, Expediente o2) {
                return o1.getEstudiante().getDni().compareTo(o2.getEstudiante().getDni());
            }
        });
    }

    public TreeSet<Expediente> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(TreeSet<Expediente> expedientes) {
        this.expedientes = expedientes;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CentroEducativo{");
        sb.append("expedientes=").append(expedientes);
        sb.append(", nombreCentro='").append(nombreCentro).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CentroEducativo that = (CentroEducativo) o;
        return Objects.equals(nombreCentro, that.nombreCentro);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreCentro);
    }
    public void addExpediente(Expediente e) {
        this.expedientes.add(e);
    }
    public void buscarExpedientes(String dni) {

        for (Expediente e : this.expedientes) {
            if (e.getEstudiante().getDni().equals(dni)){
                for (NotasCurso nc : e.getNotas()) {
                    System.out.println(nc.getNotas());
                }
            }
        }
    }
}
