package com.sofkau.qa.sistematransporte.service;

import com.sofkau.qa.sistematransporte.repository.BusRepository;
import com.sofkau.qa.sistematransporte.repository.modelo.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {

    @Autowired
    private BusRepository microBusRepository;


    public void registrarNuevoBus(Bus microBus) {
        microBusRepository.registrarMicroBus(microBus);
    }


    public void updateBus(Bus microBus) {
        microBusRepository.optenerMicro();
    }


    public List<Bus> registrosBuses() {
        return microBusRepository.optenerMicro();
    }

    public void deleteBuses(String id){
        microBusRepository.deleteBus(id);
    }
}
