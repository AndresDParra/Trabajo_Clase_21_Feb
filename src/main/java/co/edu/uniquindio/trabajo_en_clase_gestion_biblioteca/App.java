package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca;

import co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases.*;
import eu.hansolo.tilesfx.addons.Switch;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class App {

    private static void MainMethod(String[] args, String nombre) {


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Indica si eres un usuario o un administrador" + "\n" +
                "1. Usuario" + "\n" +
                "2. Administrador");

        int opcion1 = scanner1.nextInt();
        scanner1.nextLine(); // Consumir el salto de línea

        if (opcion1 == 1) {
            // Crear un nuevo miembro con un ID ficticio y sin multas
            Cliente cliente = new Cliente(nombre, "CLIENTE" + nombre.hashCode() + "@biblioteca.com", "CLIENTE" + nombre.hashCode(), null);
            Biblioteca.getUsuarios().add(cliente);
            ciclo(nombre);

        } else if (opcion1 == 2) {
            // Crear un nuevo administrador con email e ID ficticio
            Administrador admin = new Administrador(nombre, nombre + "@biblioteca.com", "ADMIN" + nombre.hashCode());
            Biblioteca.getUsuarios().add(admin);
            Admin();
        } else {
            System.out.println("Opción no válida. Intente de nuevo.");
        }
        System.out.println("Desea algo más de la biblioteca? 1. Si 2. No");
        int opcion3 = scanner1.nextInt();
        scanner1.nextLine();
        if (opcion3 == 1) {
            MainMethod(args, nombre);
        }
        else {
            System.out.println("Gracias por usar la biblioteca");
        }

    }
    public static void ciclo(String nombre) {
    Scanner scanner = new Scanner(System.in);
            System.out.println(nombre + " Que desea hacer el dia de hoy?" + "\n" + "1. Pedir prestamo" + "\n" + "2. Entregar prestamo" + "\n" + "3. Consultar libro");
    int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
        case 1:
            System.out.println("Ingrese el nombre del libro que desea pedir");
            String nombreLibro = scanner.nextLine();
            System.out.println("Ingrese el nombre completo suyo para el prestamo");
            String nombreCliente = scanner.nextLine();
            Cliente cliente = new Cliente(nombreCliente, nombreCliente + "@biblioteca.com", "CLIENTE" + nombreCliente.hashCode(), null);
            Bibliotecario bibliotecario = (Bibliotecario) Biblioteca.buscarBibliotecario("Juan");
            System.out.println("Ingrese la fecha de entrega (formato: dd/MM/yyyy):");
            String fechaStr = scanner.nextLine();
            Date fechaEntrega = null;
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                fechaEntrega = dateFormat.parse(fechaStr);
            } catch (ParseException e) {
                System.out.println("Formato de fecha inválido. Usando fecha actual.");
                fechaEntrega = new Date();
            }
            String fechaDevolucionStr = scanner.nextLine();
            Date fechaDevolucion = null;
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                fechaDevolucion = dateFormat.parse(fechaDevolucionStr);
            } catch (ParseException e) {
                System.out.println("Formato de fecha inválido. Usando fecha actual.");
                fechaDevolucion = new Date();
            }
            System.out.println("Ingrese los días de préstamo:");
            int diasPrestamo = scanner.nextInt();
            int precioDia = 10;
            Biblioteca.pedirPrestamo(nombreLibro, cliente, bibliotecario, fechaEntrega, fechaDevolucion, diasPrestamo, precioDia);
            break;

        case 2:
            System.out.println("Ingrese el nombre del libro que desea entregar");
            String nombreLibro2 = scanner.nextLine();
            Biblioteca.entregarPrestamo(nombreLibro2);
            break;

        case 3:
            System.out.println("Ingrese el nombre del libro que desea consultar");
            String nombreLibro3 = scanner.nextLine();
            Biblioteca.consultarLibro(nombreLibro3);
            break;

        default:
            System.out.println("Opcion no valida");
            break;
    }

            System.out.println("Desear realizar otra operacion? 1. Si 2. No");
    int opcion2 = scanner.nextInt();
            scanner.nextLine();
            if (opcion2 == 1) {
        ciclo(nombre);
    }
}

    public static void Admin(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Bienvenido Administrador, que desea hacer el dia de hoy?" + "\n" + "1. Crear Bibliotecario" + "\n" + "2. Crear Cliente" + "\n" + "3. Crear Libro" + "\n" + "4. Crear Computador" + "\n" + "5. Sancionar Usuario");
         int opcion = scanner.nextInt();
         scanner.nextLine();

        switch (opcion){
            case 1:
                System.out.println("Ingrese el nombre del bibliotecario");
                String nombreBibliotecario = scanner.nextLine();
                System.out.println("Ingrese el salario del bibliotecario");
                int salario = scanner.nextInt();
                System.out.println("Ingrese la edad del bibliotecario");
                int edad = scanner.nextInt();
                System.out.println("Ingrese el numero de horas trabajadas por el bibliotecario");
                int horasTrabajadas = scanner.nextInt();
                System.out.println("Ingrese el salario por hora del bibliotecario");
                int salarioHora = scanner.nextInt();
                Bibliotecario bibliotecario = new Bibliotecario(nombreBibliotecario, "1234567", salario, horasTrabajadas, salarioHora);
                Biblioteca.getBibliotecarios().add(bibliotecario);
                System.out.println(bibliotecario.toString());
                break;

            case 2:
                System.out.println("Ingrese el nombre del cliente");
                String nombreCliente = scanner.nextLine();
                System.out.println("Ingrese el email del cliente");
                String emailCliente = scanner.nextLine();
                System.out.println("Ingrese el ID del cliente");
                String IDCliente = scanner.nextLine();
                System.out.println("Desea agregar una multa al cliente? 1. Si 2. No");
                if (scanner.nextInt() == 2) {
                    Cliente cliente = new Cliente(nombreCliente, emailCliente, IDCliente, null);
                    Biblioteca.getUsuarios().add(cliente);
                    System.out.println(cliente.toString());
                    break;
                }
                System.out.println("Ingrese la fecha de la multa (formato: dd/MM/yyyy):");
                String fechaMulta = scanner.nextLine();
                System.out.println("Ingrese la razon de la multa");
                String razonMulta = scanner.nextLine();
                System.out.println("Ingrese el valor de la multa");
                int valorMulta = scanner.nextInt();
                Multa multa = new Multa(fechaMulta, razonMulta, valorMulta);
                Cliente cliente = new Cliente(nombreCliente, emailCliente, IDCliente, multa);
                Biblioteca.getUsuarios().add(cliente);
                System.out.println(cliente.toString());
                break;

            case 3:
                System.out.println("Ingrese el titulo del libro");
                String titulo = scanner.nextLine();
                System.out.println("Ingrese el autor del libro");
                String autor = scanner.nextLine();
                System.out.println("Ingrese el ISBN del libro");
                String ISBN = scanner.nextLine();
                System.out.println("Ingrese el estado del libro");
                String estado = scanner.nextLine();
                Libro libro = new Libro(titulo, autor, ISBN, Estado.valueOf(estado));
                Biblioteca.getMaterialBibliograficos().add(libro);
                System.out.println(libro.toString());
                break;

            case 4:
                System.out.println("Ingrese el nombre del computador");
                String nombreComputador = scanner.nextLine();
                System.out.println("Ingrese el codigo del computador");
                String codigoComputador = scanner.nextLine();
                System.out.println("Ingrese si el computador tiene mouse");
                boolean mouse = Boolean.parseBoolean(scanner.nextLine());
                Computador computador = new Computador(nombreComputador, codigoComputador,mouse );
        }



    }






    public static void main(String[] args) {
        Biblioteca.InicializarClases();
        App.MainMethod(args, "Juan");

    }
}








