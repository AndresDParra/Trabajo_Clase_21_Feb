package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public class Libro extends Material_Bibliografico {

    public Libro(String titulo, String autor, String ISBN, Estado estado) {
        super(titulo, autor, ISBN, estado);
    }

    public static void InstanciarLibro(){
        Libro libro1 = new Libro("A", "J.R.R. Tolkien", "978-84-450-7379-1", Estado.DISPONIBLE);
        Libro libro2 = new Libro("B", "J.K. Rowling", "978-84-450-7359-3", Estado.PRESTADO);
        Libro libro3 = new Libro("C", "Gabriel García Márquez", "978-84-450-7359-3", Estado.DISPONIBLE);
        Libro libro4 = new Libro("D", "Miguel de Cervantes", "978-84-450-7359-3", Estado.DISPONIBLE);
        Biblioteca.getMaterialBibliograficos().add(libro1);
        Biblioteca.getMaterialBibliograficos().add(libro2);
        Biblioteca.getMaterialBibliograficos().add(libro3);
        Biblioteca.getMaterialBibliograficos().add(libro4);
    }

}