package com.cafetero.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafetero.dto.DetalleTostadaDTO;
import com.cafetero.model.DetalleTostada;
import com.cafetero.model.Producto;
import com.cafetero.model.Tostada;
import com.cafetero.repository.ProductoRepository;
import com.cafetero.repository.TostadaRepository;

@Service
public class TostadaService {

	@Autowired
	private TostadaRepository tostadaRepository;
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public void altaTostada(Date fecha, Double totalNeto, Integer idProducto,
			List<DetalleTostadaDTO> listaMP) {
		
//		List<DetalleTostadaDTO> resultado = listaMP.stream()               
//                .filter(x -> !x.getCantidad().equals("0"))     
//                .collect(Collectors.toList());
		
		DetalleTostada detalle;
		Producto producto;
		
		Tostada tostada = new Tostada();
		tostada.setCantidadNeta(totalNeto);
		tostada.setFechaTostada(fecha);
		producto = productoRepository.getOne(idProducto);
		tostada.setProductoFinal(producto);
		List<DetalleTostada> detalleTostada = new ArrayList<DetalleTostada>();
		for (DetalleTostadaDTO detalleDTO : listaMP) {
			if (!detalleDTO.getCantidad().equals("0")){
				detalle = new DetalleTostada();
				detalle.setCantidad(Double.parseDouble(detalleDTO.getCantidad()));
				producto = productoRepository.getOne(Integer.parseInt(detalleDTO.getIdProducto()));
				detalle.setProducto(producto);
				detalleTostada.add(detalle);
			}
		}
		
		tostada.setDetalleTostada(detalleTostada);
		tostadaRepository.save(tostada);
		
	}

}
