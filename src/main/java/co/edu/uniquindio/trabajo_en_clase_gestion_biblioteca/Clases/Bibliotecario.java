package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

import java.util.ArrayList;
import java.util.Optional;

public class Bibliotecario extends Empleado {

    private ArrayList<Prestamo> listaPrestamos;

    public Bibliotecario(String nombre, String IDEmpleado, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, IDEmpleado, salarioBase, horasTrabajadas, tarifaPorHora);
        this.listaPrestamos = new ArrayList<>();
    }

    public void gestionarPrestamos(){
        // Placeholder method, calls individual CRUD methods if needed
    }

    public void crearPrestamo(Prestamo prestamo) {

        listaPrestamos.add(prestamo);
    }

    public void actualizarPrestamo(Prestamo prestamo) {
        Optional<Prestamo> prestamoExistente = listaPrestamos.stream()
                .filter(p -> p.equals(prestamo))
                .findFirst();
        prestamoExistente.ifPresent(p -> listaPrestamos.set(listaPrestamos.indexOf(p), prestamo));
    }

    public void eliminarPrestamo(Prestamo prestamo) {
        listaPrestamos.remove(prestamo);
    }

    public ArrayList<Prestamo> listarPrestamos() {
        return listaPrestamos;
    }
}
