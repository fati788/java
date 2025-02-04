package Programacion.Tema5.PracticaClase;

public class PasswordClase {

    private Integer longitud;
    private String password;


    public PasswordClase() {
        this.longitud = 8;
        this.password = this.genererPassword();

    }

    public PasswordClase(Integer longitud) {
        this.longitud = longitud;
        this.password = this.genererPassword();
    }
    public PasswordClase (PasswordClase otro ){
        this.longitud = otro.longitud;
        this.password = otro.password;

    }


    public Integer getLongitud() {
        return longitud;
    }

    public String getPassword() {
        return password;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
        this.password = this.genererPassword();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PasswordClase{");
        sb.append("longitud=").append(longitud);
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
      private  static  int generarNumero(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
      }
    /**
     * generer aleatorio el contraena
     * @return
     */
    private String genererPassword() {
        StringBuffer pass = new StringBuffer(this.longitud);

        int tipo , valor;
        for (int i = 0; i < this.longitud; i++) {
            tipo = PasswordClase.generarNumero(1, 4);
            switch (tipo) {
                //mayus
                case 1:
                    valor= PasswordClase.generarNumero(65, 90);
                    pass.append((char) valor);
                    break;
                case 2:
                    //minus
                    valor= PasswordClase.generarNumero(97, 122);
                    pass.append((char) valor);
                    break;
                case 3:
                    //num
                    valor= PasswordClase.generarNumero(48, 57);
                    pass.append((char) valor);
                    break;
                case 4:
                    //simbol
                    valor= PasswordClase.generarNumero(33,47 );
                    pass.append((char) valor);
                    break;
            }
        }

        return pass.toString();

    }
    public boolean esFuerte(){
        int contaMayus=0, contaMinus=0 , contaNUm=0 , contaSimbolos=0;

        char caracter;
        if (this.password.length()<8){
            return false;
        }
        for (int i = 0; i < this.password.length(); i++) {
            caracter = this.password.charAt(i);
            int valorsAcci = (int )(caracter);
            if (valorsAcci>=65 && valorsAcci<=90){
                contaMayus++;
            }else if (valorsAcci>=97 && valorsAcci<=122){
                contaMinus++;
            }else if (valorsAcci>=48 && valorsAcci<=57){
                contaNUm++;
            }else if (valorsAcci>=33 && valorsAcci<=47){
                contaSimbolos++;
            }


        }
        if (  contaMayus >= 1 && contaMinus > 2 && contaNUm > 2 && contaSimbolos >= 1){
            return true;

        }else {
            return false;
        }

    }
}
