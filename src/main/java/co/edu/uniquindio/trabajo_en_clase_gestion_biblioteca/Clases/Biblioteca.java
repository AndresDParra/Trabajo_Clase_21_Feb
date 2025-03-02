package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Biblioteca {

    private String nombre;
    private static ArrayList<Usuario> usuarios;
    private static ArrayList<Computador> computadores;
    private static ArrayList<Libro> materialBibliograficos;
    private static ArrayList<Prestamo> prestamos;

    public Biblioteca(String nombre, ArrayList<Usuario> usuarios, ArrayList<Computador> computadores, ArrayList<Libro> materialBibliograficos, ArrayList<Prestamo> prestamos) {
        Biblioteca.usuarios = usuarios;
        Biblioteca.computadores = computadores;
        Biblioteca.materialBibliograficos = materialBibliograficos;
        this.nombre = nombre;
        Biblioteca.prestamos = prestamos;
    }

    public static void consultarLibro(String titulo) {

        if (buscarMaterialBibliografico(titulo) != null) {
            System.out.println("El libro " + titulo + " se encuentra en la biblioteca" + "/n" + "y esta es su informacion:" + " " + Objects.requireNonNull(buscarMaterialBibliografico(titulo)).toString());
        } else {
            System.out.println("El libro " + titulo + " no se encuentra en la biblioteca");
        }

    }

    public static void entregarPrestamo(String titulo) {
        if (BuscarPrestamo(titulo) != null) {
            System.out.println("El libro " + titulo + " ha sido entregado");
            BorrarPrestamo(BuscarPrestamo(titulo));
        } else {
            System.out.println("El libro " + titulo + " no se encuentra en la biblioteca");
        }
    }

    public static void pedirPrestamo(String nombreLibro) {
        if (buscarMaterialBibliografico(nombreLibro) != null) {
            System.out.println("El libro " + nombreLibro + " ha sido prestado");
            CrearPrestamos(buscarMaterialBibliografico(nombreLibro), null, null, null, null, 0, 0);
        } else {
            System.out.println("El libro " + nombreLibro + " no se encuentra en la biblioteca");
        }
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

    public static void RegistrarCliente(String nombre, String email, String ID, Multa multa){
        var cliente1 = new Cliente(nombre, email, ID, multa);
        usuarios.add(cliente1);
    }


    public void CrearMaterialBibliografico(String titulo, String autor, String codigo, boolean prestado) {

    }

    public static void CrearPrestamos(Material_Bibliografico materialBibliograficoPrestado, Cliente cliente, Bibliotecario bibliotecario, Date fechaEntrega, Date fechaDevolucion, int diasPrestamo, int precioDia) {
        Prestamo prestamoNuevo = new Prestamo(materialBibliograficoPrestado, bibliotecario, cliente, fechaEntrega, fechaDevolucion,diasPrestamo, precioDia);
        prestamos.add(prestamoNuevo);
    }

    public void BorrarCliente(Cliente cliente){
        usuarios.remove(cliente);
    }

    public void BorrarMaterialBibliografico(Libro materialBibliografico){
        materialBibliograficos.remove(materialBibliografico);
    }

    public static void BorrarPrestamo(Prestamo prestamo){
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

    public static Prestamo BuscarPrestamo(String titulo) {
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

    public static void InicializarClases(){
        var biblioteca = new Biblioteca("Biblioteca", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        Libro.InstanciarLibro();
        Cliente.InstanciarCliente();
        Prestamo.instanciarPrestamos();
        Material_Bibliografico.InicializarMaterialBibliografico();

    }
}

