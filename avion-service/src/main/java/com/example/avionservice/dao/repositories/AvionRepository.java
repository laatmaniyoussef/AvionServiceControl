package com.example.avionservice.dao.repositories;

import com.example.avionservice.dao.entities.Avion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvionRepository extends JpaRepository<Avion, Long> {
}
