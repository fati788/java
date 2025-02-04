package Programacion.Tema5.Ejercico6;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }



    public boolean existeContacto (Contacto contacto){
        return this.contactos.contains(contacto);
    }

    public boolean addContacto (Contacto contacto){
        if (!this.existeContacto(contacto)){
            this.contactos.add(contacto);
            return true;
        }else {
            return false;
        }
    }
    public Integer listarContactos(){
        return this.contactos.size();
    }
    /*
    * public Alumno buscar(Alumno al) {
        int posicion = this.alumnos.indexOf(al); //Comparar con equals **
        if (posicion < 0)
            return null;
        else
            return this.alumnos.get(posicion);
    }*/
          public Contacto buscarContacto (String nombre) {
              int posicion=this.contactos.indexOf(new Contacto(nombre , 123534));
              if (posicion < 0)
                  return null;
              else
                  return this.contactos.get(posicion);


          }
    public void eliminarContacto (Contacto contacto){
        this.contactos.remove(contacto);

        if (  this.contactos.remove(contacto)){
            System.out.println("eliminado contacto " + contacto);
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Agenda{");
        sb.append("contactos=").append(contactos);
        sb.append('}');
        return sb.toString();
    }
}

