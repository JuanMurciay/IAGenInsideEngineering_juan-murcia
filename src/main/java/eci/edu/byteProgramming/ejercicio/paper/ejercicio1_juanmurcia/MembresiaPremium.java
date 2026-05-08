package eci.edu.byteProgramming.ejercicio.paper.ejercicio1_juanmurcia;

public class MembresiaPremium implements MembresiaStrategy {

    @Override
    public double calcularDescuento(double subtotal) {
        return subtotal * 0.20;
    }

    @Override
    public String getNombre() {
        return "Premium";
    }

    @Override
    public double getPorcentajeDescuento() {
        return 20;
    }
}