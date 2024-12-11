package Programacion.Tema3.Prueba2024;
import java.util.Scanner;
public class ejercicoBarco {

            /**
             * Generar número aleatorio entre dos números
             * @param mayor
             * @param menor
             * @return
             */
            public static int generarNumeroAleatorio(int mayor, int menor) {
                return (int) (Math.random() * (mayor - menor + 1)) + menor;
            }

            /**
             * Pinta el laberinto generado
             * @param lab
             */
            public static void pintar(char lab[][]) {
                for(int i=0; i<lab.length; i++) {
                    for(int j=0; j<lab[i].length; j++) {
                        System.out.print(lab[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("Elige movimiento");
                System.out.println("1. Derecha");
                System.out.println("2. Izquierda");
                System.out.println("3. Abajo");
                System.out.println("4. Arriba");
            }

            /**
             * Completa el tablero del laberinto.
             * La parte de dentro son .
             * Los bordes inferior y superior son -
             * Los bordes derecho e izquierdo son |
             * @param lab
             */
            public static void rellenar(char lab[][]) {
                //Lo de dentro
                for(int i=1; i<lab.length-1; i++) {
                    for(int j=1; j<lab[i].length-1; j++) {
                        lab[i][j] = '.';
                    }
                }

                //Borde superior e inferior
                for(int j=0; j < lab[0].length; j++) {
                    lab[0][j] = '-';
                    lab[lab.length-1][j] = '-';
                }

                //Borde derecho e izquierdo
                for(int i=0; i<lab.length; i++) {
                    lab[i][0] = '|';
                    lab[i][lab.length - 1] = '|';
                }

                //Jugador
                lab[0][0] = '@';
            }

            public static void generarSalida(char lab[][]) {
                //Generar un número aleatorio entre 1 y 4
                //1 -> superior, 2 -> borde inferior, 3 -> borde derecho, 4 -> borde izquierdo
                //Generar un número entre 0 y 20

                int posicion = generarNumeroAleatorio(20,0);
                int borde = generarNumeroAleatorio(4,1);
                switch (borde) {
                    case 1:
                        //Fila superior x=0, y=posicion
                        lab[0][posicion] = '#';
                        break;
                    case 2:
                        //Fila inferior x=numFilas, y=posicion
                        lab[lab.length-1][posicion] = '#';
                        break;
                    case 3:
                        //Columna derecha x=posicion, y=numColumnas
                        lab[posicion][lab[0].length-1] = '#';
                        break;
                    case 4:
                        //Columna izquierda x=posicion, y=0
                        lab[posicion][0] = '#';
                        break;
                }

            }


            public static void main(String[] args) {
                char laberinto[][] = new char[20][20];
                int posXBomba, posYBomba;
                int posXJug=0, posYJug=0;

                Scanner sc = new Scanner(System.in);

                //Aquí estará la bomba
                posXBomba = generarNumeroAleatorio(18,1);
                posYBomba = generarNumeroAleatorio(18,1);

                //Rellenamos el laberinto
                rellenar(laberinto);

                //Generamos donde está la salida del laberinto
                generarSalida(laberinto);

                //Nos movemos hasta encontrar la salida o explotar
                int direccion;
                char aux;
                boolean salida=false;
                boolean bomba=false;
                boolean fuera=false;

                while(!bomba && !salida && !fuera) {
                    //Pintar laberinto
                    pintar(laberinto);

                    //Mover jugador
                    //try - catch para detectar que no se sale del laberinto
                    try {
                        direccion = Integer.parseInt(sc.nextLine());
                        if (direccion > 0 && direccion < 5) {
                            switch (direccion) {
                                case 1:
                                    //Derecha
                                    posYJug++;
                                    break;
                                case 2:
                                    //Izquierda
                                    posYJug--;
                                    break;
                                case 3:
                                    //Abajo
                                    posXJug++;
                                    break;
                                case 4:
                                    //Arriba
                                    posXJug--;
                                    break;
                            }
                            //Comprobamos salida
                            if (laberinto[posXJug][posYJug] == '#') {
                                salida = true;
                            }
                            //Comprobamos bomba
                            if (posXJug == posXBomba && posYJug == posYBomba) {
                                bomba = true;
                            }
                            //Movemos al jugador
                            laberinto[posXJug][posYJug] = '@';
                        } else {
                            System.out.println("Dirección incorrecta");
                        }
                    } catch (IndexOutOfBoundsException ex) {
                        fuera = true;
                    }

                }

                //Comprobamos si ha salido o explotado
                if (salida) {
                    System.out.println("Enhorabuena, has salido");
                    System.out.println("La bomba estaba en (" + posXBomba + ", " + posYBomba + ")");
                } else if (bomba) {
                    System.out.println("Lo siento, explotaste!!!");
                } else if (fuera) {
                    System.out.println("Te saliste del laberinto, hay que ser ...");
                }

            }
        }

