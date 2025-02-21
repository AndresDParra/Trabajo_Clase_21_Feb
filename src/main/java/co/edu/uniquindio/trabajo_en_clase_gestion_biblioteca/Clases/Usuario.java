package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases;

public class Usuario {
    private String nombre;
    private String email;
    private String ID;

    public Usuario(String nombre, String email, String ID) {
        this.nombre = nombre;
        this.email = email;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}

