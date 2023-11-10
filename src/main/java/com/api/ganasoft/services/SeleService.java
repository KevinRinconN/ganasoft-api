package com.api.ganasoft.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ganasoft.models.Gestation;
import com.api.ganasoft.models.Sele;
import com.api.ganasoft.repository.GestationRepository;
import com.api.ganasoft.repository.SeleRepository;

@Service
public class SeleService {

    @Autowired
    SeleRepository seleRepository;

    public List<Sele> getSeles(){
        return seleRepository.findAll();
    }

    public Optional<Sele> getSele(Long id){
        return seleRepository.findById(id);
    }

    public Sele saveSele (Sele sele){
        seleRepository.save(sele);
        return sele;
    }

    public void delete (Long id){
        seleRepository.deleteById(id);
    }
}
