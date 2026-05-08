package eci.edu.byteProgramming.ejercicio.paper.ejercicio1_juanmurcia;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VideoClubService videoclubService = new VideoClubService();

        System.out.println("Bienvenido al Videoclub de Don Mario");
        System.out.println("Seleccione su membresia:");
        System.out.println("1. Basica");
        System.out.println("2. Premium");

        int opcionMembresia = scanner.nextInt();
        scanner.nextLine();

        MembresiaStrategy membresia;

        if (opcionMembresia == 2) {
            membresia = new MembresiaPremium();
        } else {
            membresia = new MembresiaBasica();
        }

        Cliente cliente = new Cliente(membresia);

        videoclubService.mostrarPeliculas();

        System.out.println();
        System.out.print("Seleccione peliculas (numeros separados por coma): ");
        String seleccion = scanner.nextLine();

        List<Pelicula> peliculasSeleccionadas = videoclubService.seleccionarPeliculas(seleccion);

        if (peliculasSeleccionadas.isEmpty()) {
            System.out.println("No selecciono peliculas disponibles.");
        } else {
            Recibo recibo = new Recibo();
            recibo.imprimir(cliente, peliculasSeleccionadas);
        }

        scanner.close();
    }
}