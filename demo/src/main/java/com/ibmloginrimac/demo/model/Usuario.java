package com.ibmloginrimac.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USUARIO")
@Getter @Setter @NoArgsConstructor
public class Usuario {

    @Id
    @Column(name="ID_USUARIO")
    private Integer id;

    @Column(name="ID_PERSONA")
    private Integer idPersona;

    @Column(name="EMAIL")
    private String email;

    @Column(name="CONTRASEÑA")
    private String password; 
    
    @Column(name="TELEFONO")
    private Integer telefono; 
    
    @Column(name="TIPO_USUARIO")
    private String tipoUsuario; 
    
    @Column(name="ACTIVO")
    private Boolean activo; 
}
