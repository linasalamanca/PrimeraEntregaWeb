package com.example.PrimeraEntregaWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PrimeraEntregaWeb.model.TipoNave;

//@Repository
public interface TipoNaveRepository extends JpaRepository<TipoNave, Long> {

}
