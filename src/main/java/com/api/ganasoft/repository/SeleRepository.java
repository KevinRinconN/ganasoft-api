package com.api.ganasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.ganasoft.models.Sele;

@Repository
public interface SeleRepository extends JpaRepository<Sele, Long> {
    
}
