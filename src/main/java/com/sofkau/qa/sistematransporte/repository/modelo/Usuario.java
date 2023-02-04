package com.sofkau.qa.sistematransporte.repository.modelo;


import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Usuario {

    private String id;
    private Bus bus;
    private TransporteBus transporteBus;
    private List<Persona> personas;
    private LocalDate fecha;
    private LocalDate hora;

    public Usuario() {
    }

    public Usuario(String id, Bus bus, TransporteBus transporteBus, List<Persona> personas, LocalDate fecha, LocalDate hora) {
        this.id = id;
        this.bus = bus;
        this.transporteBus = transporteBus;
        this.personas = personas;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String id() {
        return id;
    }

    public Usuario setId(String id) {
        this.id = id;
        return this;
    }

    public Bus bus() {
        return bus;
    }

    public Usuario setBus(Bus bus) {
        this.bus = bus;
        return this;
    }

    public TransporteBus transporteBus() {
        return transporteBus;
    }

    public Usuario setTransporteBus(TransporteBus transporteBus) {
        this.transporteBus = transporteBus;
        return this;
    }

    public List<Persona> personas() {
        return personas;
    }

    public Usuario setPersonas(List<Persona> personas) {
        this.personas = personas;
        return this;
    }

    public LocalDate fecha() {
        return fecha;
    }

    public Usuario setFecha(LocalDate fecha) {
        this.fecha = fecha;
        return this;
    }

    public LocalDate hora() {
        return hora;
    }

    public Usuario setHora(LocalDate hora) {
        this.hora = hora;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return id.equals(usuario.id) && bus.equals(usuario.bus) && transporteBus.equals(usuario.transporteBus) && personas.equals(usuario.personas) && fecha.equals(usuario.fecha) && hora.equals(usuario.hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bus, transporteBus, personas, fecha, hora);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", bus=" + bus +
                ", transporteBus=" + transporteBus +
                ", personas=" + personas +
                ", fecha=" + fecha +
                ", hora=" + hora +
                '}';
    }
}
