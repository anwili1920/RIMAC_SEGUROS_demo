package com.ibmloginrimac.demo.model;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Documento")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Documento")
    private Long id;

    @OneToMany(mappedBy = "documento")
    private List<Tramite> tramites;
    
    @Column(name = "Fecha_Creacion")
    private LocalDate fechaCreacion;

    @Column(name="Descripcion")
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name="Autor",insertable = false,updatable = false)
    private Empleado empleado;

    public Documento(){
        
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public List<Tramite> getTramites() {
        return tramites;
    }
    public void setTramites(List<Tramite> tramites) {
        this.tramites = tramites;
    }
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

}
