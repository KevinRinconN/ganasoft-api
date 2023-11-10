package com.api.ganasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.ganasoft.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
