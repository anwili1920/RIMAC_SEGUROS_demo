package com.ibmloginrimac.demo.model;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Cliente")
    private Long id;

    @OneToOne
	@JoinColumn(name = "Fid_Persona", insertable = false , updatable = false)
    private Persona persona;

    @OneToOne
	@JoinColumn(name = "Fid_Empresa", insertable = false , updatable = false)
    private Empresa empresa;

    @OneToMany(mappedBy = "cliente")
    @JoinColumn(name = "Fid_auto", insertable = false , updatable = false)
    private List<Auto> autos;
    public Cliente(){
        
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public List<Auto> getAutos() {
        return autos;
    }
    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }
    
}
