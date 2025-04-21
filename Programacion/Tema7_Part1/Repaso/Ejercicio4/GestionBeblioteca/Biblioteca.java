package Programacion.Tema7_Part1.Repaso.Ejercicio4.GestionBeblioteca;

import java.time.LocalDate;
import java.util.*;

public class Biblioteca {
    private HashMap<String , Libro> catalogo;
    private HashMap<String ,Usuario> usuarios;
    private TreeMap<Usuario , HashSet<Prestamo>> prestamos;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    /*
    public Set<Prestamo> buscarPrestamosUsuario(String dni) {
        if (usuarios.containsKey(dni)) {
            Usuario user = usuarios.get(dni);
            return prestamos.getOrDefault(user, new HashSet<>());
        }
        return new HashSet<>();
    }

    public List<Libro> listarLibrosDisponibles() {
        List<Libro> disponibles = new ArrayList<>();
        for (Libro l : catalogo.values()) {
            if (esLibroDisponible(l.getISBN())) {
                disponibles.add(l);
            }
        }
        return disponibles;
    }

    // Getters, setters, toString y equals si querés
}
*/
    public Biblioteca(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.catalogo = new HashMap<>();
        this.usuarios = new HashMap<>();
        this.prestamos = new TreeMap<>(Comparator.comparing(Usuario::getDni));

    }

    public HashMap<String, Libro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(HashMap<String, Libro> catalogo) {
        this.catalogo = catalogo;
    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public TreeMap<Usuario, HashSet<Prestamo>> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(TreeMap<Usuario, HashSet<Prestamo>> prestamos) {
        this.prestamos = prestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        final StringBuffer sb = new StringBuffer("Biblioteca{");
        sb.append("catalogo=").append(catalogo);
        sb.append(", usuarios=").append(usuarios);
        sb.append(", prestamos=").append(prestamos);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
    public void addLibro(Libro l){
        this.catalogo.put(l.getISBN() , l);
    }
    public void addUsuario(Usuario u){
        this.usuarios.put(u.getDni() , u);
    }
    public boolean esLibroDisponible(String isbn){
        for (Usuario u : prestamos.keySet()){
            for (Prestamo p : prestamos.get(u)){
                if (p.estaActivo() && p.getLibro().getISBN().equals(isbn)){
                    return false;
                }
            }
        }
        return true;
    }
    public void prestarLibro(String dni , String isbn){
        if (this.esLibroDisponible(isbn)){
            Usuario u = this.usuarios.get(dni);
            Libro l = this.catalogo.get(isbn);
            if (u != null) {
                Prestamo p = new Prestamo(u, l, LocalDate.now(), null);

                HashSet<Prestamo> prestamosUsuarios = this.prestamos.get(u);
                if (prestamosUsuarios == null){
                    prestamosUsuarios = new HashSet<>();
                }

                prestamosUsuarios.add(p);
                this.prestamos.put(u,prestamosUsuarios);
            }
        }
    }
    public void devolverLibro(String dni , String isbn) {

        if (usuarios.containsKey(dni)) {
            Usuario u = this.usuarios.get(dni);
            for (Prestamo p : prestamos.get(u)) {
                if (p.estaActivo() && p.getLibro().getISBN().equals(isbn)) {
                        p.devolverLibro();
                    }

            }

        }
    }
    public ArrayList<Libro> buscarPrestamosUsuario(String dni){
        ArrayList<Libro>libros = new ArrayList<>();
        for (Usuario u : prestamos.keySet()){
            if (u.getDni().equals(dni)) {
                for (Prestamo p : prestamos.get(u)) {
                  libros.add(p.getLibro());
                }
            }
        }
        return libros;
    }
    public ArrayList<Libro> listarLibrosDisponibles(){
        ArrayList<Libro>librosDisponibles = new ArrayList<>();
        for (Libro l : catalogo.values()){
            if (this.esLibroDisponible(l.getISBN())){
                librosDisponibles.add(l);
            }
        }
        return librosDisponibles;
    }
}
