package com.ibmloginrimac.demo.model;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Siniestro")
@Setter @Getter @NoArgsConstructor
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
}
