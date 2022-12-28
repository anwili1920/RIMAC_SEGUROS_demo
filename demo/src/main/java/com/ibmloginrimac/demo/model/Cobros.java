package com.ibmloginrimac.demo.model;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Cobros")
@Setter @Getter @NoArgsConstructor
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
    
}
