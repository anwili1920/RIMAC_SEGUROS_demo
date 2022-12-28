package com.ibmloginrimac.demo.model;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Documento")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Documento")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Fid_Tramite")
    private Tramite tramite;
    
    @Column(name = "Fecha_Creacion")
    private LocalDate fechaCreacion;

    @Column(name="Descripcion")
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name="Autor",insertable = false,updatable = false)
    private Empleado empleado;

}
