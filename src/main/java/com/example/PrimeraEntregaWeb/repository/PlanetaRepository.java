package com.example.PrimeraEntregaWeb.repository;

import com.example.PrimeraEntregaWeb.model.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetaRepository extends JpaRepository<Planeta, String> {

}
