package com.ibmloginrimac.demo.model;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "PlanDePagos")
public class PlanDePagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Plan")
    private Long id;
    @OneToMany(mappedBy = "plan")
    private List<PlanCuotas> planCuotas;
    

}
