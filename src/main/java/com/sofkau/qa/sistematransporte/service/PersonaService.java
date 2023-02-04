package com.sofkau.qa.sistematransporte.service;

import com.sofkau.qa.sistematransporte.repository.PersonaRepository;
import com.sofkau.qa.sistematransporte.repository.modelo.Persona;
import com.sofkau.qa.sistematransporte.repository.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service

public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public void registrarUsuario(Persona persona) {
        personaRepository.registrarUsuario(persona);
    }

    @Override
    public void updateUsuario(Persona persona) {
        personaRepository.updateUsuario(persona);
    }

    @Override
    public List<Persona> registroPersona() {
        return personaRepository.traerPersonas();
    }
    @Override
    public void deleteUsario(String id){
        personaRepository.deleteUsuario(id);
    }
}
