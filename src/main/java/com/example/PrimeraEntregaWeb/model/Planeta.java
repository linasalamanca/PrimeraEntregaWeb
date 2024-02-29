package com.example.PrimeraEntregaWeb.model;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Planeta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false)
    @NotBlank(message = "no puede estar en blanco")
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Planeta(String nombre) {
        this.nombre = nombre;
    }
}