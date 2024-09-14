package com.formacionbdi.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.app.dao.ITipoCambioDao;
import com.formacionbdi.app.entity.TipoCambio;
import com.formacionbdi.app.service.ITipoCambioService;

@Service
public class TipoCambioServiceImpl implements ITipoCambioService{

	@Autowired
	private ITipoCambioDao dao;

	
	@Override
	public TipoCambio findByTipoCambioOrigenAndDestino(String monedaOrigen, String monedaDestino) {
		return dao.findByTipoCambioOrigenAndDestino(monedaOrigen, monedaDestino);
	}


	@Override
	public TipoCambio actualizarTipoCambio(TipoCambio tipoCambio) {
		return dao.save(tipoCambio);
	}


	@Override
	public List<TipoCambio> listarTipoCambio() {
		return (List<TipoCambio>) dao.findAll();
	}
	

	

}
