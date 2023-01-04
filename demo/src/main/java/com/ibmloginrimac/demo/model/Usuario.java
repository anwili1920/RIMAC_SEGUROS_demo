package com.ibmloginrimac.demo.model;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Usuario")
@Getter @Setter @NoArgsConstructor
public class Usuario {

    @Id
    @Column(name="Id_Usuario")
    private Long id;

    private String email; 

    private String password; 
    

}
