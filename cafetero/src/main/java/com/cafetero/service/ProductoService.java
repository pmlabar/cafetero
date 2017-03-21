package com.cafetero.service;

import static com.cafetero.util.Constante.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafetero.model.Producto;
import com.cafetero.repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	public List<Producto> getTiposCafeTostado() {
		return this.productoRepository.getListaProductosPorTipo(TIPO_GRANO_TOSTADO);
	}
	
	public List<Producto> getTiposCafeCrudo() {
		return this.productoRepository.getListaProductosPorTipo(TIPO_GRANO_CRUDO);
	}

}
