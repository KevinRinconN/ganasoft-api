package com.api.ganasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.ganasoft.models.Treatment;

@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, Long>{
    
}
