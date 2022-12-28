package com.ibmloginrimac.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Distrito")
@Setter @Getter @NoArgsConstructor
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
   
}
