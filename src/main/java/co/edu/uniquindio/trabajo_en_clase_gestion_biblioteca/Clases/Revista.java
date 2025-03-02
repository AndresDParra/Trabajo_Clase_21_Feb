package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public class Revista extends Material_Bibliografico {

    private String editorial;


    public Revista(String titulo, String autor, String ISBN, Estado estado, String editorial) {
        super(titulo, autor, ISBN, estado);
        this.editorial = editorial;

    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    @Override
    public String toString() {
        return "Revista{" +
                "editorial='" + editorial + "/n" +
                '}';
    }
}
