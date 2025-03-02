package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;


import java.util.ArrayList;
import java.util.List;
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

    public List<Libro> buscarPorGenero(Genero genero) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getGenero() == genero) {
                resultado.add(libro);
            }
        }
        return resultado;
    }


}

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private static ArrayList<Usuario> usuarios;
    private static ArrayList<Computador> computadores;
    private static ArrayList<Libro> materialBibliograficos;
    private static ArrayList<Prestamo> prestamos;

    public Biblioteca(String nombre, ArrayList<Usuario> usuarios, ArrayList<Computador> computadores, ArrayList<Libro> materialBibliograficos) {
        Biblioteca.usuarios = usuarios;
        Biblioteca.computadores = computadores;
        Biblioteca.materialBibliograficos = materialBibliograficos;
        this.nombre = nombre;
    }

    public static void consultarLibro() {
    }

    public static void entregarPrestamo() {
    }

    public static void pedirPrestamo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(ArrayList<Usuario> usuarios) {
        Biblioteca.usuarios = usuarios;
    }

    public static ArrayList<Computador> getComputadores() {
        return computadores;
    }

    public static void setComputadores(ArrayList<Computador> computadores) {
        Biblioteca.computadores = computadores;
    }

    public static ArrayList<Libro> getMaterialBibliograficos() {
        return materialBibliograficos;
    }

    public static void setMaterialBibliograficos(ArrayList<Libro> materialBibliograficos) {
        Biblioteca.materialBibliograficos = materialBibliograficos;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", prestamos=" + prestamos +
                ", materialBibliograficos=" + materialBibliograficos +
                '}';
    }

    public static void RegistrarCliente(String nombre, String email, String ID, int sanciones){
        var cliente1 = new Cliente(nombre, email, ID, sanciones);
        usuarios.add(cliente1);
    }


    public void CrearMaterialBibliografico(String titulo, String autor, String codigo, boolean prestado) {

    }

    public static void CrearPrestamos(Libro materialBibliograficoPrestado, LocalTime horaEntrega, LocalDate fechaEntrega, LocalTime horaDevolucion, LocalDate fechaDevolucion, boolean mora){
        Prestamo prestamoNuevo = new Prestamo(materialBibliograficoPrestado, horaEntrega, fechaEntrega, horaDevolucion, fechaDevolucion, mora);
        prestamos.add(prestamoNuevo);
    }

    public void BorrarCliente(Cliente cliente){
        usuarios.remove(cliente);
    }

    public void BorrarMaterialBibliografico(Libro materialBibliografico){
        materialBibliograficos.remove(materialBibliografico);
    }

    public void BorrarPrestamo(Prestamo prestamo){
        prestamos.remove(prestamo);
    }

    public Usuario BuscarCliente(String nombre){
        for (Usuario usuario1: usuarios){
            if (nombre.equals(usuario1.getNombre())){
                return usuario1;
            }
        }
        return null;
    }

    public Prestamo BuscarPrestamo(String titulo) {
        for (Prestamo prestamo : prestamos) {
            if (titulo.equals(prestamo.getMaterialBibliograficoPrestado().getTitulo())) {
                return prestamo;
            }
        }
        return null;
    }


    public static Libro buscarMaterialBibliografico(String materialBibliografico) {
        for (Libro material : materialBibliograficos) {
            if (materialBibliografico.equals(material.getTitulo())) {
                return material;
            }
        }
        return null;
    }
}

>>>>>>> Andres
