package com.example.PrimeraEntregaWeb.model;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jugador")
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rol", nullable = false)
    @NotBlank(message = "no puede estar en blanco")
    private String rol;
    @Column(name = "usuario", nullable = false)
    @NotBlank(message = "no puede estar en blanco")
    private String usuario;
    @Column(name = "contrasena", nullable = false)
    @NotBlank(message = "no puede estar en blanco")
    private String contrasena;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Jugador(String rol, String usuario, String contrasena) {
        this.rol = rol;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Jugador() {

    }
}
