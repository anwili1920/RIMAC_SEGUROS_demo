package com.ibmloginrimac.demo.model;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Contrato")
@Setter @Getter @NoArgsConstructor
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Contrato")
    private Long id;
    
    @ManyToOne
	@JoinColumn(name = "Fid_Empleado", insertable = false , updatable = false)
    private Empleado empleado;
    
    @ManyToOne
	@JoinColumn(name = "Fid_Sueldo", insertable = false , updatable = false)
    private Sueldos sueldo;

    @ManyToOne
	@JoinColumn(name = "Fid_Horas_Diarias", insertable = false , updatable = false)
    private HorasDiarias horasDiarias;
    
    @Column(name="Numero_Contrato")
    private Integer numeroContrato;

    @Column(name = "Fecha_Ini_Contrato")
    private LocalDate fechaIniContrato;

    @Column(name = "Fecha_Fin_Contrato")
    private LocalDate fechaFinContrato;
    
}
