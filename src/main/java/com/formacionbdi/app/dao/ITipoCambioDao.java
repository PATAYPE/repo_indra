package com.formacionbdi.app.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.app.entity.TipoCambio;

public interface ITipoCambioDao extends CrudRepository<TipoCambio, Integer> {

	// definir propio metodo
	@Query("select u from TipoCambio u where u.monedaOrigen = ?1 and u.monedaDestino =?2")
	public TipoCambio findByTipoCambioOrigenAndDestino(String monedaOrigen, String monedaDestino);
	
}
