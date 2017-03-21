package com.cafetero.repository;

import java.util.List;

import com.cafetero.model.Producto;

public interface ProductoRepositoryCustom {

	public List<Producto> getListaProductosPorTipo(String descripcion);
}
