package com.cafetero.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafetero.model.Producto;
import com.cafetero.service.ProductoService;

@Controller
public class TostadaController {

	@Autowired
	private ProductoService productoService;

	@RequestMapping(value = "/listaTiposCafeTostado", method = RequestMethod.GET)
    @ResponseBody
    public List<Producto> tiposCafeTostado(HttpServletResponse response) {
		List<Producto> tiposCafe = new ArrayList<Producto>();
		tiposCafe = this.productoService.getTiposCafeTostado();
		return tiposCafe;
    }
	
	@RequestMapping(value = "/listaTiposCafeCrudo", method = RequestMethod.GET)
    @ResponseBody
    public List<Producto> tiposCafeCrudo(HttpServletResponse response) {
		List<Producto> tiposCafe = new ArrayList<Producto>();
		tiposCafe = this.productoService.getTiposCafeTostado();
		return tiposCafe;
    }
}
