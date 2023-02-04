package com.sofkau.qa.sistematransporte.repository.modelo;

import java.util.Objects;

public class TransporteBus {
    private  String id;
    private String destino;

    public TransporteBus() {
    }

    public TransporteBus(String id, String destino) {
        this.id = id;
        this.destino = destino;
    }

    public String id() {
        return id;
    }

    public TransporteBus setId(String id) {
        this.id = id;
        return this;
    }

    public String destino() {
        return destino;
    }

    public TransporteBus setDestino(String destino) {
        this.destino = destino;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransporteBus)) return false;
        TransporteBus that = (TransporteBus) o;
        return id.equals(that.id) && destino.equals(that.destino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, destino);
    }

    public String toString() {
        return "\nTransporteBus terrestre" +
                "\n Id: " + id +
                "\nDestino: " + destino;
    }


}