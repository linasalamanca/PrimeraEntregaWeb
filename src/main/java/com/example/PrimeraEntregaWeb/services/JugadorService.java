package com.example.PrimeraEntregaWeb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PrimeraEntregaWeb.model.Jugador;
import com.example.PrimeraEntregaWeb.model.Nave;
import com.example.PrimeraEntregaWeb.repository.JugadorRepository;
import com.example.PrimeraEntregaWeb.repository.NaveRepository;

import io.micrometer.common.lang.NonNull;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepositorio;

    public List<Jugador> listarJugadores() {
        return jugadorRepositorio.findAll();
    }

    @SuppressWarnings("null")
    public Jugador buscarJugador(@NonNull Long id) {
        return jugadorRepositorio.findById(id).orElseThrow();
    }

    @SuppressWarnings("null")
    public void guardarJugador(Jugador jugador) {
        jugadorRepositorio.save(jugador);
    }

    @SuppressWarnings("null")
    public void eliminarJugador(Long id) {
        jugadorRepositorio.deleteById(id);
    }
}
