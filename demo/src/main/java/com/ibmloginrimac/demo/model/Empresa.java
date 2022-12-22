package com.ibmloginrimac.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Empresa")
    private Long id;

    @Column(name="RUC")
    private Long RUC;

    @Column(name="Nombre")
	private String nombre;

    public Empresa() {
    }
    
}
