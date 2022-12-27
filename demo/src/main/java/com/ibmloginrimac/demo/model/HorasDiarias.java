package com.ibmloginrimac.demo.model;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "Horas_Diarias")
public class HorasDiarias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Horas")
    private Long id;

    @Column(name="Cant_Horas")
    private Integer cantHoras;

    @Column(name="Hora_Inicio")
    private LocalTime horaInicio;
    
    @Column(name="Hora_Fin")
    private LocalTime horaFin;

    

    public HorasDiarias() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(Integer cantHoras) {
        this.cantHoras = cantHoras;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }
    
}
