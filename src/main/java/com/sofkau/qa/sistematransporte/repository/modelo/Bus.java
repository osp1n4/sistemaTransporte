package com.sofkau.qa.sistematransporte.repository.modelo;

import java.util.Calendar;


public class Bus {
    private String tipoBus;
    private int cupo;

    private Calendar horarioSalida;

    public Bus(String tipoBus, int cupo, Calendar horarioSalida) {
        this.tipoBus = tipoBus;
        this.cupo = cupo;
        this.horarioSalida = horarioSalida;

    }

    public String tipoBus() {
        return tipoBus;
    }

    public Bus setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
        return this;
    }

    public int cupo() {
        return cupo;
    }

    public Bus setCupo(int cupo) {
        this.cupo = cupo;
        return this;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "tipoBus='" + tipoBus + '\'' +
                ", cupo=" + cupo +
                '}';
    }
}
