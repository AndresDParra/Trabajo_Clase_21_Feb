package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public abstract class Empleado {

    private String nombre;
    private String IDEmpleado;

    private double salarioBase;
    private int horasTrabajadas;
    private double tarifaPorHora;

    public Empleado(String nombre, String IDEmpleado, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        this.nombre = nombre;
        this.IDEmpleado = IDEmpleado;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public double calcularSalario() {
        return salarioBase + (horasTrabajadas * tarifaPorHora);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", IDEmpleado='" + IDEmpleado + '\'' +
                ", salarioBase=" + salarioBase +
                ", horasTrabajadas=" + horasTrabajadas +
                ", tarifaPorHora=" + tarifaPorHora +
                '}';
    }
}
