package eci.edu.byteProgramming.ejercicio.paper.ejercicio1_juanmurcia;

public interface MembresiaStrategy {

    double calcularDescuento(double subtotal);

    String getNombre();

    double getPorcentajeDescuento();
}