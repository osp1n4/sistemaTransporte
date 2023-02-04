package com.sofkau.qa.sistematransporte.repository;

import com.sofkau.qa.sistematransporte.repository.modelo.TransporteBus;

import java.util.List;

public interface ITransporteDestinoRepository {

    void registrarDestino(TransporteBus transporteBus);
    void updateDestino(TransporteBus transporteBus);

    void delete(String id);

    List<TransporteBus> destino();

}