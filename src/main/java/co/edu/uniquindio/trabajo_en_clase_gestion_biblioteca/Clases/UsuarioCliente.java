package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public interface UsuarioCliente {
    void pedirPrestamo(Libro libro);
    void entregarPrestamo();
    void consultarLibro();
}
