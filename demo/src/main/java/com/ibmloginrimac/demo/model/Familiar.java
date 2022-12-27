package com.ibmloginrimac.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Familiar")
public class Familiar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Familiar")
    private Long id;

    @OneToOne
    @JoinColumn(name="Datos",insertable = false,updatable = false)
    private Persona datos; //ver si se va a insertar o no 

    @ManyToOne
    @JoinColumn(name="Cliente",insertable = false,updatable = false)
    private Cliente cliente; 

    @Column(name = "Relacion")
    private String relacion;

    
}
