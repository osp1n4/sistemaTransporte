package com.sofkau.qa.sistematransporte.controller;

import com.sofkau.qa.sistematransporte.repository.modelo.Persona;
import com.sofkau.qa.sistematransporte.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioContrller {

    @Autowired
    private PersonaService personaService;

    public UsuarioContrller(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/mostrarLista")
    public ResponseEntity mostrarLista() {
        return new ResponseEntity(personaService.registroPersona(), HttpStatus.FOUND);
    }

    @DeleteMapping("/{idPersona}")
    public ResponseEntity<Void> eliminarPasajero(@PathVariable String id) {
        personaService.deleteUsario(id);
        return null;
    }

    @PostMapping
    public ResponseEntity<Persona> registrarPersona(@RequestBody Persona persona) {
        this.personaService.registrarUsuario(persona);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public ResponseEntity<Void> updateUsuario(@RequestBody Persona persona) {
        personaService.updateUsuario(persona);
        return null;

    }

}

