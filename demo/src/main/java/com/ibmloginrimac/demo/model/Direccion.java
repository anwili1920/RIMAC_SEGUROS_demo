package com.ibmloginrimac.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Direccion")
@Setter @Getter @NoArgsConstructor
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Direccion")
    private Long id;

	@ManyToOne
	@JoinColumn(name = "Fid_Distrito", insertable = false , updatable = false)
	private Distrito distrito;

	@ManyToOne
	@JoinColumn(name = "Fid_Departamento", insertable = false , updatable = false)
	private Departamento departamento;

    @OneToOne
	@JoinColumn(name = "Fid_Persona", insertable = false , updatable = false)
	private Persona persona;
    
    @Column(name="Detalle")
    private String detalle;

    @Column(name="Numero_Domicilio")
    private Integer numeroDomicilio;

}
