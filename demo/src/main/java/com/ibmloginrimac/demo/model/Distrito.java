package com.ibmloginrimac.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Distrito")
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Distrito")
    private Long id;

    @Column(name="Nombre")
    private String nombre;

	@ManyToOne
	@JoinColumn(name = "Fid_Departamento")
	private Departamento departamento;
    public  Distrito(){
        
    }
}
