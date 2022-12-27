package com.ibmloginrimac.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Auto")
    private Long id;

	@ManyToOne
	@JoinColumn(name = "Fid_Cliente", insertable = false , updatable = false)
    // no vamos a insertar ni actualizar ninguna fila en la tabla cliente
	private Cliente cliente;

    @Column(name="Marca")
    private String marca;

    @Column(name="Modelo")
    private String modelo;

    @Column(name="NumModelo")
    private Integer numero;

    @Column(name="Placa")
    private String placa;
    
    @Column(name="Anho_Fabricacion")
    private Integer anho;

    @Column(name="Color")
    private String color;

    public Auto(){

    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getAnho() {
        return anho;
    }

    public void setAnho(Integer anho) {
        this.anho = anho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    

    
}
