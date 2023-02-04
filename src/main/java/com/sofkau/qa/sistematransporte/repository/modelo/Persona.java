package com.sofkau.qa.sistematransporte.repository.modelo;

import java.util.Objects;

public class Persona {

    private String id;
    private String cc;
    private String nombre;
    private String apellido;
    private String telefono;



    public Persona(String id, String cc, String nombre, String apellido, String telefono) {
        this.id = id;
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String id() {
        return id;
    }

    public Persona setId(String id) {
        this.id = id;
        return this;
    }

    public String cc() {
        return cc;
    }

    public Persona setCc(String cc) {
        this.cc = cc;
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

    public String telefono() {
        return telefono;
    }

    public Persona setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return id.equals(persona.id) && cc.equals(persona.cc) && nombre.equals(persona.nombre) && apellido.equals(persona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cc, nombre, apellido);
    }

    @Override
    public String toString() {
        return "Usuario. " +
                "\nId Persona: " + id +
                "\nC.C Persona: " + cc +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nNumero de Celular: " + telefono;
    }
}