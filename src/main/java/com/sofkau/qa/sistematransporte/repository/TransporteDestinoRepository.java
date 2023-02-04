package com.sofkau.qa.sistematransporte.repository;

import com.sofkau.qa.sistematransporte.repository.modelo.TransporteBus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TransporteDestinoRepository implements ITransporteDestinoRepository{
    private List<TransporteBus> destinoFinal;


    public TransporteDestinoRepository(){
        this.destinoFinal = new ArrayList<>();
    }

    @Override
    public void registrarDestino(TransporteBus transporteBus) {

        destinoFinal.add(transporteBus);
    }

    @Override
    public void updateDestino(TransporteBus transporteBus) {
        destinoFinal = destinoFinal.stream().map(informacion -> informacion.id().equals(informacion.id()) ? transporteBus:informacion).collect(Collectors.toList());
    }

    @Override
    public void delete(String id) {
        destinoFinal = destinoFinal.stream().filter(destino ->!destino.id().equals(id)).collect(Collectors.toList());

    }

    @Override
    public List<TransporteBus> destino() {
        return destinoFinal;
    }
}
