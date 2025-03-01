package co.edu.uniquindio.trabajo_en_clase_gestion_biblioteca;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la biblioteca UQ" + "\n" + "Por favor ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println(nombre + " Que desea hacer el dia de hoy?" + "\n" + "1. Pedir prestamo" + "\n" + "2. Entregar prestamo" + "\n" + "3. Consultar libro");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Ingrese el nombre del libro que desea pedir");
                String nombreLibro = scanner.nextLine();
                break;

            case 2:
                System.out.println("Ingrese el nombre del libro que desea entregar");
                String libro2 = scanner.nextLine();
                break;

            case 3:
                System.out.println("Ingrese el nombre del libro que desea consultar");
                String libro3 = scanner.nextLine();
                break;
        }



    }



}