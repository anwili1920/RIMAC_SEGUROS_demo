package com.ibmloginrimac.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "PlanCuotas")
public class PlanCuotas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_PlanCuotas")
    private Long id;
}
