package com.example.parcial2.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_cine")
public class DetalleCine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String direccion;

    @Column
    private String telefono;

    @Column
    private String ciudad;

    @OneToOne
    @JoinColumn(name = "cine_id", unique = true)
    @JsonBackReference
    private Cine cine;

    public DetalleCine() {}

    public DetalleCine(Long id, String direccion, String telefono, String ciudad, Cine cine) {
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.cine = cine;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public Cine getCine() { return cine; }
    public void setCine(Cine cine) { this.cine = cine; }
}
