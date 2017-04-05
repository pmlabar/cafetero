package com.cafetero.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cafetero.dto.DetalleTostadaDTO;
import com.cafetero.model.Producto;
import com.cafetero.service.ProductoService;
import com.cafetero.service.TostadaService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Controller
public class TostadaController {

	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private TostadaService tostadaService;

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
	
	@RequestMapping(value="/altaTostada", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void registrarTostada(HttpServletRequest request, 
			@RequestParam(required= false, value="fechaTostada") String fechaTostada,
			@RequestParam(required= false, value="totalNeto") Double totalNeto,
			@RequestParam(required= false, value="idProducto") Integer idProducto,
			@RequestParam(required= false, value="listaCrudos") String listaCrudos) throws ParseException {
//			@RequestParam(required= false, value="listaCrudos") DetalleTostadaDTO[] lista){
   	    
		Gson gson = new Gson();
		List<DetalleTostadaDTO> listaMP = gson.fromJson(listaCrudos, new TypeToken<List<DetalleTostadaDTO>>(){}.getType());
		//list.forEach(x -> System.out.println(x.getDescripcion()));
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha = formatter.parse(fechaTostada);
		tostadaService.altaTostada(fecha, totalNeto, idProducto, listaMP);
		
	}
}
