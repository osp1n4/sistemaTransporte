package com.sofkau.qa.sistematransporte.controller;

import com.sofkau.qa.sistematransporte.repository.modelo.Persona;
import com.sofkau.qa.sistematransporte.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/rest")
public class UsuarioController {

    @Autowired
    private IPersonaService usuarioService;

    @GetMapping("/bring/all")
    public ResponseEntity getTraerPasajero(){
        return new ResponseEntity(usuarioService.mostrarPasajeros(), HttpStatus.FOUND);
    }

    @PostMapping()
    public ResponseEntity listarPasajeros(@RequestBody Persona persona){
        return new ResponseEntity(usuarioService.agregarPasajero(persona),HttpStatus.CREATED);
    }
}
