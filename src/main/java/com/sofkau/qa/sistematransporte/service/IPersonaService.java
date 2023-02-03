package com.sofkau.qa.sistematransporte.service;

import com.sofkau.qa.sistematransporte.repository.modelo.Persona;
import com.sofkau.qa.sistematransporte.repository.modelo.Ticket;
import com.sofkau.qa.sistematransporte.repository.modelo.Usuario;

import java.util.List;

public interface IPersonaService {




    List<Usuario> mostrarPasajeros();
    Usuario agregarUsuario(Usuario usuario);

    Persona agregarPasajero(Persona persona);
}
