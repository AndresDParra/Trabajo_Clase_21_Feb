package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

import java.util.ArrayList;

public class Traductor {

    public String translateBookTitle(String originalTitle, String targetLanguage, ArrayList<Libro> libros) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(originalTitle)) {
                return translateUsingExternalService(originalTitle, targetLanguage);
            }
        }
        return "Título no encontrado en la lista de libros.";
    }

    private String translateUsingExternalService(String text, String targetLanguage) {
        // Logic to handle translation using a placeholder service
        return text + " (traducido a " + targetLanguage + ")";
    }
}
