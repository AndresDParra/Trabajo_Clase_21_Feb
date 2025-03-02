package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public class Computador  {

    private String marca;
    private String modelo;
    private boolean mouse;



    //Constructor de la clase Computador
    public Computador( String marca , String modelo , boolean mouse) {
        this.marca = marca;
        this.modelo = modelo;
        this.mouse = mouse;
    }

    //Gets y sets

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getMouse() {
        return mouse;
    }

    public void setMouse(boolean mouse) {
        this.mouse = mouse;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Computador{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }



}
