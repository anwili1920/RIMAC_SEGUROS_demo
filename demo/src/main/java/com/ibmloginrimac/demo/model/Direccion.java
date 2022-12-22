package com.ibmloginrimac.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Direccion")
    private Long id;

	@ManyToOne
	@JoinColumn(name = "Fid_Distrito")
	private Distrito distrito;

	@ManyToOne
	@JoinColumn(name = "Fid_Departamento")
	private Departamento departamento;

    @Column(name="Detalle")
    private String detalle;

    @Column(name="Numero_Domicilio")
    private Integer numeroDomicilio;

    public Direccion() {
    }
    

}
