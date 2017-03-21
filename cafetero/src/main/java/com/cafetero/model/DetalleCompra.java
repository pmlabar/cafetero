package com.cafetero.model;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class DetalleCompra implements Serializable {
	
	@Id
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="compra"))
    private Integer idCompra;
    
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idProducto")
	private Producto producto;
	
	private Double cantidad;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCompra", insertable= false, nullable= false, unique = true, updatable = false)
	private Compra compra;

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
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

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	
}
