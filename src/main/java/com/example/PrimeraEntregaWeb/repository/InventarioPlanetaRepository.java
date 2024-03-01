package com.example.PrimeraEntregaWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PrimeraEntregaWeb.model.InventarioPlaneta;

//@Repository
public interface InventarioPlanetaRepository extends JpaRepository<InventarioPlaneta, Long> {

}
