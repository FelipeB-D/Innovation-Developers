package edu.udea.main.business;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestorEmpleado {
    @RequestMapping(value = "prueba")
    public String prueba() {
        return "prueba";
    }
}