package com.ibmloginrimac.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "CuentaBancaria")
public class CuentaBancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_CuentaBancaria")
    private Long id;
    public CuentaBancaria(){

    }
}
