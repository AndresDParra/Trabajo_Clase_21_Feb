package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca;

import co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases.*;
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

        Biblioteca.InicializarClases();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Indica si eres un usuario o un administrador" + "\n" +
                "1. Usuario" + "\n" +
                "2. Administrador");

        int opcion1 = scanner1.nextInt();
        scanner1.nextLine(); // Consumir el salto de línea

        if (opcion1 == 1) {
            // Crear un nuevo miembro con un ID ficticio y sin multas
            Cliente cliente = new Cliente(nombre, "CLIENTE" + nombre.hashCode() + "@biblioteca.com", "CLIENTE" + nombre.hashCode(), null);
            Biblioteca.getUsuarios().add(cliente)
            ;
        } else if (opcion1 == 2) {
            // Crear un nuevo administrador con email e ID ficticio
            Administrador admin = new Administrador(nombre, nombre + "@biblioteca.com", "ADMIN" + nombre.hashCode());
            Biblioteca.getUsuarios().add(admin);
        } else {
            System.out.println("Opción no válida. Intente de nuevo.");
        }
        ciclo(nombre);

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
    public static void main(String[] args) {
        App.MainMethod(args, "Juan");
    }
}








