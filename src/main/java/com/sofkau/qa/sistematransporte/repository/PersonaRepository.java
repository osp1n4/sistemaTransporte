package com.sofkau.qa.sistematransporte.repository;

import com.sofkau.qa.sistematransporte.repository.modelo.Persona;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonaRepository implements IPersonaRepository {
    List<Persona> personas;

    public PersonaRepository() {
        this.personas = new ArrayList<>();
    }

    public List<Persona> traerPersonas(){
        return personas;
    }
    public void deleteUsuario(String id){
        personas = personas.stream().filter(persona -> !persona.id().equals(id)).collect(Collectors.toList());

    }

    @Override
    public void usuario() {
        this.personas = new ArrayList<>();

    }

    @Override
    public List<Persona> mostrarUsuario() {
        return personas;
    }

    @Override
    public void registrarUsuario(Persona persona) {
        personas.add(persona);

    }
    public void updateUsuario(Persona persona){
        personas = personas.stream().map(usuario ->{
            if(usuario.id().equals(persona.id())){
                return persona;
            }
            return usuario;
        }).collect(Collectors.toList());
    }
}

