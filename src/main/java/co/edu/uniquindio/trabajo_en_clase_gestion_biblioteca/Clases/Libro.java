package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public class Libro {

    private String titulo;
    private String autor;
    private String ISBN;
    private Estado estado;
<<<<<<< HEAD
    private Genero genero;

    public Libro(String titulo, String autor, String ISBN, Genero genero, Estado estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.genero = genero;
=======

    public Libro(String titulo, String autor, String ISBN, Estado estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
>>>>>>> Andres
        this.estado = estado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

<<<<<<< HEAD
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

=======
>>>>>>> Andres
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", estado=" + estado +
                '}';
    }
}
