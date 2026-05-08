package eci.edu.byteProgramming.ejercicio.paper.ejercicio1_juanmurcia;

import java.util.List;

public class Recibo {

    public void imprimir(Cliente cliente, List<Pelicula> peliculas) {
        double subtotal = calcularSubtotal(peliculas);
        double descuento = cliente.getMembresia().calcularDescuento(subtotal);
        double total = subtotal - descuento;

        System.out.println();
        System.out.println("--- RECIBO DE ALQUILER ---");
        System.out.println("Cliente: " + cliente.getMembresia().getNombre());
        System.out.println("Peliculas:");

        for (Pelicula pelicula : peliculas) {
            System.out.println(" - " + pelicula.getTitulo()
                    + " (" + pelicula.getTipo() + ")"
                    + " - $" + formatearPrecio(pelicula.getPrecio()));
        }

        System.out.println("Subtotal: $" + formatearPrecio(subtotal));
        System.out.println("Descuento (" + cliente.getMembresia().getPorcentajeDescuento() + "%): $" + formatearPrecio(descuento));
        System.out.println("Total a pagar: $" + formatearPrecio(total));
        System.out.println("--------------------------");
        System.out.println("¡Disfrute su pelicula!");
    }

    private double calcularSubtotal(List<Pelicula> peliculas) {
        double subtotal = 0;

        for (Pelicula pelicula : peliculas) {
            subtotal += pelicula.getPrecio();
        }

        return subtotal;
    }

    private String formatearPrecio(double valor) {
        return String.format("%,.0f", valor).replace(",", ".");
    }
}