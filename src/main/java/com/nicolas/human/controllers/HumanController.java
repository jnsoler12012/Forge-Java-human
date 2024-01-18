package com.nicolas.human.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
    @RequestMapping("/{name}/{lastName}")
    public String helloHuman(@PathVariable("name") String name, @PathVariable("lastName") String lastName){
        String nameFinal = "Human";
        String lastNameFinal = "Last Name";

        if(name != null && name != ""){
            nameFinal = name;
        }
        if(lastName != null && lastName != ""){
            lastNameFinal = lastName;
        }

        return "Hello " + nameFinal + " " + lastNameFinal + " \n Welcome to Spring Boot!";
    }
}
