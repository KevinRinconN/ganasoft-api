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

// import com.api.ganasoft.models.Cattle;
import com.api.ganasoft.models.Client;
import com.api.ganasoft.services.ClientService;

// import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(path = "/api/client")
public class ClientController {
    
    @Autowired
    ClientService clientService;

     @GetMapping
    public List<Client> getAll(){
        return clientService.getClients();
    } 

    @PostMapping
    public void save (@RequestBody Client client) {
        clientService.saveClient(client);
    }

    @PutMapping("/{id}")
    public void save (@PathVariable Long id, @RequestBody Client client) {
        clientService.saveClient(client);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id) {
        clientService.delete(id);
    }
}
