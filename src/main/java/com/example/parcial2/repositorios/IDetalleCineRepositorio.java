package com.example.parcial2.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.parcial2.modelos.DetalleCine;

@Repository
public interface IDetalleCineRepositorio extends JpaRepository<DetalleCine, Long> {

    List<DetalleCine> findByCiudadIgnoreCase(String ciudad);
}
