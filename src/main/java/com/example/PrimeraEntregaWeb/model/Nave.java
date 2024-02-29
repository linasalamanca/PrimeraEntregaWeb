package com.example.PrimeraEntregaWeb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nave")
public class Nave {
    @Id
    private String nombre;
    @Column(name = "dinero", nullable = false)
    private int dinero;
    @Column(name = "coordenadaX", nullable = false)
    private Double coordenadaX;
    @Column(name = "coordenadaY", nullable = false)
    private Double coordenadaY;
    @Column(name = "coordenadaZ", nullable = false)
    private Double coordenadaZ;
    @Column(name = "tiempo", nullable = false)
    private Double tiempo;

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(Double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public Double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(Double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public Double getCoordenadaZ() {
        return coordenadaZ;
    }

    public void setCoordenadaZ(Double coordenadaZ) {
        this.coordenadaZ = coordenadaZ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTiempo() {
        return tiempo;
    }

    public void setTiempo(Double tiempo) {
        this.tiempo = tiempo;
    }

    public Nave(int dinero, Double coordenadaX, Double coordenadaY, Double coordenadaZ, String nombre, Double tiempo) {
        this.dinero = dinero;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.coordenadaZ = coordenadaZ;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
}
