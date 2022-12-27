package com.ibmloginrimac.demo.model;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Usuario")
    private Long id;

    @OneToMany(mappedBy = "usuario")
    private List<PlanCuotas> planCuotas;
    
    public Usuario() {
        
    }

}
