package com.ibmloginrimac.demo.model;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "Cobros")
public class Cobros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Cobro")
    private Long id;
    @OneToOne
	@JoinColumn(name = "Fid_Usuario", insertable = false , updatable = false)
    private Usuario usuario;
    @OneToOne
	@JoinColumn(name = "Fid_Siniestro", insertable = false , updatable = false)
    private Siniestro siniestro;
    @OneToOne
	@JoinColumn(name = "Fid_Seguro", insertable = false , updatable = false)
    private Seguro seguro;
    @Column(name = "Fecha_Emision")
    private LocalDate fechaEmision;
    @Column(name = "Fecha_Cobro")
    private LocalDate fechaCobro;
    @Column(name = "Modalidad_Cobro")
    private String modalidadCobro;

    public Cobros() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Siniestro getSiniestro() {
        return siniestro;
    }
    public void setSiniestro(Siniestro siniestro) {
        this.siniestro = siniestro;
    }
    public Seguro getSeguro() {
        return seguro;
    }
    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }
    public LocalDate getFechaEmision() {
        return fechaEmision;
    }
    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    public LocalDate getFechaCobro() {
        return fechaCobro;
    }
    public void setFechaCobro(LocalDate fechaCobro) {
        this.fechaCobro = fechaCobro;
    }
    public LocalDate getModalidadCobro() {
        return modalidadCobro;
    }
    public void setModalidadCobro(LocalDate modalidadCobro) {
        this.modalidadCobro = modalidadCobro;
    }
    
    
}
