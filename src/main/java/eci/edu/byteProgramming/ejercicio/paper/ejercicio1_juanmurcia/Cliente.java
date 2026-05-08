package eci.edu.byteProgramming.ejercicio.paper.ejercicio1_juanmurcia;

public class Cliente {

    private MembresiaStrategy membresia;

    public Cliente(MembresiaStrategy membresia) {
        this.membresia = membresia;
    }

    public MembresiaStrategy getMembresia() {
        return membresia;
    }
}