package Programacion.Tema7_Part1.EjerciciosMapas.Ejercicio2;

import java.util.*;

public class Hobbie {
    /* La estructura para guardar los hobbies sería un TreeMap<Persona, List<String>>,
      donde se ordenarías las personas por edad. Añade datos y muéstralos. Añadir métodos addPersona,
       addHobbie(Persona, String), listarTodos().*/
    private TreeMap<Persona, List<String>> hobbies;

    public Hobbie() {
        hobbies = new TreeMap<>(Comparator.comparing(Persona::getEdad));
    }

    public TreeMap<Persona, List<String>> getHobbies() {
        return hobbies;
    }
  public  void addPersona(Persona persona) {
        hobbies.put(persona,new ArrayList<>());
  }
  public void addHobbie(Persona persona , String hobbie) {
        List<String> hobbieList = hobbies.get(persona); // hobbies.get(persona)--> nos devuelve un el valor del key persona que es un lista de String
        hobbieList.add(hobbie);
  }
  public void listarTodo(){
        Set<Persona> personas = hobbies.keySet(); //-->el .keySet() duevelve un set con todos los claves (con todas los personas )
        for (Persona persona : personas) {
            System.out.println("Persona: " + persona.getNombre() +" - " + persona.getEdad());
            List<String> hobbieList = hobbies.get(persona);
            System.out.print("Hobbies: ");
            for (String hobbie : hobbieList) {
                System.out.print(  hobbie + " - ");
            }
            System.out.println();
        }
  }
  public void listarTodoV2(){
        Set<Map.Entry<Persona,List<String>>> personaHobbies = hobbies.entrySet();
        //Map.Entry<Persona,List<String>> --> Eso lo que hace es devuelve el key y su valor en forma de pares
        for (Map.Entry<Persona,List<String>> par : personaHobbies) {
            System.out.println("Persona: " + par.getKey().getNombre() +" - " + par.getKey().getEdad());
            System.out.print("Hobbies: ");
            for (String hobbie : par.getValue()) {
                System.out.print(  hobbie + " - ");
            }
            System.out.println();
        }
  }

}
