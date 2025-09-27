package com.example.parcial2.modelos;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name = "cines")
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column
    private String direccion;

    @OneToMany(mappedBy = "cine", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Sala> salas = new ArrayList<>();

    @OneToOne(mappedBy = "cine", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private DetalleCine detalle;

    public Cine() {}

    public Cine(Long id, String nombre, String direccion, List<Sala> salas, DetalleCine detalle) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.salas = salas;
        this.detalle = detalle;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public List<Sala> getSalas() { return salas; }
    public void setSalas(List<Sala> salas) { this.salas = salas; }

    public DetalleCine getDetalle() { return detalle; }
    public void setDetalle(DetalleCine detalle) { this.detalle = detalle; }
}
