package com.sofkau.qa.sistematransporte.repository.modelo;

public class TransporteBus {
    private  int pasajero;
    private String destino;

    public TransporteBus(int pasajero, String destino) {
        this.pasajero = pasajero;
        this.destino = destino;
    }

    public int capacidadBus() {
        return pasajero;
    }

    public TransporteBus setPasajero(int pasajero) {
        this.pasajero = pasajero;
        return this;
    }

    public String destino() {
        return destino;
    }

    public TransporteBus setDestino(String destino) {
        this.destino = destino;
        return this;
    }

    public int  sillasVacias(int puesto){
        puesto = 40;
        int puestoDisponible =40 - this.pasajero;
        return puestoDisponible;
    }
    @Override
    public String toString() {
        return "\nTransporteBus terrestre" +
                "\nCapacidad de usuario en el Bus: " + pasajero +
                "\nDestino: " + destino;
    }


}