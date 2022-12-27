package com.ibmloginrimac.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Seguro")
public class Seguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Seguro")
    private Long id;

    @OneToOne
    @JoinColumn(name="Fid_Plan",insertable=false,updatable=false)
    private PlanDePagos plan;

    @OneToOne
    @JoinColumn(name="Fid_TipoSeguro",insertable=false,updatable=false)
    private TipoSeguro tipoSeguro;

    @Column(name="Nombre")
	private String nombre;

    public Seguro(Long id, PlanDePagos plan, TipoSeguro tipoSeguro, String nombre) {
        this.id = id;
        this.plan = plan;
        this.tipoSeguro = tipoSeguro;
        this.nombre = nombre;
    }

    public Seguro() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PlanDePagos getPlan() {
        return plan;
    }

    public void setPlan(PlanDePagos plan) {
        this.plan = plan;
    }

    public TipoSeguro getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(TipoSeguro tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
