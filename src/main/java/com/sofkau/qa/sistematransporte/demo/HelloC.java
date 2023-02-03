package com.sofkau.qa.sistematransporte.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
public class HelloC {

    @GetMapping("/hello")
    public String hel(){
        return "Hola antonio";
    }
}
