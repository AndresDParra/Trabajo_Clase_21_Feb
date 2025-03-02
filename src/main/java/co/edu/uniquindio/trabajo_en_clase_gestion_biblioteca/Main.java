package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca;

import co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca.Clases.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca UQ", new ArrayList<Usuario>(), new ArrayList<Computador>(), new ArrayList<Libro>(), new ArrayList<Prestamo>());
        Libro.InstanciarLibro();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la biblioteca UQ" + "\n" + "Por favor ingrese su nombre: ");
        String nombre = scanner.nextLine();
        ciclo(nombre);
    }

    private static void ciclo(String nombre) {
        Scanner scanner = new Scanner(System.in);
            System.out.println(nombre + " Que desea hacer el dia de hoy?" + "\n" + "1. Pedir prestamo" + "\n" + "2. Entregar prestamo" + "\n" + "3. Consultar libro");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del libro que desea pedir");
                    String nombreLibro = scanner.nextLine();
                    Biblioteca.pedirPrestamo(nombreLibro);
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
    }






