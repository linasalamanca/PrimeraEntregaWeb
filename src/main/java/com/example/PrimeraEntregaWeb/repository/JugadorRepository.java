package com.example.PrimeraEntregaWeb.repository;

import com.example.PrimeraEntregaWeb.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {

}
