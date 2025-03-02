package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

import java.util.ArrayList;

public class PrestamoSala {

    private static PrestamoSala instance;
    private ArrayList<PrestamoComputador> computadores;

    //Constructor de la clase PrestamoSala
    private PrestamoSala() {
        computadores = new ArrayList<>();
    }

    //Metodo para obtener la instancia de la clase PrestamoSala
    public static PrestamoSala getInstance() {
        if (instance == null) {
            instance = new PrestamoSala();
        }
        return instance;
    }

    //Metodo set de la clase PrestamoSala
    public static void setInstance(PrestamoSala instance) {
        PrestamoSala.instance = instance;
    }

    @Override
    public String toString() {
        return "PrestamoSala{" +
                "computadores=" + computadores +
                '}';
    }

}
