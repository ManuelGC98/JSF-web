package com.codenotfound.primefaces;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class VistaImagenes {
	
	private List<String> imagenes;

	@PostConstruct
	public void init() {
		imagenes = new ArrayList<String>();
		for (int i = 1; i <= 4; i++) {
			imagenes.add("nature" + i + ".jpg");
		}
	}

	public List<String> getImagenes() {
		return imagenes;
	}
}
