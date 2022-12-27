package com.ibmloginrimac.demo.model;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "Contrato")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Contrato")
    private Long id;
    
    @OneToOne
	@JoinColumn(name = "Fid_Empleado", insertable = false , updatable = false)
    private Empleado empleado;
    
    @OneToOne
	@JoinColumn(name = "Fid_Sueldo", insertable = false , updatable = false)
    private Sueldos sueldo;

    @OneToOne
	@JoinColumn(name = "Fid_Horas_Diarias", insertable = false , updatable = false)
    private HorasDiarias horasDiarias;
    
    @Column(name="Numero_Contrato")
    private Integer numeroContrato;

    @Column(name = "Fecha_Ini_Contrato")
    private LocalDate fechaIniContrato;

    @Column(name = "Fecha_Fin_Contrato")
    private LocalDate fechaFinContrato;
    
    public Contrato(){

    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Sueldos getSueldo() {
        return sueldo;
    }

    public void setSueldo(Sueldos sueldo) {
        this.sueldo = sueldo;
    }

    public HorasDiarias getHorasDiarias() {
        return horasDiarias;
    }

    public void setHorasDiarias(HorasDiarias horasDiarias) {
        this.horasDiarias = horasDiarias;
    }

    public Integer getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public LocalDate getFechaIniContrato() {
        return fechaIniContrato;
    }

    public void setFechaIniContrato(LocalDate fechaIniContrato) {
        this.fechaIniContrato = fechaIniContrato;
    }

    public LocalDate getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(LocalDate fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    
}
