package com.sofkau.qa.sistematransporte.controller;

import com.sofkau.qa.sistematransporte.repository.modelo.Bus;
import com.sofkau.qa.sistematransporte.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/v1/bus")
public class BusController {

    @Autowired
    private BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping("/lista")
    public ResponseEntity obtenerBuses() {
        return new ResponseEntity(busService.registrosBuses(), HttpStatus.FOUND);
    }

    @PutMapping("/update")
    public ResponseEntity<Void> actualizarBus(@RequestBody Bus bus) {
        busService.updateBus(bus);
        return null;
    }

    @PostMapping
    public ResponseEntity<Bus> guardar(@RequestBody Bus bus) {
        busService.registrarNuevoBus(bus);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/{idBus}")
    public ResponseEntity<Void> eliminarBus(@PathVariable String id) {
        busService.deleteBuses(id);
        return null;
    }
}
