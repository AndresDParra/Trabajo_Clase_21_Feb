package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public class Multa {

    private String fecha;
    private String descripcion;
    private int diasVencidos;

    public Multa(String fecha, String descripcion, int diasVencidos) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.diasVencidos = diasVencidos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDiasVencidos() {
        return diasVencidos;
    }

    public void setDiasVencidos(int diasVencidos) {
        this.diasVencidos = diasVencidos;
    }

    public double calcularValorMulta(int diasVencidos) {

        double tasaPorDia = 500; // Set a custom fine rate per day

        return diasVencidos * tasaPorDia;
    }

    @Override
    public String toString() {
        return "Multa{" +
                "fecha='" + fecha + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", diasVencidos=" + diasVencidos +
                ", valorMulta=" + calcularValorMulta(diasVencidos) +
                '}';
    }
}
