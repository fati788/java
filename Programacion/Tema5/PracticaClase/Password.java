package Programacion.Tema5.PracticaClase;

public class Password {

    private Integer longitud;
    private String contrasena;
    private static final String Cracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";

    public Password(Password orto){
        this.longitud = orto.longitud;
        this.contrasena = orto.contrasena;
    }

    public Password() {
        this.longitud = 8;
        this.contrasena = genererContasena(8);

    }

    public Password(Integer longitud) {
        this.longitud = longitud;
        this.contrasena = genererContasena(longitud);
    }

    /**
     * Generar contraseña aleatoria con una longitud dada
     * @param longitud
     * @return
     */
    private String genererContasena(Integer longitud){

        StringBuffer sb = new StringBuffer(this.longitud);

        for (int i = 0; i < longitud; i++){
            int j = (int) (Math.random()*Cracteres.length());
            sb.append(Cracteres.charAt(j));
        }
        return sb.toString();
    }

    /**
     * un boolean devuelve true si la contasena es fuerte
     * devuelve false si la contrasena es debil
     * @return
     */
    public boolean esFuerte(){
        int contaMayus=0, contaMinus=0 , contaNUm=0 , contaSimbolos=0;
        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);
            if (Character.isUpperCase(c)){
                contaMayus++;
            }else if (Character.isLowerCase(c)){
                contaMinus++;
            }else if (Character.isDigit(c)){
                contaNUm++;
            }else {
                contaSimbolos++;
            }

        }

        if ( contrasena.length() >= 8 && contaMayus >= 1 && contaMinus > 2 && contaNUm > 2 && contaSimbolos >= 1){
            return true;

        }else {
            return false;
        }

    }

    public Integer getLongitud() {
        return longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Password{");
        sb.append("longitud=").append(longitud);
        sb.append(", contrasena='").append(contrasena).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
