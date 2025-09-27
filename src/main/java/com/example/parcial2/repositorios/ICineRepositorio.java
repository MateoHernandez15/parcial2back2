package com.example.parcial2.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.parcial2.modelos.Cine;

@Repository
public interface ICineRepositorio extends JpaRepository<Cine, Long> {

    List<Cine> findByNombreContainingIgnoreCase(String nombre);
}
