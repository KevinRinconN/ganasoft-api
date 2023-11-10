package com.api.ganasoft.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ganasoft.models.Cattle;
import com.api.ganasoft.repository.CattleRepository;

@Service
public class CattleService {
    
    @Autowired
    CattleRepository cattleRepository;

    public List<Cattle> getCattles(){
        return cattleRepository.findAll();
    }

    public Optional<Cattle> getCattle(Long id){
        return cattleRepository.findById(id);
    }

    public Cattle saveCattle (Cattle cattle){
        cattleRepository.save(cattle);
        return cattle;
    }

    public void delete (Long id){
        cattleRepository.deleteById(id);
    }
}
