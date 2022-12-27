package com.ibmloginrimac.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Direccion")
    private Long id;

	@OneToOne
	@JoinColumn(name = "Fid_Distrito", insertable = false , updatable = false)
	private Distrito distrito;

	@OneToOne
	@JoinColumn(name = "Fid_Departamento", insertable = false , updatable = false)
	private Departamento departamento;

    @OneToOne
	@JoinColumn(name = "Fid_Persona", insertable = false , updatable = false)
	private Persona persona;
    
    @Column(name="Detalle")
    private String detalle;

    @Column(name="Numero_Domicilio")
    private Integer numeroDomicilio;
    
    public Direccion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getNumeroDomicilio() {
        return numeroDomicilio;
    }

    public void setNumeroDomicilio(Integer numeroDomicilio) {
        this.numeroDomicilio = numeroDomicilio;
    }

    
    

}
