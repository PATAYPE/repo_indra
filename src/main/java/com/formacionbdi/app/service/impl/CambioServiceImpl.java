package com.formacionbdi.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.app.dao.ICambioDao;
import com.formacionbdi.app.entity.Cambio;
import com.formacionbdi.app.service.ICambioService;

@Service
public class CambioServiceImpl implements ICambioService{

	@Autowired
	private ICambioDao dao;
	
	@Override
	public List<Cambio> listar() {
		return (List<Cambio>) dao.findAll();
	}


	@Override
	public Cambio registrarCambio(Cambio cambio) {
		
		return dao.save(cambio);
	}

	
	
}
