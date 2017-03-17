package com.cafetero.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Compra {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCompra;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="idCliente")
	private Cliente cliente;
	
	private Date fechaCompra;
	
	@OneToMany(fetch= FetchType.LAZY, mappedBy="compra")
	private List<DetalleCompra> items;

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public List<DetalleCompra> getItems() {
		return items;
	}

	public void setItems(List<DetalleCompra> items) {
		this.items = items;
	}
	
	
	
	
	
	
}
