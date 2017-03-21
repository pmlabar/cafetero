package com.cafetero.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Tostada implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Date fechaTostada;
	
	@OneToMany(fetch= FetchType.LAZY)
	@JoinColumn(name="idTostada")
	private List<DetalleTostada> detalleTostada;
	
	private Double cantidadNeta;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idProducto")
	private Producto productoFinal;
	
	
	public Producto getProductoFinal() {
		return productoFinal;
	}

	public void setProductoFinal(Producto productoFinal) {
		this.productoFinal = productoFinal;
	}

	public Double getCantidadNeta() {
		return cantidadNeta;
	}

	public void setCantidadNeta(Double cantidadNeta) {
		this.cantidadNeta = cantidadNeta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaTostada() {
		return fechaTostada;
	}

	public void setFechaTostada(Date fechaTostada) {
		this.fechaTostada = fechaTostada;
	}

	public List<DetalleTostada> getDetalleTostada() {
		return detalleTostada;
	}

	public void setDetalleTostada(List<DetalleTostada> detalleTostada) {
		this.detalleTostada = detalleTostada;
	}
	
	
	
	
}
