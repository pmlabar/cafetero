package com.cafetero.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafetero.dto.DetalleTostadaDTO;
import com.cafetero.dto.DetalleTostadaDTOList;
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
	
	@RequestMapping(value="/altaTostada", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void registrarTostada(HttpServletRequest request, 
			@RequestParam(required= false, value="fechaTostada") String fechaTostada,
			@RequestParam(required= false, value="totalNeto") Double totalNeto,
			@RequestParam(required= false, value="idProducto") Integer idProducto,
			@RequestBody DetalleTostadaDTO[] listaCrudos) {
//			@RequestParam(required= false, value="listaCrudos") DetalleTostadaDTO[] lista){
		System.out.println("test");
		List<DetalleTostadaDTO> list = new ArrayList<>();
//		if (listaCrudos!= null) { 
//		  int len = listaCrudos.length;
//		  for (int i=0; i<len; i++) { 
//		    JSONObject o = (JSONObject) listaCrudos[i];
//		    try {
//				list.add(new DetalleTostadaDTO(o.getString("idProducto"), 
//						o.getString("descripcion"), o.getString("cantidad")));
//			} catch (JSONException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		  } 
//		} 
//		for (int i = 0; i < lista.length; i++) {
//			String[] lista2 = lista[i];
//			for (int j = 0; j < lista2.length; j++) {
//				System.out.println(lista2[j]);
//			}
//		}
		
	}
}
