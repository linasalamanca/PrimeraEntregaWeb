package com.example.PrimeraEntregaWeb.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.PrimeraEntregaWeb.model.Jugador;
import com.example.PrimeraEntregaWeb.model.Nave;
import com.example.PrimeraEntregaWeb.services.JugadorService;
import com.example.PrimeraEntregaWeb.services.NaveService;

@Controller
@RequestMapping("/jugador")
public class JugadorController {

    @Autowired
    private JugadorService jugadorServicio;

    @GetMapping("/list")
    public String listarJugadores(Model model) {
        List<Jugador> jugador = jugadorServicio.listarJugadores();
        model.addAttribute("jugador", jugador);
        return "jugador-list";
    }

    @GetMapping("/view/{id}")
    String verJugadores(Model model, @PathVariable("id") Long id) {
        Jugador jugador = jugadorServicio.buscarJugador(id);
        model.addAttribute("jugador", jugador);
        return "jugador-view";
    }

    @GetMapping("/edit-form/{id}")
    public String formularioEditarJugador(Model model, @PathVariable Long id) {
        Jugador jugador = jugadorServicio.buscarJugador(id);
        model.addAttribute("jugador", jugador);
        return "jugador-edit";
    }

    @PostMapping(value = "/save")
    public String guadarJugador(@Valid Jugador jugador, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "jugador-edit";
        }
        jugadorServicio.guardarJugador(jugador);
        return "redirect:/jugador/list";
    }

}
