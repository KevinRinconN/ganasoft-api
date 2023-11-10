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

import com.api.ganasoft.models.Gestation;
import com.api.ganasoft.models.Sele;
import com.api.ganasoft.services.GestationService;
import com.api.ganasoft.services.SeleService;

@RestController
@RequestMapping(path = "/api/sele")
public class SeleController {
    @Autowired
    SeleService seleService;

     @GetMapping
    public List<Sele> getAll(){
        return seleService.getSeles();
    } 

    @PostMapping
    public void save (@RequestBody Sele sele) {
        seleService.saveSele(sele);
    }

    @PutMapping("/{id}")
    public void save (@PathVariable Long id, @RequestBody Sele sele) {
        seleService.saveSele(sele);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id) {
        seleService.delete(id);
    }
}
