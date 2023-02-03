package com.sofkau.qa.sistematransporte.repository.modelo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository
public class Ticket {

    private List<Usuario> usuarios;
    private List<Persona> personas;


    public Ticket() {

        personas = new ArrayList<>(List.of(new Persona("6666897", "Antonio", "Ospina", 314732127, 40, "Pereira"),
                new Persona("90099987", "Maria", "Ospina", 3447005, 40, "Preira"), new Persona("876556", "Angelica", "Mendez", 3352922, 40, "Chinchina"),
                new Persona("78221111", "Yarlediz", "Zuñiga", 3477777, 40, "Medellin"),
                new Persona("90099987", "Maria", "Ospina", 3447005, 40, "Preira")));

        Calendar horarioSalida = Calendar.getInstance();
        horarioSalida = Calendar.getInstance();
        horarioSalida.set(Calendar.HOUR_OF_DAY, 18);
        horarioSalida.set(Calendar.MINUTE, 0);
        horarioSalida.set(Calendar.SECOND, 0);


        Bus bus = new Bus("Micro bus", 20, horarioSalida);
        usuarios = new ArrayList<>(List.of(new Usuario(personas, bus)));
    }

    public void agregarPasajero(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> usuarios() {
        return usuarios;
    }

    public Ticket setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
        return this;
    }

    public List<Persona> personas() {
        return personas;
    }

    public Ticket setPersonas(List<Persona> personas) {
        this.personas = personas;
        return this;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "usuarios=" + usuarios +
                ", personas=" + personas +
                '}';
    }
}
