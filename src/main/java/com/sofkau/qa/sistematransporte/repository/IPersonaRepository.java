package com.sofkau.qa.sistematransporte.repository;

import com.sofkau.qa.sistematransporte.repository.modelo.Persona;

import java.util.List;

public interface IPersonaRepository {
    void usuario();
    List<Persona> mostrarUsuario();
    void registrarUsuario(Persona persona);
}
