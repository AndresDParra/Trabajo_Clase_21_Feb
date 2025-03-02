package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

import java.util.ArrayList;

public class Miembro {

    private String nombre;
    private String IDMiembro;
    private ArrayList<Multa> multas;

    public Miembro(String nombre, String IDMiembro, ArrayList<Multa> multas) {
        this.nombre = nombre;
        this.IDMiembro = IDMiembro;
        this.multas = multas;
    }

    public String getIDMiembro() {
        return IDMiembro;
    }

    public void setIDMiembro(String IDMiembro) {
        this.IDMiembro = IDMiembro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Multa> getMultas() {
        return multas;
    }

    public void setMultas(ArrayList<Multa> multas) {
        this.multas = multas;
    }

    @Override
    public String toString() {
        return "Miembro{" +
                "nombre='" + nombre + '\'' +
                ", IDMiembro='" + IDMiembro + '\'' +
                ", multas=" + multas +
                '}';
    }


    /**
     * Permite al usuario solicitar un préstamo de un libro específico.
     *
     * @param libroID Identificador del libro que desea pedir prestado.
     */
    public void pedirPrestamo(String libroID) {

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
        if (multas.isEmpty()) {
            System.out.println("No tienes multas pendientes.");
        } else {
            System.out.println("Tus multas pendientes son:");
            for (Multa multa : multas) {
                System.out.println(multa);
            }
        }
    }

    /**
     * Permite al usuario pagar todas sus multas pendientes.
     */
    public void pagarMultas() {
        if (multas.isEmpty()) {
            System.out.println("No tienes multas pendientes de pago.");
        } else {
            multas.clear();
            System.out.println("Todas tus multas han sido pagadas.");
        }
    }

    public void InicializarMiembros() {
        Miembro miembro1 = new Miembro("Juan Perez", "123456", new ArrayList<Multa>());
        Miembro miembro2 = new Miembro("Maria Rodriguez", "654321", new ArrayList<Multa>());
        Miembro miembro3 = new Miembro("Pedro Gomez", "987654", new ArrayList<Multa>());
    }
}
