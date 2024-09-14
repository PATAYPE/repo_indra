package com.formacionbdi.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.app.entity.TipoCambio;
import com.formacionbdi.app.service.ITipoCambioService;

@RestController
@RequestMapping(value = "todotipocambio")
public class TipoCambioController {

	@Autowired
	private ITipoCambioService service;
	
	@GetMapping("/tipoCambio/{monedaOrigen}/{monedaDestino}")
	public TipoCambio findTipoCambioById(@PathVariable(name="monedaOrigen") String monedaOrigen, @PathVariable(name="monedaDestino") String monedaDestino) {
		
		TipoCambio tipoCambio = service.findByTipoCambioOrigenAndDestino(monedaOrigen, monedaDestino);
		
		return tipoCambio;
	}
	
	@PutMapping("/actualizar/tipocambio")
	public TipoCambio modificarTipoCambio(@RequestBody TipoCambio tipoCambio) {
		TipoCambio nuevoTipoCambio = service.actualizarTipoCambio(tipoCambio);
		return nuevoTipoCambio;
	}
	
	@GetMapping("/listar/tipocambio")
	public List<TipoCambio> listarTipoCambio(){
		return service.listarTipoCambio();
	}
}
