package Programacion.Practica1OPP.Ejercicio2;

public class TestJuego {
    public static void main(String[] args) {

        Mago mago = new Mago("Ana" , 100);
        Hechizo hechizo1 = new Hechizo("bola de fuego  " , 20 ,7);
        Hechizo hechizo2 = new Hechizo("Escuedo magico " , 15 ,5);
        Hechizo hechizo3 = new Hechizo("Rayo electrico " , 25 ,9);

        mago.aprenderHechizo(hechizo1);
        mago.aprenderHechizo(hechizo2);
        mago.aprenderHechizo(hechizo3);

       Prueba prueba1= new Prueba("Romper muro " , 5,10);
        Prueba prueba2= new Prueba("Derrotar orco " , 8,15);
        Prueba prueba3= new Prueba("Derrotar elfo oscuro  " , 10,20);

        boolean exito ;

        System.out.println("El mago usa bola de fuego contra " + prueba1.getDescrepcion());
        exito= mago.lanzarHechizo("bola de fuego  " , prueba1);
        if (exito==true){
            System.out.println("gana el prueba");
        }else {
            System.out.println("no gana el prueba");
        }
        exito= mago.lanzarHechizo("Escuedo magico " , prueba2);
        exito= mago.lanzarHechizo("Rayo electrico " , prueba3);

      /*  try {
            System.out.println("El mago usa bola de fuego contra " + prueba1.getDescrepcion());
            mago.lanzarHechizo("bola de fuego  " , prueba1);


        }*/
    }
}
