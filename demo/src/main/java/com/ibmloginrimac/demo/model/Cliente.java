package com.ibmloginrimac.demo.model;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Cliente")
@Getter @Setter @NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Cliente")
    private Long id;

    @OneToOne
	@JoinColumn(name = "Fid_Persona", insertable = false , updatable = false)
    private Persona persona;

    @OneToOne
	@JoinColumn(name = "Fid_Empresa", insertable = false , updatable = false)
    private Empresa empresa;

    @OneToMany(mappedBy = "cliente")
    private List<Auto> autos;

}
