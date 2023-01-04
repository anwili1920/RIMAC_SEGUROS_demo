package com.ibmloginrimac.demo.model;


 
import org.hibernate.annotations.Subselect;

import jakarta.persistence.Entity;
import jakarta.persistence.Id; 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Subselect("SELECT empleado.Id_Empleado, contrato.Numero_Contrato,persona.Nombre1, persona.Apellido1,sueldos.Monto FROM ADMIN_RIMAC.Empleado empleado, ADMIN_RIMAC.Sueldos sueldos, ADMIN_RIMAC.Persona  persona, ADMIN_RIMAC.Contrato  contrato WHERE persona.Id_Persona=empleado.Fid_Persona AND sueldos.Fid_Contrato=contrato.Id_Contrato AND empleado.Fid_Contrato=contrato.Id_Contrato AND contrato.Id_Contrato=sueldos.Fid_Contrato ORDER BY empleado.Id_Empleado;")
@Getter @Setter @NoArgsConstructor
public class View1 {
    @Id  
    private Long idEmpleado;
    private Integer numeroContrato; 
    private String nombre; 
    private String apellido;
    private float sueldo;
} 
