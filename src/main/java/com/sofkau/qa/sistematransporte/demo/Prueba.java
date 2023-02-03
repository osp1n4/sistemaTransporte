package com.sofkau.qa.sistematransporte.demo;

import com.sofkau.qa.sistematransporte.repository.modelo.Persona;

public class Prueba {
    public static void main(String[] args) {
        var usuario = new Persona("1093216364","Antonio","Ospina",31473212,40,"Santa");
        System.out.println(usuario.toString());

        var usuario2 = new Persona("1093216364","Antonio","Ospina",31473212,40,"Santa");
        System.out.println(usuario2.toString());
    }
}
