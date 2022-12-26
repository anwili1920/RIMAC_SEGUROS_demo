package com.ibmloginrimac.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Banco")
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Banco")
    private Long id;
    @Column(name="Nombre")
    private String nombre;
    @Column(name = "Afiliacion")
    private boolean afiliacion;
    public Banco() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isAfiliacion() {
        return afiliacion;
    }
    public void setAfiliacion(boolean afiliacion) {
        this.afiliacion = afiliacion;
    }

}
