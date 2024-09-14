package com.formacionbdi.app.service;

import java.util.List;

import com.formacionbdi.app.entity.Cambio;

public interface ICambioService {

	public List<Cambio> listar();
	
	public Cambio registrarCambio(Cambio cambio);
}
