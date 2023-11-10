package com.api.ganasoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.validation.BindingResult;
// import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ganasoft.models.Cattle;
import com.api.ganasoft.services.CattleService;

@RestController
@RequestMapping(path = "/api/cattle")
public class CattleController {
    
    @Autowired
    CattleService cattleService;

    @GetMapping
    public List<Cattle> getAll(){
        return cattleService.getCattles();
    } 

    @PostMapping
    public void save (@PathVariable Long cattle) {
        
    }

    // @PostMapping
    // public ResponseEntity<Cattle> save (@Validated @RequestBody Cattle cattle, BindingResult bindingResult) {
    //     if (bindingResult.hasErrors()) {
    //         return ResponseEntity.badRequest().body(null); // Otra opción es devolver un ResponseEntity con HttpStatus.BAD_REQUEST
    //     }
        
    //     try {
    //         Cattle savedCattle = cattleService.saveCattle(cattle);
    //         return ResponseEntity.status(HttpStatus.CREATED).body(savedCattle);
    //     } catch (Exception ex) {
    //         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null); // Otra opción es devolver un ResponseEntity con HttpStatus.INTERNAL_SERVER_ERROR
    //     }
    // }
}
