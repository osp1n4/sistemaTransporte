package com.sofkau.qa.sistematransporte.service;

import com.sofkau.qa.sistematransporte.repository.modelo.Persona;
import com.sofkau.qa.sistematransporte.repository.modelo.Usuario;

import java.util.List;

public interface IPersonaService {
    void deleteUsario(String id);
    void registrarUsuario(Persona persona);
    void updateUsuario(Persona persona);
    List<Persona> registroPersona();
}
