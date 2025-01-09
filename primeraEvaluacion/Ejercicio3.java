package primeraEvaluacion;

public class Ejercicio3 {
    public static String cifrarMensage(String cadena) {
        StringBuffer sb = new StringBuffer();
        cadena = cadena.toLowerCase();
        String palabras[] = cadena.split(" ");
        //Primera letra al final
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = palabras[i].substring(i)+palabras[i].charAt(0);
            //Invertir cada palabra:
           if (palabras[i].length()%2!=0) {
                sb.reverse();
           }
            sb.append(palabras[i]);

        }
        sb.deleteCharAt(0);
        cadena = sb.toString();
        //Reemplazo de vocales
        cadena = cadena.replace("a","@");
        cadena = cadena.replace("e","&");
        cadena = cadena.replace("i","$");
        cadena = cadena.replace("o","º");
        cadena = cadena.replace("u","#");


        return cadena;
    }
    public static String decifrarMensage(String cadena) {
        StringBuffer sb = new StringBuffer(cadena);
        for (int i = 0; i < cadena.length(); i++) {
            cadena = cadena.replace("@","a");
            cadena = cadena.replace("&","e");
            cadena = cadena.replace("$","i");
            cadena = cadena.replace("º","o");
            cadena = cadena.replace("#","u");

        }
        System.out.println(cadena);


        return sb.toString();
    }
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        System.out.println(cifrarMensage(texto));
        String textoCifrado = cifrarMensage(texto);
        decifrarMensage(textoCifrado);
    }
}
