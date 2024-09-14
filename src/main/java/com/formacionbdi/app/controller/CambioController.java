package com.formacionbdi.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.app.entity.Cambio;
import com.formacionbdi.app.entity.TipoCambio;
import com.formacionbdi.app.service.ICambioService;
import com.formacionbdi.app.service.ITipoCambioService;

@RestController
@RequestMapping(value = "todocambio")
public class CambioController {

	@Autowired
	private ICambioService cambioService;
	
	@Autowired
	private ITipoCambioService tipoCambioService;
	
	@GetMapping("/listar")
	public List<Cambio> listar(){
		return cambioService.listar();
	}
	
	@PostMapping("/realizar-cambio")
	public Cambio realizarCambio(@RequestBody Cambio cambio) {
		
		TipoCambio tipoCambioBD = tipoCambioService.findByTipoCambioOrigenAndDestino(cambio.getMonedaOrigen(), cambio.getMonedaDestino());
		
		Cambio cambioResultante = new Cambio();
		cambioResultante.setMonto(cambio.getMonto());
		cambioResultante.setMonedaOrigen(cambio.getMonedaOrigen());
		cambioResultante.setMonedaDestino(cambio.getMonedaDestino());
		cambioResultante.setMontoCambio( cambio.getMonto() * tipoCambioBD.getValor() );
		cambioResultante.setTipoCambio(tipoCambioBD.getValor());
		cambioService.registrarCambio(cambioResultante);
		
		return cambioResultante;
	}
}
