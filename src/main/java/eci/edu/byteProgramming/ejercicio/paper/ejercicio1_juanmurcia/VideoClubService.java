package eci.edu.byteProgramming.ejercicio.paper.ejercicio1_juanmurcia;

import java.util.ArrayList;
import java.util.List;

public class VideoClubService {

    private List<Pelicula> peliculas;

    public VideoClubService() {
        peliculas = new ArrayList<>();
        cargarPeliculas();
    }

    private void cargarPeliculas() {
        peliculas.add(new PeliculaFisica("Interestellar", 8000, true));
        peliculas.add(new PeliculaFisica("El Padrino", 7000, false));
        peliculas.add(new PeliculaDigital("Inception", 5000, true));
        peliculas.add(new PeliculaDigital("Matrix", 6000, true));
    }

    public void mostrarPeliculas() {
        System.out.println("Peliculas disponibles:");

        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula = peliculas.get(i);
            String estado = pelicula.isDisponible() ? "Disponible" : "No disponible";

            System.out.println((i + 1) + ". [" + pelicula.getTipo() + "] "
                    + pelicula.getTitulo()
                    + " - $" + String.format("%,.0f", pelicula.getPrecio()).replace(",", ".")
                    + " - " + estado);
        }
    }

    public List<Pelicula> seleccionarPeliculas(String seleccion) {
        List<Pelicula> seleccionadas = new ArrayList<>();
        String[] numeros = seleccion.split(",");

        for (String numeroTexto : numeros) {
            int numero = Integer.parseInt(numeroTexto.trim());

            if (numero >= 1 && numero <= peliculas.size()) {
                Pelicula pelicula = peliculas.get(numero - 1);

                if (pelicula.isDisponible()) {
                    seleccionadas.add(pelicula);
                } else {
                    System.out.println("La pelicula '" + pelicula.getTitulo() + "' no esta disponible.");
                }
            }
        }

        return seleccionadas;
    }
}