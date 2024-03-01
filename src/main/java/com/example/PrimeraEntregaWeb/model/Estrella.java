package com.example.PrimeraEntregaWeb.model;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estrella {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "coordenadaX", nullable = false)
    @NotBlank(message = "no puede estar en blanco")
    private Float coordenadaX;
    @Column(name = "coordenadaY", nullable = false)
    @NotBlank(message = "no puede estar en blanco")
    private Float coordenadaY;

    public Float getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(Float coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public Float getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(Float coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public Estrella(Float coordenadaX, Float coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
}
