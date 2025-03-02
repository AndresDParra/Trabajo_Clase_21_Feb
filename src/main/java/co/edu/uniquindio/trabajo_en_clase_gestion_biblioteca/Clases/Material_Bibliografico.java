package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public class Material_Bibliografico {
    private String titulo;
    private String autor;
    private String ISBN;
    private Estado estado;

    public Material_Bibliografico(String titulo, String autor, String ISBN, Estado estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
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

    @Override
    public String toString() {
        return "Material_Bibliografico{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", estado=" + estado +
                '}';
    }

    public static void InicializarMaterialBibliografico(){

        CD cd1 = new CD("The Dark Side of the Moon", "Pink Floyd", "978-84-450-7359-3", Estado.DISPONIBLE, "Rock", 43);
        CD cd2 = new CD("Thriller", "Michael Jackson", "978-84-450-7359-3", Estado.PRESTADO, "Pop", 42);
        Revista revista1 = new Revista("National Geographic", "National Geographic Society", "978-84-450-7359-3", Estado.DISPONIBLE, "Ciencia");
        Revista revista2 = new Revista("Moda", "Kim Kardasian", "978-84-470-7359-3", Estado.DISPONIBLE, "Ciencia");

    }
}
