package com.cafetero.model;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class DetalleTostada implements Serializable{

	@Id
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="tostada"))
    private Integer idTostada;
    
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idProducto")
	private Producto producto;
	
	private Double cantidad;

	public Integer getIdTostada() {
		return idTostada;
	}

	public void setIdTostada(Integer idTostada) {
		this.idTostada = idTostada;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	

}
