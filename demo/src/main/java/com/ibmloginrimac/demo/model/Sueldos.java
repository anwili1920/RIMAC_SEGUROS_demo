package com.ibmloginrimac.demo.model;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Sueldos")
@Setter @Getter @NoArgsConstructor
public class Sueldos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Sueldos")
    private Long id;

    @Column(name = "Monto")
    private Double monto;

    @Column(name = "Fecha_Emision")
    private LocalDate fechaEmision;
   
    @Column(name = "Porcentaje_Bruto")
    private Double porcentajeBruto;

    @OneToOne
    @JoinColumn(name="Fid_Contrato",insertable = false,updatable = false)
    private Contrato contrato;

    
}
