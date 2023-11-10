package com.api.ganasoft.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.ganasoft.models.Sele;
import com.api.ganasoft.models.Treatment;
import com.api.ganasoft.repository.SeleRepository;
import com.api.ganasoft.repository.TreatmentRepository;

public class TreatmentService {
     @Autowired
    TreatmentRepository treatmentRepository;

    public List<Treatment> getTreatments(){
        return treatmentRepository.findAll();
    }

    public Optional<Treatment> getTreatment(Long id){
        return treatmentRepository.findById(id);
    }

    public Treatment saveTreatment (Treatment treatment){
        treatmentRepository.save(treatment);
        return treatment;
    }

    public void delete (Long id){
        treatmentRepository.deleteById(id);
    }
}
