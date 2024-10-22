public class ejemploprecio {
    public static void main(String[] args) {
        //Datos de entrada : precioProducto
        //Datos de salida : precioFinal
        //DECLARACION DE VARIABLES
        double precioProducto = 69.95 ;
        double precioFinal = 0.0 ;
        double iva =0 ;

        iva = 21*precioProducto / 100 ;

        precioFinal = precioProducto + iva;

        System.out.println("El valor del precio final es :"+precioFinal);

    }
}
