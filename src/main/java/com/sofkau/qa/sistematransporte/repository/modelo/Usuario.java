package com.sofkau.qa.sistematransporte.repository.modelo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class Usuario {
    private List<Persona> personas;

    public Usuario() {
        personas = new ArrayList<>(List.of(new Persona("109323344", "Antonio", "Ospina", 314732127, 40, "Pereira"),
                new Persona("26344354", "Elia", "Maertinez", 3447575, 40, "Preira"),
        new Persona("263443", "Angelica", "Mendez", 3352922, 40, "Chinchina"),
        new Persona("2654778", "Yarlediz", "Zuñiga", 3477777, 40, "Medellin"),
        new Persona("265785388", "Maria", "Ospina", 3447005, 40, "Preira")

        ));
    }
    public void cupoSillas(String cc){
        List<Persona> pasajeros = personas.stream().map(pasajero ->{
            if(pasajero.cc().equals(cc)){
                pasajero.sillasVacias(40);
                return pasajero;
            }
            return pasajero;
        }).collect(Collectors.toList());
    }
    public void agregarPasajero(Persona persona){
        personas.add(persona);
    }
    public List<Persona> getPersonas(){
        return personas;
    }
    public void setPersonas(List<Persona> personas){
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "personas=" + personas +
                '}';
    }
}
