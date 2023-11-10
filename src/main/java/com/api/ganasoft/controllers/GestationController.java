package com.api.ganasoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ganasoft.models.Client;
import com.api.ganasoft.models.Gestation;
import com.api.ganasoft.services.ClientService;
import com.api.ganasoft.services.GestationService;

@RestController
@RequestMapping(path = "/api/gestation")
public class GestationController {
    @Autowired
    GestationService gestationService;

     @GetMapping
    public List<Gestation> getAll(){
        return gestationService.getGestations();
    } 

    @PostMapping
    public void save (@RequestBody Gestation gestation) {
        gestationService.saveGestation(gestation);
    }

    @PutMapping("/{id}")
    public void save (@PathVariable Long id, @RequestBody Gestation gestation) {
        gestationService.saveGestation(gestation);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id) {
        gestationService.delete(id);
    }
}
