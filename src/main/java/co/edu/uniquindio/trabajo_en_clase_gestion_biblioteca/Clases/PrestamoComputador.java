package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

import java.time.LocalDate;

public class PrestamoComputador {

    private LocalDate fechaPrestamo, horaEntrega;

    //Constructor de la clase PrestamoComputador
    public PrestamoComputador(LocalDate fechaPrestamo, LocalDate horaEntrega) {
        this.fechaPrestamo = fechaPrestamo;
        this.horaEntrega = horaEntrega;
    }

    //gets y sets de la clase PrestamoComputador
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalDate horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    //Metodo toString de la clase PrestamoComputador
    @Override
    public String toString() {
        return "PrestamoComputador{" + "fechaPrestamo=" + fechaPrestamo + ", horaEntrega=" + horaEntrega + '}';
    }

}
