package Programacion.Tema3.String;

public class Ejercicio8 {
    public static void main(String[] args) {

        //Divide la url “http://www.iesjaroso.es/noticias” en “http”, “www.iesjaroso.es”, “noticias”.

        String url = "http://www.iesjaroso.es/noticias";

        StringBuffer sb = new StringBuffer(url);
        sb.deleteCharAt(4);
        url = sb.toString();
        String[] torozs = url.split("/");
        for (int i = 0; i < url.length(); i++) {

            System.out.println(torozs[i]);

        }
    }
}
