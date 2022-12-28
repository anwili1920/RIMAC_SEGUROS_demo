package com.ibmloginrimac.demo.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Seguro")
@Setter @Getter @NoArgsConstructor
public class Seguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Seguro")
    private Long id;

    @OneToOne
    @JoinColumn(name="Fid_Plan",insertable=false,updatable=false)
    private PlanDePagos plan;

    @ManyToOne
    @JoinColumn(name="Fid_TipoSeguro",insertable=false,updatable=false)
    private TipoSeguro tipoSeguro;

    @Column(name="Nombre")
	private String nombre;

}
