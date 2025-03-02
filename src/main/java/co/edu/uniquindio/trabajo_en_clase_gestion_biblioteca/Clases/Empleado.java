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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIDEmpleado() {
        return IDEmpleado;
    }

    public void setIDEmpleado(String IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
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
