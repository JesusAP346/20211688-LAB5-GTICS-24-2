package org.example.lab5_20211688.repository;

import org.example.lab5_20211688.entity.Persona;
import org.example.lab5_20211688.entity.Viajes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
