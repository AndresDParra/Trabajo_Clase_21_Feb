package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

import java.util.Date;

public class Prestamo {
    
    private Libro libro;
    private Miembro miembro;
    private Empleado empleado;
    private Date fechaPrestamo;
    private Date fechaEntrega;
    private int diasPrestamo;
    private int precioDia;

    public Prestamo(Libro libro, Miembro miembro, Empleado empleado, Date fechaPrestamo, Date fechaEntrega, int diasPrestamo, int precioDia) {
        this.libro = libro;
        this.miembro = miembro;
        this.empleado = empleado;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.diasPrestamo = diasPrestamo;
        this.precioDia = precioDia;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }

    public double calcularValorPrestamo(){

        double valorPrestamo = precioDia * diasPrestamo;

        return valorPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + libro +
                ", miembro=" + miembro +
                ", empleado=" + empleado +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaEntrega=" + fechaEntrega +
                ", diasPrestamo=" + diasPrestamo +
                ", precioDia=" + precioDia +
                ", costo total=" + calcularValorPrestamo() +
                '}';
    }
}
