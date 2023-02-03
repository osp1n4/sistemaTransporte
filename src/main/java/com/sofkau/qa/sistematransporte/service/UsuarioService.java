package com.sofkau.qa.sistematransporte.service;

import com.sofkau.qa.sistematransporte.repository.modelo.Bus;
import com.sofkau.qa.sistematransporte.repository.modelo.Persona;
import com.sofkau.qa.sistematransporte.repository.modelo.Ticket;
import com.sofkau.qa.sistematransporte.repository.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class UsuarioService implements IPersonaService{

    @Autowired
    private Ticket ticket;



    @Override
    public List<Usuario> mostrarPasajeros() {
        return ticket.mostrarUsuarios();
    }

    @Override
    public Usuario agregarUsuario(Usuario usuario) {
       // ticket.agregarPasajero(usuario);
        //Persona pasajero = new Usuario(UUID.randomUUID().toString(),usuario.setPersonas(new Persona()).setCc()));
        return null;
    }


    @Override
    public Persona agregarPasajero(Persona persona) {
        Persona pasajero = new Persona(UUID.randomUUID().toString(),persona.nombre(),
                persona.apellido(),persona.telefono(),persona.capacidadBus(),persona.destino());
        return null;
         }

}
