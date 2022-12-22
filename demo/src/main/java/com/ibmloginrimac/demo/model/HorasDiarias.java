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
    
}