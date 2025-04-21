package Programacion.Tema7_Part1.Practica.GestionBiblioteca;

public class Test {
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca("BebFaty","Calle mar 23","56778906","bibfaty@gmail.com");
        for (int i = 0; i < 20; i++) {
            miBiblioteca.addLibro(new Libro("isbn-" +i ,"titulo-"+i,"autor-"+i,2005+i ));
        }
        Usuario user1=new Usuario("A1233321Z","Ana","Perez","Calle castel 34","12313123","ana@gmail.com");
        Usuario user2=new Usuario("Q123123234S","Faty","Garcia","Calle Mar 22","12313123","faty@gmail.com");
        Usuario user3=new Usuario("R12312321F","Maria","Perez","Calle castel 43","12313123","maria@gmail.com");
        Usuario user4=new Usuario("Z123314H","Luis","Garcia","Calle Mar 34","12313123","luis@gmail.com");
        miBiblioteca.addUsuario(user1);
        miBiblioteca.addUsuario(user2);
        miBiblioteca.addUsuario(user3);
        miBiblioteca.addUsuario(user4);

        miBiblioteca.prestarLibro("A1233321Z","isbn-2");
        miBiblioteca.prestarLibro("A1233321Z","isbn-3");

        miBiblioteca.prestarLibro("Q123123234S","isbn-4");
        miBiblioteca.prestarLibro("Q123123234S","isbn-5");
        miBiblioteca.prestarLibro("R12312321F","isbn-6");
        miBiblioteca.prestarLibro("R12312321F","isbn-7");
        miBiblioteca.prestarLibro("Z123314H","isbn-8");
        miBiblioteca.prestarLibro("Z123314H","isbn-9");

        System.out.println(miBiblioteca.buscarPrestamosUsuario("A1233321Z"));
        for (Libro li : miBiblioteca.listarLibrosDisponibles()){
            System.out.println(li);
        }


	}
}

