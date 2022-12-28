package com.ibmloginrimac.demo.model;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "Tramite")
public class Tramite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Tramite")
    private Long id;

    @OneToOne
	@JoinColumn(name = "Fid_Empleado", insertable = false , updatable = false)
    private Empleado empleado;

    @OneToOne
    @JoinColumn(name="Fid_Usuario",insertable=false,updatable=false)
    private Usuario usuario;

    @Column(name = "Fecha_Tramite")
    private LocalDate fechaTramite;

    @Column(name="Descripcion")
	private String descripcion;
}
