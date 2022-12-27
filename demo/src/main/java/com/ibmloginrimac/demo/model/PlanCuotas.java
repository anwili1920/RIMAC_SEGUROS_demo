package com.ibmloginrimac.demo.model;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "PlanCuotas")
public class PlanCuotas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_PlanCuotas")
    private Long id;

    @OneToMany(mappedBy = "planCuotas")
    private List<PagosRealizados> pagos;
    
    @ManyToOne
    @JoinColumn(name="Fid_Usuario",insertable = false,updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="Fid_Plan",insertable = false,updatable = false)
    private PlanDePagos plan;

    @Column(name="Cantidad_Cuotas")
    private Integer cantidadCuotas;

    @Column(name = "Fecha_Inicio")
    private LocalDate fechaInicio;
    @Column(name = "Fecha_Fin")
    private LocalDate fechaFin;

    @Column(name="Vigencia")
    private Boolean vigencia;

    public PlanCuotas(Long id, List<PagosRealizados> pagos, Usuario usuario, Integer cantidadCuotas,
            LocalDate fechaInicio, LocalDate fechaFin, Boolean vigencia) {
        this.id = id;
        this.pagos = pagos;
        this.usuario = usuario;
        this.cantidadCuotas = cantidadCuotas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.vigencia = vigencia;
    }

    public PlanCuotas() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PagosRealizados> getPagos() {
        return pagos;
    }

    public void setPagos(List<PagosRealizados> pagos) {
        this.pagos = pagos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(Boolean vigencia) {
        this.vigencia = vigencia;
    }


}
