package com.ibmloginrimac.demo.model;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Empleado")
    private Long id;

    @Column(name="Codigo")
    private Integer codigo;
    @OneToOne
    @JoinColumn(name="Fid_Contrato",insertable = false,updatable = false)
    private Contrato contrato;

    @OneToOne
	@JoinColumn(name = "Fid_Persona", insertable = false , updatable = false)
    private Persona persona;

    @OneToMany(mappedBy = "autor")
	private List<Documento> documentos;

    public Empleado() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    



}
