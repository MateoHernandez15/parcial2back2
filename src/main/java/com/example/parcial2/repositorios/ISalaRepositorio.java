package com.example.parcial2.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.parcial2.modelos.Sala;

@Repository
public interface ISalaRepositorio extends JpaRepository<Sala, Long> {

    List<Sala> findByCapacidadGreaterThan(Integer capacidad);

    Sala findByNombre(String nombre);
}
