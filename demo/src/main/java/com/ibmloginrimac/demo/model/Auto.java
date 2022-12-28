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
    
}
