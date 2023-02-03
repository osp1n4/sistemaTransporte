package com.sofkau.qa.sistematransporte.repository.modelo;


import java.util.List;


import java.util.List;

public class Usuario {

    private Bus bus;
    //private Persona persona;
    private List<Persona> personas;

    public Usuario(List<Persona> personas, Bus bus){
        this.personas = personas;
        this.bus = bus;

    }
    /*
    public Usuario() {
        personas = new ArrayList<>(List.of(new Persona( "6666897","Antonio", "Ospina", 314732127, 40, "Pereira"),
                new Persona( "768575","Elia", "Maertinez", 3447575, 40, "Preira"),
        new Persona("876556", "Angelica", "Mendez", 3352922, 40, "Chinchina"),
        new Persona( "78221111","Yarlediz", "Zuñiga", 3477777, 40, "Medellin"),
        new Persona( "90099987","Maria", "Ospina", 3447005, 40, "Preira")

        ));
    }
    public void cupoSillas(String cc){
        List<Persona> pasajeros = personas.stream().map(pasajero ->{
            if(pasajero.cc().equals(cc)){
                pasajero.sillasVacias(40);
                return pasajero;
            }
            return pasajero;
        }).collect(Collectors.toList());
    }
    public void agregarPasajero(Persona persona){
        personas.add(persona);
    }
    public List<Persona> getPersonas(){
        return personas;
    }
    public void setPersonas(List<Persona> personas){
        this.personas = personas;
    }
*/

    public Bus bus() {
        return bus;
    }

    public Usuario setBus(Bus bus) {
        this.bus = bus;
        return this;
    }


    public List<Persona> personas() {
        return personas;
    }

    public Usuario setPersonas(List<Persona> personas) {
        this.personas = personas;
        return this;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "bus=" + bus +
                ", persona1=" + personas+
                '}';
    }
}
