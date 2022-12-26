package com.ibmloginrimac.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "PagosRealizados")
public class PagosRealizados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Pago")
    private Long id;
}
