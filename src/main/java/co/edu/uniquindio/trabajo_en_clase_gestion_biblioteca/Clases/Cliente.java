package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public class Cliente extends Usuario implements UsuarioCliente{

    private int sanciones;

    public Cliente(String nombre, String email, String ID, int sanciones) {
        super(nombre, email, ID);
        this.sanciones = sanciones;
    }

    public int getSanciones() {
        return sanciones;
    }

    public void setSanciones(int sanciones) {
        this.sanciones = sanciones;
    }

    @Override
    public void pedirPrestamo() {

    }

    @Override
    public void entregarPrestamo() {

    }

    @Override
    public void consultarLibro() {

    }

    public void InstanciarCliente() {
        Cliente cliente1 = new Cliente("Juan", "234@gmail.com", "123", 0);
        Cliente cliente2 = new Cliente("Pedro", "4567@gamil.com", "1234", 0);
    }

}

