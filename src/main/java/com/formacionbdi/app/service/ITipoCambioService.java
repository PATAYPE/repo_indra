package com.formacionbdi.app.service;

import java.util.List;

import com.formacionbdi.app.entity.TipoCambio;

public interface ITipoCambioService {

	public TipoCambio findByTipoCambioOrigenAndDestino(String monedaOrigen, String monedaDestino);

	public TipoCambio actualizarTipoCambio(TipoCambio tipoCambio);
	
	public List<TipoCambio> listarTipoCambio();
	
}
