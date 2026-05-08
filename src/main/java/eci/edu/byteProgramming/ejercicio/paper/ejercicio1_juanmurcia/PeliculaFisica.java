package eci.edu.byteProgramming.ejercicio.paper.ejercicio1_juanmurcia;

public class PeliculaFisica extends Pelicula {

    public PeliculaFisica(String titulo, double precio, boolean disponible) {
        super(titulo, precio, disponible);
    }

    @Override
    public String getTipo() {
        return "Fisica";
    }
}