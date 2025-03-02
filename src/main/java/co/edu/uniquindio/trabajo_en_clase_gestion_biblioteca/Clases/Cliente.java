package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

import java.util.ArrayList;

public class Cliente extends Usuario implements UsuarioCliente{

    private Multa multa;

    public Cliente(String nombre, String email, String ID, Multa multa) {
        super(nombre, email, ID);
        this.multa = multa;
    }

    public Multa getMulta() {
        return multa;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }


    @Override
    public void pedirPrestamo(Libro libro) {
        System.out.println("Solicitud de préstamo enviada para el libro con ID: " + libro.getISBN());
    }

    @Override
    public void entregarPrestamo() {
        System.out.println("Préstamo entregado.");
    }

    @Override
    public void consultarLibro() {
        System.out.println("Consultando libro.");
    }

    public static void InstanciarCliente() {
        Cliente cliente1 = new Cliente("Juan", "234@gmail.com", "123", new Multa("2023-01" ,"Robar libro", 10));
        Cliente cliente2 = new Cliente("Pedro", "4567@gamil.com", "1234", new Multa("2023-01" ,"Robar libro", 50));
        Biblioteca.getUsuarios().add(cliente1);
        Biblioteca.getUsuarios().add(cliente2);
    }

    /**
     * Permite al usuario solicitar un préstamo de un libro específico.
     *
     * @param libroID Identificador del libro que desea pedir prestado.
     */
    public void pedirPrestamo(String libroID) {
        System.out.println("Solicitud de préstamo enviada para el libro con ID: " + libroID);
    }

    /**
     * Permite al usuario pagar el préstamo de un libro específico.
     *
     * @param libroID Identificador del libro cuyo préstamo será pagado.
     */
    public void pagarPrestamo(String libroID) {
        System.out.println("El préstamo del libro con ID " + libroID + " ha sido pagado.");
    }

    /**
     * Permite al usuario consultar los libros disponibles en la colección.
     *
     * @param libros Lista de libros disponibles en la biblioteca.
     */
    public void consultarLibros(ArrayList<Libro> libros) {
        System.out.println("Libros disponibles:");
        for (Libro libro : libros) {
            if (libro.getEstado() == Estado.DISPONIBLE) {
                System.out.println(libro);
            }
        }
    }

    /**
     * Permite al usuario ver las multas que tiene asociadas a su cuenta.
     */
    public void verMultas() {
        if (multa == null) {
            System.out.println("No tienes multas pendientes.");
        } else {
            System.out.println("Tu multa pendiente:");
            System.out.println(multa);
        }
    }

    /**
     * Permite al usuario pagar su multa pendiente.
     */
    public void pagarMultas() {
        if (multa == null) {
            System.out.println("No tienes multas pendientes de pago.");
        } else {
            multa = null;
            System.out.println("Tu multa ha sido pagada.");
        }
    }

}