package com.sofkau.qa.sistematransporte.repository;

import com.sofkau.qa.sistematransporte.repository.modelo.Bus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BusRepository {
    private List<Bus> microBuses;

    public BusRepository() {
        this.microBuses = new ArrayList<>();
    }
    public void registrarMicroBus(Bus bus){
        microBuses.add(bus);
    }

    public void deleteBus(String id){
        microBuses = microBuses.stream().filter(valor -> !valor.id().equals(id)).collect(Collectors.toList());
    }

    public Bus mostrarBusId(String id){
        return microBuses.stream().filter(valor -> valor.id().equals(id)).findFirst().orElse(null);
    }
    public List<Bus> optenerMicro(){
        return microBuses;
    }
}
