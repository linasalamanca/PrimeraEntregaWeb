package com.example.PrimeraEntregaWeb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.PrimeraEntregaWeb.model.Nave;
import com.example.PrimeraEntregaWeb.repository.NaveRepository;

public class NaveService {
     @Autowired
    private NaveRepository naveRepositorio;

    public List<Nave> listarNaves(){
        return naveRepositorio.findAll();
    }

    public Nave buscarNave(String nombre){
        return naveRepositorio.findById(nombre).orElseThrow();
    }

    public void guardarNave(Nave navecita){
        naveRepositorio.save(navecita);
    }

    public void eliminarNave(String navecita){
        naveRepositorio.deleteById(navecita);
    }
}
s