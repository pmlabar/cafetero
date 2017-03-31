package com.cafetero.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DetalleTostadaDTOList implements Serializable{

	private List<DetalleTostadaDTO> detalleTostadaDTOList;

	public List<DetalleTostadaDTO> getDetalleTostadaDTOList() {
		return detalleTostadaDTOList;
	}

	public void setDetalleTostadaDTOList(
			List<DetalleTostadaDTO> detalleTostadaDTOList) {
		this.detalleTostadaDTOList = detalleTostadaDTOList;
	}
	
	
	
}
