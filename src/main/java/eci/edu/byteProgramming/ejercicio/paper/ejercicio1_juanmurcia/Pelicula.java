package eci.edu.byteProgramming.ejercicio.paper.ejercicio1_juanmurcia;

public abstract class Pelicula {

    private String titulo;
    private double precio;
    private boolean disponible;

    public Pelicula(String titulo, double precio, boolean disponible) {
        this.titulo = titulo;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public abstract String getTipo();
}