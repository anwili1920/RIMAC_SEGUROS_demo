package com.ibmloginrimac.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "TipoSeguro")
public class TipoSeguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_TipoSeguro")
    private Long id;

    @Column(name="Nombre")
	private String nombre;

    public TipoSeguro(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public TipoSeguro() {
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
}
