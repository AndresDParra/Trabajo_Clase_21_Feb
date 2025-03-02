package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public class CD extends Material_Bibliografico {

    private String genero;
    private int duracion;

    public CD(String titulo, String autor, String ISBN, Estado estado, String genero, int duracion) {
        super(titulo, autor, ISBN, estado);
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "CD{" +
                "genero='" + genero + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
