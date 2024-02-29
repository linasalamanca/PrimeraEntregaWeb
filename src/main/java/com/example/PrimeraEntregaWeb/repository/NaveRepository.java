package com.example.PrimeraEntregaWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.PrimeraEntregaWeb.model.Nave;

public interface NaveRepository extends JpaRepository<Nave, String> {

}