package Programacion.Practica1OPP.Ejercicio2;

public class TestJuego {
    public static void main(String[] args) {

        Mago mago = new Mago("Ana" , 100);
        Hechizo hechizo1 = new Hechizo("Bola de fuego  " , 20 ,7);
        Hechizo hechizo2 = new Hechizo("Escuedo magico " , 15 ,5);
        Hechizo hechizo3 = new Hechizo("Rayo electrico " , 25 ,9);

        mago.aprenderHechizo(hechizo1);
        mago.aprenderHechizo(hechizo2);
        mago.aprenderHechizo(hechizo3);

       Prueba prueba1= new Prueba("Romper muro " , 5,10);
        Prueba prueba2= new Prueba("Derrotar orco " , 8,15);
        Prueba prueba3= new Prueba("Derrotar elfo oscuro  " , 10,20);

        boolean exito ;

        System.out.println("El mago usa Bola de fuego contra " + prueba1.getDescrepcion());
        exito= mago.lanzarHechizo("bola de fuego  " , prueba1);
        if (exito){
            System.out.println(" El Bola de fuego  gana " + prueba1.getDescrepcion());
        }else {
            System.out.println(" El Bola de fuego  No gana " + prueba1.getDescrepcion());
        }


        System.out.println("El mago usa Escuedo magico contra  " + prueba2.getDescrepcion());
        exito= mago.lanzarHechizo("Escuedo magico " , prueba2);
        if (exito){
            System.out.println(" El Escuedo magico  gana " + prueba2.getDescrepcion());
        }else {
            System.out.println(" Escuedo magico  No gana " + prueba2.getDescrepcion());
        }


        System.out.println("El mago usa Rayo electrico conta " + prueba3.getDescrepcion());
        exito= mago.lanzarHechizo("Rayo electrico " , prueba3);
        if (exito){
            System.out.println(" Rayo electrico  gana " + prueba3.getDescrepcion());
        }else {
            System.out.println(" Rayo electrico  No gana " + prueba3.getDescrepcion());
        }
    }

}
