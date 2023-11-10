package com.api.ganasoft.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ganasoft.models.Cattle;
import com.api.ganasoft.models.Gestation;
import com.api.ganasoft.repository.CattleRepository;
import com.api.ganasoft.repository.GestationRepository;

@Service
public class GestationService {
    @Autowired
    GestationRepository gestationRepository;

    public List<Gestation> getGestations(){
        return gestationRepository.findAll();
    }

    public Optional<Gestation> getGestation(Long id){
        return gestationRepository.findById(id);
    }

    public Gestation saveGestation (Gestation gestation){
        gestationRepository.save(gestation);
        return gestation;
    }

    public void delete (Long id){
        gestationRepository.deleteById(id);
    }
}
