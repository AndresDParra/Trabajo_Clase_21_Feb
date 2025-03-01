package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

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

