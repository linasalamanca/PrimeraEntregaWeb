package com.example.PrimeraEntregaWeb.model;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Producto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "volumen", nullable = false)
    @NotBlank(message = "no puede estar en blanco")
    private Float volumen;
    @Column(name = "tipo", nullable = false)
    @NotBlank(message = "no puede estar en blanco")
    private String tipo;

    public Float getVolumen() {
        return volumen;
    }

    public void setVolumen(Float volumen) {
        this.volumen = volumen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Producto(Float volumen, String tipo) {
        this.volumen = volumen;
        this.tipo = tipo;
    }
}
