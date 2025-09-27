package com.example.parcial2.servicios;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.repositorios.IDetalleCineRepositorio;

@Service
public class ServicioDetalleCine {

    private final IDetalleCineRepositorio detalleCineRepositorio;

    public ServicioDetalleCine(IDetalleCineRepositorio detalleCineRepositorio) {
        this.detalleCineRepositorio = detalleCineRepositorio;
    }

    @Transactional
    public DetalleCine guardar(DetalleCine detalle) {
        return detalleCineRepositorio.save(detalle);
    }
}
