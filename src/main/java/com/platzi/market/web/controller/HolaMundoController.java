package com.platzi.market.web.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class HolaMundoController {

    @GetMapping("/hola")
    public String saludar() {
        return "Hola mundo en Spring Boot";
    }
}
