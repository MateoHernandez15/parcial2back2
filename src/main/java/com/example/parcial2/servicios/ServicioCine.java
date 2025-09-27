package com.example.parcial2.servicios;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.parcial2.modelos.Cine;
import com.example.parcial2.repositorios.ICineRepositorio;

@Service
public class ServicioCine {

    private final ICineRepositorio cineRepositorio;

    public ServicioCine(ICineRepositorio cineRepositorio) {
        this.cineRepositorio = cineRepositorio;
    }

    @Transactional
    public Cine guardar(Cine cine) {
        return cineRepositorio.save(cine);
    }
}
