package com.ibmloginrimac.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "TipoSeguro")
public class TipoSeguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_TipoSeguro")
    private Long id;
}
