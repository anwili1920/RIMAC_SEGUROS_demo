package com.ibmloginrimac.demo.model;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "Sueldos")
public class Sueldos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Sueldos")
    private Long id;

    @Column(name = "Monto")
    private  BigDecimal monto;

    @Column(name = "Fecha_Emision")
    private LocalDate fechaEmision;
    
    @OneToOne
    @JoinColumn(name="Fid_Contrato",insertable = false,updatable = false)
    private Contrato contrato;

    
}
