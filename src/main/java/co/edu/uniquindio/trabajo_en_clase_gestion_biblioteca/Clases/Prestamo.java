package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;
import java.time.LocalDate;
import java.time.LocalTime;

public class Prestamo {

    private Material_Bibliografico materialBibliograficoPrestado;
    private LocalTime horaEntrega;
    private LocalDate fechaEntrega;
    private LocalTime horaDevolucion;
    private LocalDate fechaDevolucion;
    private boolean mora;

    //Constructor de la clase Prestamo
    public Prestamo(Material_Bibliografico materialBibliograficoPrestado, LocalTime horaEntrega, LocalDate fechaEntrega, LocalTime horaDevolucion, LocalDate fechaDevolucion, boolean mora) {
        this.materialBibliograficoPrestado = materialBibliograficoPrestado;
        this.horaEntrega = horaEntrega;
        this.fechaEntrega = fechaEntrega;
        this.horaDevolucion = horaDevolucion;
        this.fechaDevolucion = fechaDevolucion;
        this.mora = mora;
    }

    //Metodos Getters y Setters
    public Material_Bibliografico getMaterialBibliograficoPrestado() {
        return materialBibliograficoPrestado;
    }

    public void setMaterialBibliograficoPrestado(Material_Bibliografico materialBibliograficoPrestado) {
        this.materialBibliograficoPrestado = materialBibliograficoPrestado;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public LocalTime getHoraDevolucion() {
        return horaDevolucion;
    }

    public void setHoraDevolucion(LocalTime horaDevolucion) {
        this.horaDevolucion = horaDevolucion;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean isMora() {
        return mora;
    }

    public void setMora(boolean mora) {
        this.mora = mora;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Prestamo{" +
                "materialBibliograficoPrestado=" + materialBibliograficoPrestado +
                ", horaEntrega=" + horaEntrega +
                ", fechaEntrega=" + fechaEntrega +
                ", horaDevolucion=" + horaDevolucion +
                ", fechaDevolucion=" + fechaDevolucion +
                ", mora=" + mora +
                '}';
    }
}
