package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private static ArrayList<Usuario> usuarios;
    private static ArrayList<Prestamo> prestamos;
    private static ArrayList<Material_Bibliografico> materialBibliograficos;

    public Biblioteca(String nombre, ArrayList<Usuario> usuarios, ArrayList<Prestamo> prestamos, ArrayList<Material_Bibliografico> materialBibliograficos) {
        Biblioteca.usuarios = usuarios;
        this.prestamos = prestamos;
        Biblioteca.materialBibliograficos = materialBibliograficos;
        this.nombre = nombre;
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

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        Biblioteca.usuarios = usuarios;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public ArrayList<Material_Bibliografico> getMaterialBibliograficos() {
        return materialBibliograficos;
    }

    public void setMaterialBibliograficos(ArrayList<Material_Bibliografico> materialBibliograficos) {
        this.materialBibliograficos = materialBibliograficos;
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

    public void InstanciarAdministrador(){
        Administrador administrador = new Administrador("Juan", "Jefe@Biblio.com", "1234");
        usuarios.add(administrador);
    }

    public void CrearMaterialBibliografico(String titulo, String autor, String codigo, boolean prestado){
        Material_Bibliografico materialBibliografico = new Material_Bibliografico(titulo, autor, codigo, prestado);
        materialBibliograficos.add(materialBibliografico);
    }

    public static void CrearPrestamos(Material_Bibliografico materialBibliograficoPrestado, LocalTime horaEntrega, LocalDate fechaEntrega, LocalTime horaDevolucion, LocalDate fechaDevolucion, boolean mora){
        Prestamo prestamoNuevo = new Prestamo(materialBibliograficoPrestado, horaEntrega, fechaEntrega, horaDevolucion, fechaDevolucion, mora);
        prestamos.add(prestamoNuevo);
    }

    public void BorrarCliente(Cliente cliente){
        usuarios.remove(cliente);
    }

    public void BorrarMaterialBibliografico(Material_Bibliografico materialBibliografico){
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


    public static Material_Bibliografico buscarMaterialBibliografico(String materialBibliografico) {
        for (Material_Bibliografico material : materialBibliograficos) {
            if (materialBibliografico.equals(material.getTitulo())) {
                return material;
            }
        }
        return null;
    }
}
