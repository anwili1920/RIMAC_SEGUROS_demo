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
    

}
