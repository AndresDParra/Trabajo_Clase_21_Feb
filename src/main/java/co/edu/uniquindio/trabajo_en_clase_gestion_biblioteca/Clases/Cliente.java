package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public class Cliente extends Usuario implements UsuarioCliente{

    private Multa multa;

    public Cliente(String nombre, String email, String ID, Multa multa) {
        super(nombre, email, ID);
        this.multa = multa;
    }

    public Multa getMulta() {
        return multa;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }


    @Override
    public void pedirPrestamo(Libro libro) {
        System.out.println("Solicitud de préstamo enviada para el libro con ID: " + libro.getISBN());
    }

    @Override
    public void entregarPrestamo() {
        System.out.println("Préstamo entregado.");
    }

    @Override
    public void consultarLibro() {
        System.out.println("Consultando libro.");
    }

    public static void InstanciarCliente() {
        Cliente cliente1 = new Cliente("Juan", "234@gmail.com", "123", new Multa("2023-01" ,"Robar libro", 10));
        Cliente cliente2 = new Cliente("Pedro", "4567@gamil.com", "1234", new Multa("2023-01" ,"Robar libro", 50));
    }

}

