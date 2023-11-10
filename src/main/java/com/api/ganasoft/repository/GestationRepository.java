package com.api.ganasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.ganasoft.models.Gestation;

@Repository
public interface GestationRepository extends JpaRepository<Gestation, Long>{
    
}
