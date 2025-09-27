package com.example.parcial2.servicios;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.parcial2.modelos.Sala;
import com.example.parcial2.repositorios.ISalaRepositorio;

@Service
public class ServicioSala {

    private final ISalaRepositorio salaRepositorio;

    public ServicioSala(ISalaRepositorio salaRepositorio) {
        this.salaRepositorio = salaRepositorio;
    }

    @Transactional
    public Sala guardar(Sala sala) {
        return salaRepositorio.save(sala);
    }
}
