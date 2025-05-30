package Programacion.Tema7_Part1.Practica.GestionBiblioteca;

import java.time.LocalDate;
import java.util.*;

public class Biblioteca {
    private HashMap<String,Libro>catalogo;
    private HashMap<String,Usuario>usuarios;
    private TreeMap<Usuario, HashSet<Prestamo>>prestamos;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

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
    public void addLibro(Libro libro) {
        this.catalogo.put(libro.getISBN(), libro);
    }
    public void addUsuario(Usuario usuario) {
        this.usuarios.put(usuario.getDni(), usuario);
    }

    public boolean esLibroDisponible(String isbn) {
        Set<Usuario> usuarios =prestamos.keySet();
        for (Usuario usuario : usuarios) {
            HashSet<Prestamo> prestamos2 = prestamos.get(usuario);
            for (Prestamo prestamo : prestamos2) {
                if (prestamo.estaActivo() && prestamo.getLibro().getISBN().equals(isbn)) {
                    return false;
                }
            }
        }
        return true;
    }
    public void prestarLibro(String dni , String isbn) {
        if (this.esLibroDisponible(isbn) && usuarios.containsKey(dni) && catalogo.containsKey(isbn) ){
            Usuario user = usuarios.get(dni);
            Libro lib = catalogo.get(isbn);
            Prestamo p = new Prestamo(user,lib, LocalDate.now(),null);

            HashSet<Prestamo> prestamos2 = prestamos.get(user);
            if (prestamos2 == null) {
                prestamos2=new HashSet<>();
            }
            prestamos2.add(p);
            prestamos.put(user, prestamos2);

        }
    }
    public Libro devolverLibro(String dni , String isbn) {
        if (usuarios.containsKey(dni)) {
            Usuario user = usuarios.get(dni);
            HashSet<Prestamo> prestamosUsuario = prestamos.get(user);

            if (prestamosUsuario != null) {
                for (Prestamo p : prestamosUsuario) {
                    if (p.estaActivo() && p.getLibro().getISBN().equals(isbn)) {
                        return p.getLibro();
                    }
                }
            }
        }
        return null;

    }


    public Set<Prestamo> buscarPrestamosUsuario(String dni) {
        if (usuarios.containsKey(dni)) {
            Usuario user = usuarios.get(dni);
            return prestamos.get(user);
        }
        return null;
    }
    public ArrayList<Libro> listarLibrosDisponibles() {
        ArrayList<Libro> disponibles = new ArrayList<>();
        for (Libro l : catalogo.values()) {
            if (esLibroDisponible(l.getISBN())) {
                disponibles.add(l);
            }
        }
        return disponibles;
    }




}