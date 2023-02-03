package com.sofkau.qa.sistematransporte.service;

import com.sofkau.qa.sistematransporte.repository.modelo.Persona;
import com.sofkau.qa.sistematransporte.repository.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class UsuarioService implements IPersonaService{

    @Autowired
    private Usuario usuario;

    @Override
    public List<Persona> mostrarPasajeros() {
        return null;
    }
    //persona.cc() me muestra error al a
    @Override
    public Persona agregarPasajero(Persona persona) {
        Persona pasajero = new Persona(UUID.randomUUID().toString(),persona.nombre(),
                persona.apellido(),persona.telefono(),persona.capacidadBus(),persona.destino());
        return null;
    }
}
