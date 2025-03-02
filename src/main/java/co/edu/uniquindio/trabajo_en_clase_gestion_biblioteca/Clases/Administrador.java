package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public class Administrador extends Usuario implements UsuarioAdmin{

    //Constructor clase Administrador
    public Administrador(String nombre, String email, String ID) {
        super(nombre, email, ID);
    }

    @Override
    public void sancionar() {

    }
}