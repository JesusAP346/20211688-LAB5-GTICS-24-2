package org.example.lab5_20211688.repository;

import org.example.lab5_20211688.entity.Viajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ViajesRepository extends JpaRepository<Viajes, Integer> {
}
