package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public class Libro extends Material_Bibliografico {

    public Libro(String titulo, String autor, String ISBN, Estado estado) {
        super(titulo, autor, ISBN, estado);
    }

    public static void InstanciarLibro(){
        Libro libro1 = new Libro("El señor de los anillos", "J.R.R. Tolkien", "978-84-450-7379-1", Estado.DISPONIBLE);
        Libro libro2 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "978-84-450-7359-3", Estado.PRESTADO);
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-84-450-7359-3", Estado.DISPONIBLE);
        Libro libro4 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-84-450-7359-3", Estado.DISPONIBLE);
    }

}