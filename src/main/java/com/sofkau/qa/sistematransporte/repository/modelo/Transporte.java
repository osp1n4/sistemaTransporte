package com.sofkau.qa.sistematransporte.repository.modelo;

public class Transporte {
    private  int pasajero;
    private String destino;

    public Transporte(int pasajero, String destino) {
        this.pasajero = pasajero;
        this.destino = destino;
    }

    public int capacidadBus() {
        return pasajero;
    }

    public Transporte setPasajero(int pasajero) {
        this.pasajero = pasajero;
        return this;
    }

    public String destino() {
        return destino;
    }

    public Transporte setDestino(String destino) {
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
        return "\nTransporte terrestre" +
                "\nCapacidad de usuario en el Bus: " + pasajero +
                "\nDestino: " + destino;
    }


}
