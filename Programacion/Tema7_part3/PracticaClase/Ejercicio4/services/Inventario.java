package Programacion.Tema7_part3.PracticaClase.Ejercicio4.services;

import Programacion.Tema7_part3.PracticaClase.Ejercicio4.models.Material;

import java.util.HashSet;
import java.util.Set;

public class Inventario {
    private Set<Material> inventario;


    public Inventario(Set<Material> materials) {
        this.inventario = new HashSet<>();
    }

    public Set<Material> getInventario() {
        return inventario;
    }

    public void Inventarioo(Set<Material> inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Inventario{");
        sb.append("inventario=").append(inventario);
        sb.append('}');
        return sb.toString();
    }
    public void agregarMaterial(Material material) {
        inventario.add(material);
    }


    public void eliminarMaterial(String id) {
        inventario.removeIf(material -> material.getId().equals(id));
    }

    // --------------------------------Streams-------------------------//


}
