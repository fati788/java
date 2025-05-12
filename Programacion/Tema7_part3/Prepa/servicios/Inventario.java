package Programacion.Tema7_part3.Prepa.servicios;

import Programacion.Tema7_part3.Prepa.models.Departamento;
import Programacion.Tema7_part3.Prepa.models.Estado;
import Programacion.Tema7_part3.Prepa.models.Localizacion;
import Programacion.Tema7_part3.Prepa.models.Material;

import java.util.*;
import java.util.stream.Collectors;

public class Inventario {
    private Set<Material> materials;

    public Inventario() {
        this.materials = new HashSet<Material>();
    }

    public Set<Material> getMaterials() {
        return materials;
    }

    public Inventario(Set<Material> materials) {
        this.materials = materials;
    }
    public void addMaterial(Material m){
        this.materials.add(m);
    }
    public void removeMaterial(Material m){
        this.materials.remove(m);
    }
    public void removeMaterialPOrId(String id){
        this.materials.removeIf(material -> material.getId().equals(id));
    }
    // ------------------Streams------------------------------//

    public void materialesPorLocalizacion(){

          this.materials.stream()
                .collect(Collectors.groupingBy(Material::getLocalizacion))
                  .forEach((k , v) -> System.out.println(k + " -> " + v));

    }
    public void materialesPorDepartamento(){
          this.materials.stream()
                .collect(Collectors.groupingBy(Material::getDepartamento))
                  .forEach((k , v) -> System.out.println(k + " -> " + v));


    }
    public void materialesPorEstado(){
         this.materials.stream()
                .collect(Collectors.groupingBy(Material::getEstado, Collectors.counting()))
                 .forEach((k , v) -> System.out.println(k + " -> " + v));

    }
    public List<Material> materialesInformaticaBasura(){

           List<Material> mats = this.materials.stream()
                .filter( m -> m.getDepartamento().equals(Departamento.INFORMATICA))
                .filter( m -> m.getEstado().equals(Estado.BASURA))
                .toList();

           return new ArrayList<>(mats);




    }
}
