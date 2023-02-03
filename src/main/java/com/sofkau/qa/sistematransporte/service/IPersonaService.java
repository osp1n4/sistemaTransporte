package com.sofkau.qa.sistematransporte.service;

import com.sofkau.qa.sistematransporte.repository.modelo.Persona;
import com.sofkau.qa.sistematransporte.repository.modelo.Usuario;

import java.util.List;

public interface IPersonaService {



    Persona agregarPasajero(Persona persona);
    List<Persona> mostrarPasajeros();
}
