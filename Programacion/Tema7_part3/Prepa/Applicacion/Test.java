package Programacion.Tema7_part3.Prepa.Applicacion;

import Programacion.Tema7_part3.Prepa.io.FileUtils;
import Programacion.Tema7_part3.Prepa.models.Departamento;
import Programacion.Tema7_part3.Prepa.models.Estado;
import Programacion.Tema7_part3.Prepa.models.Material;
import Programacion.Tema7_part3.Prepa.models.Tipo;
import Programacion.Tema7_part3.Prepa.servicios.Inventario;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            Inventario inventario = new Inventario(FileUtils.loadMaterialsCSV());

           inventario.addMaterial(new Material("mamamammama" , "fifi" , "qjdgvwxncwc hcdjqh wxcnwxqjd" ,
                   Estado.PERFECTO , Tipo.CABLE , Departamento.INFORMATICA, FileUtils.buscarLoca(2l , FileUtils.loadLocalizacionesCSV())));
            inventario.getMaterials().forEach(System.out::println);
           FileUtils.saveMaterialesCSV(inventario.getMaterials());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
