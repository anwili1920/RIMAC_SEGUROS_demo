package com.ibmloginrimac.demo.model;
import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "PlanDePagos")
public class PlanDePagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Plan")
    private Long id;

    @OneToOne
    @JoinColumn(name="Fid_Seguro",insertable=false,updatable=false)
    private Seguro seguro;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Monto")
    private  BigDecimal monto;

    @OneToMany(mappedBy = "plan")
    private List<PlanCuotas> planCuotas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public List<PlanCuotas> getPlanCuotas() {
        return planCuotas;
    }

    public void setPlanCuotas(List<PlanCuotas> planCuotas) {
        this.planCuotas = planCuotas;
    }

    public PlanDePagos(Long id, Seguro seguro, String nombre, BigDecimal monto, List<PlanCuotas> planCuotas) {
        this.id = id;
        this.seguro = seguro;
        this.nombre = nombre;
        this.monto = monto;
        this.planCuotas = planCuotas;
    }

}
