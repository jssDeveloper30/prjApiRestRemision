package com.JRE.biblioteca.controller;

import com.JRE.biblioteca.entity.Remision;
import com.JRE.biblioteca.service.RemisionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemisionController {
    private final RemisionService remisionService;

    public RemisionController(RemisionService remisionService) {
        this.remisionService = remisionService;
    }

    //localhost:8080/create
    @PostMapping("/create")
    public Remision save(@RequestBody Remision remision) {
        return remisionService.save(remision);
    }
}
