package com.cafetero.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DetalleTostadaDTO implements Serializable{

	public DetalleTostadaDTO(String idProducto, String descripcion,
			String cantidad) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}

	private String idProducto;
	
	private String descripcion;
	
	private String cantidad;

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}


	
}
