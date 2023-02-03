package com.sofkau.qa.sistematransporte.repository.modelo;

public class Persona extends TransporteBus {

    private int id;
    private String cc;
    private String nombre;
    private String apellido;
    private double telefono;
    private static int contadorPersonas;


    public Persona(String cc, String nombre, String apellido, double telefono, int capacidadBus, String destino) {
        super(capacidadBus,destino);
        this.id = ++Persona.contadorPersonas;
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public int id() {
        return id;
    }

    public String cc() {
        return cc;
    }

    public Persona setCc(String cc) {
        this.cc = cc;
        return this;
    }

    public Persona setId(int id) {
        this.id = id;
        return this;
    }

    public String nombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String apellido() {
        return apellido;
    }

    public Persona setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public double telefono() {
        return telefono;
    }

    public Persona setTelefono(int telefono) {
        this.telefono = telefono;
        return this;
    }

    @Override
    public String toString() {
        return "Usuario. " +
                "\nId Persona: " + id +
                "\nC.C Persona: " + cc +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nNumero de Celular: " + telefono + super.toString();
    }
}