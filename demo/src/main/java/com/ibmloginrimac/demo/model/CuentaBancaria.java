package com.ibmloginrimac.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "CuentaBancaria")
public class CuentaBancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_CuentaBancaria")
    private Long id;
    
    @OneToOne
    @JoinColumn(name="Fid_Usuario",insertable=false,updatable=false)
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name="Fid_Banco",insertable=false,updatable=false)
    private Banco banco;

    @Column(name="Codigo_Cuenta")
    private Integer codigoCuenta;

    @Column(name="Tipo_Cuenta")
    private String tipoCuenta;

    @Column(name = "Activo")
    private boolean activo;
    
    public CuentaBancaria(){

    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Integer getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(Integer codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    
}
