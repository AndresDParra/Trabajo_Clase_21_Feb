package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

import java.time.LocalDate;

public class SalaComputacion {

    private Computador computador;
    private LocalDate horaAtencion;

    //Constructor de la clase SalaComputacion
    public SalaComputacion(Computador computador,LocalDate horaAtencion) {
        this.computador = computador;
    }

    //gets y sets de la clase SalaComputacion
    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public LocalDate getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(LocalDate horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    //Metodo toString de la clase SalaComputacion
    @Override
    public String toString() {
        return "SalaComputacion{" + "computador=" + computador + '}';
    }


}
