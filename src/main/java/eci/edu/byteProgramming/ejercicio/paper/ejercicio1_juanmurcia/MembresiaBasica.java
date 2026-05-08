package eci.edu.byteProgramming.ejercicio.paper.ejercicio1_juanmurcia;

public class MembresiaBasica implements MembresiaStrategy {

    @Override
    public double calcularDescuento(double subtotal) {
        return 0;
    }

    @Override
    public String getNombre() {
        return "Basica";
    }

    @Override
    public double getPorcentajeDescuento() {
        return 0;
    }
}