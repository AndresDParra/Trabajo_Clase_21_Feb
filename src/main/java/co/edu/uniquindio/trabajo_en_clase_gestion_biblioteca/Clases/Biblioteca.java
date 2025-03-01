package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

import java.util.ArrayList;
import java.util.Optional;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Miembro> miembros;
    private ArrayList<Multa> multas;
    private ArrayList<Bibliotecario> bibliotecarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.miembros = new ArrayList<>();
        this.multas = new ArrayList<>();
        this.bibliotecarios = new ArrayList<>();
    }

    // CRUD for Libro
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public ArrayList<Libro> listarLibros() {
        return libros;
    }

    public Optional<Libro> buscarLibroPorISBN(String ISBN) {
        return libros.stream().filter(libro -> libro.getISBN().equals(ISBN)).findFirst();
    }

    public boolean eliminarLibro(String ISBN) {
        return libros.removeIf(libro -> libro.getISBN().equals(ISBN));
    }

    public boolean actualizarLibro(String ISBN, Libro nuevoLibro) {
        Optional<Libro> libroExistente = buscarLibroPorISBN(ISBN);
        if (libroExistente.isPresent()) {
            libros.remove(libroExistente.get());
            libros.add(nuevoLibro);
            return true;
        }
        return false;
    }

    // CRUD for Miembro
    public void agregarMiembro(Miembro miembro) {
        miembros.add(miembro);
    }

    public ArrayList<Miembro> listarMiembros() {
        return miembros;
    }

    public Optional<Miembro> buscarMiembroPorID(String IDMiembro) {
        return miembros.stream().filter(miembro -> miembro.getIDMiembro().equals(IDMiembro)).findFirst();
    }

    public boolean eliminarMiembro(String IDMiembro) {
        return miembros.removeIf(miembro -> miembro.getIDMiembro().equals(IDMiembro));
    }

    public boolean actualizarMiembro(String IDMiembro, Miembro nuevoMiembro) {
        Optional<Miembro> miembroExistente = buscarMiembroPorID(IDMiembro);
        if (miembroExistente.isPresent()) {
            miembros.remove(miembroExistente.get());
            miembros.add(nuevoMiembro);
            return true;
        }
        return false;
    }

    // CRUD for Multa
    public void agregarMulta(Multa multa) {
        multas.add(multa);
    }

    public ArrayList<Multa> listarMultas() {
        return multas;
    }

    public boolean eliminarMulta(Multa multa) {
        return multas.remove(multa);
    }

    // CRUD for Bibliotecario
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    public ArrayList<Bibliotecario> listarBibliotecarios() {
        return bibliotecarios;
    }

    public Optional<Bibliotecario> buscarBibliotecarioPorID(String IDEmpleado) {
        return bibliotecarios.stream().filter(bibliotecario -> bibliotecario.toString().contains(IDEmpleado)).findFirst();
    }

    public boolean eliminarBibliotecario(String IDEmpleado) {
        return bibliotecarios.removeIf(bibliotecario -> bibliotecario.toString().contains(IDEmpleado));
    }

    public boolean actualizarBibliotecario(String IDEmpleado, Bibliotecario nuevoBibliotecario) {
        Optional<Bibliotecario> bibliotecarioExistente = buscarBibliotecarioPorID(IDEmpleado);
        if (bibliotecarioExistente.isPresent()) {
            bibliotecarios.remove(bibliotecarioExistente.get());
            bibliotecarios.add(nuevoBibliotecario);
            return true;
        }
        return false;
    }
}
