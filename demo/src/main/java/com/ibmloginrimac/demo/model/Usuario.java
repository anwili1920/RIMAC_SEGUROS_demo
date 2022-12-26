package com.ibmloginrimac.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Usuario")
    private Long id;
    public Usuario() {
        
    }

}
