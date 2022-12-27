package com.ibmloginrimac.demo.model;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "Siniestro")
public class Siniestro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Siniestro")
    private Long id;

    @Column(name="Nombre")
	private String nombre;

    @Column(name="Descripcion")
	private String descripcion;

    @Column(name = "Fecha_Ocurrida")
    private LocalDate fechaOcurrida;

    public Siniestro(Long id, String nombre, String descripcion, LocalDate fechaOcurrida) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaOcurrida = fechaOcurrida;
    }

    public Siniestro() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaOcurrida() {
        return fechaOcurrida;
    }

    public void setFechaOcurrida(LocalDate fechaOcurrida) {
        this.fechaOcurrida = fechaOcurrida;
    }
}
