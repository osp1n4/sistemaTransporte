package com.sofkau.qa.sistematransporte.repository.modelo;


import java.util.List;


import java.util.List;

public class Usuario {

    private Bus bus;
    //private Persona persona;
    private List<Persona> personas;

    public Usuario(List<Persona> personas, Bus bus){
        this.personas = personas;
        this.bus = bus;

    }

    public Bus bus() {
        return bus;
    }

    public Usuario setBus(Bus bus) {
        this.bus = bus;
        return this;
    }


    public List<Persona> personas() {
        return personas;
    }

    public Usuario setPersonas(List<Persona> personas) {
        this.personas = personas;
        return this;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "bus=" + bus +
                ", persona1=" + personas+
                '}';
    }
}
