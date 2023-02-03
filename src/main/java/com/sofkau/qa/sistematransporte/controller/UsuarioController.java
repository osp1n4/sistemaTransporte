package com.sofkau.qa.sistematransporte.controller;

import com.sofkau.qa.sistematransporte.repository.modelo.Persona;
import com.sofkau.qa.sistematransporte.repository.modelo.Ticket;
import com.sofkau.qa.sistematransporte.repository.modelo.Usuario;
import com.sofkau.qa.sistematransporte.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/lista")
public class UsuarioController {

    List<Persona> usuarios = new ArrayList<>();

    @Autowired
    private IPersonaService usuarioService;

    @GetMapping("/mostrar")
    public ResponseEntity getTraerPasajero(){
        return new ResponseEntity(usuarioService.mostrarPasajeros(), HttpStatus.FOUND);
    }

    @PostMapping()
    public ResponseEntity listarPasajeros(@RequestBody Persona persona){
        return new ResponseEntity(usuarioService.agregarPasajero(persona),HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity updateUsuario(@PathVariable("ccPasajero") String cc, @RequestBody Persona persona){
        List<Persona> nuevoPasajero = usuarios.stream().filter(pasajero -> !pasajero.cc().equals(cc)).collect(Collectors.toList());
        this.usuarios =nuevoPasajero;
        return new ResponseEntity(persona, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{ccPasajero}")
    public ResponseEntity deletePasajero(@PathVariable("ccPasajero") String cc){
        List<Persona> delete = usuarios.stream().filter(pasajero -> !pasajero.cc().equals(cc)).collect(Collectors.toList());
        this.usuarios = delete;
        return new ResponseEntity(usuarios, HttpStatus.GONE);

    }
}
