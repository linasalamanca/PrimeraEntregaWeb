package com.example.PrimeraEntregaWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PrimeraEntregaWeb.model.InventarioNave;

//@Repository
public interface InventarioNaveRepository extends JpaRepository<InventarioNave, Long> {

}
