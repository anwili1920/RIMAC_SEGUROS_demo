package com.ibmloginrimac.demo.model;
import java.util.List;

import jakarta.persistence.*; 
@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Persona")
    private Long id;
    @Column(name="DNI",nullable = false)
    private Integer DNI;
    @Column(name="Nombre1")
    private String nombre1;
    @Column(name="Nombre2")
    private String nombre2;
    @Column(name="Appellido1")
    private String apellido1;
    @Column(name="Appellido2")
    private String apellido2;
    @Column(name="Edad",nullable = false)
    private Integer edad;
    @Column(name="RUC",nullable = false)
    private Integer RUC;
    

    @OneToOne(mappedBy = "persona")
    @JoinColumn(name="Fid_direccion", insertable = false, updatable = false)
    private Direccion direccion;
    
    @Column(name="Activo")
    private boolean activo=true;

    @OneToMany(mappedBy = "persona")
    @JoinColumn(name = "Fid_Familiar", insertable = false , updatable = false)
    private List<Familiar> familiares;
    
    public Persona() {
    
    }
    
}
