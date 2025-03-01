package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

import java.util.ArrayList;

public class Miembro {

    private String nombre;
    private String IDMiembro;
    private ArrayList<String> multas;

    public Miembro(String nombre, String IDMiembro, ArrayList<String> multas) {
        this.nombre = nombre;
        this.IDMiembro = IDMiembro;
        this.multas = multas;
    }

    public String getIDMiembro() {
        return IDMiembro;
    }

    public void setIDMiembro(String IDMiembro) {
        this.IDMiembro = IDMiembro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getMultas() {
        return multas;
    }

    public void setMultas(ArrayList<String> multas) {
        this.multas = multas;
    }

    @Override
    public String toString() {
        return "Miembro{" +
                "nombre='" + nombre + '\'' +
                ", IDMiembro='" + IDMiembro + '\'' +
                ", multas=" + multas +
                '}';
    }
}
