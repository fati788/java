package Programacion.Tema7.EjemploGenerico;

public class Test {
    public static void main(String[] args) {


        Liga<RobotLucha> luchaLiga = new Liga<>("LigaLucha");
        RobotLucha r1 = new RobotLucha("robot1",50,1000);
        RobotLucha r2 = new RobotLucha("robot2",80,2000);
        RobotLucha r3 = new RobotLucha("robot3",60,100);
        RobotLucha r4 = new RobotLucha("robot4",50,150);
        luchaLiga.addRobot(r1);
        luchaLiga.addRobot(r2);
        luchaLiga.addRobot(r3);
        luchaLiga.addRobot(r4);

        Liga<RobotCarrera> ligaCarrera = new Liga<>("RobotCarrera");
        RobotCarrera r5 = new RobotCarrera("robot5",50,150);
        RobotCarrera r6 = new RobotCarrera("robot6",80,100);
        RobotCarrera r7 = new RobotCarrera("robot7",60,100);
        RobotCarrera r8 = new RobotCarrera("robot8",50,150);
        ligaCarrera.addRobot(r5);
        ligaCarrera.addRobot(r6);
        ligaCarrera.addRobot(r7);
        ligaCarrera.addRobot(r8);

        System.out.println(luchaLiga);
        System.out.println(ligaCarrera);

    }
}
