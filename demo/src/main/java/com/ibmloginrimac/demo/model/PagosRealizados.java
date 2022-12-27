package com.ibmloginrimac.demo.model;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "PagosRealizados")
public class PagosRealizados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Pago")
    private Long id;
    @ManyToOne
    @JoinColumn(name="Fid_PlanCuotas",insertable = false,updatable = false)
    private PlanCuotas planCuotas;
    @ManyToOne
    @JoinColumn(name="Fid_Usuario",insertable = false,updatable = false)
    private Usuario usuario;
    @Column(name = "Monto")
    private  BigDecimal monto;
    @Column(name = "Fecha_Emision")
    private LocalDate fechaEmision;
    @Column(name = "Fecha_Pago")
    private LocalDate fechaPago;
}
