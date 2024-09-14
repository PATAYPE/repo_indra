package com.formacionbdi.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cambios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cambio implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Double monto;
	
	@Column(name="monto_cambio")
	private Double montoCambio;
	
	@Column(name="moneda_origen")
	private String monedaOrigen;
	
	@Column(name="moneda_destino")
	private String monedaDestino;
	
	@Column(name="tipo_cambio")
	private Double tipoCambio;
	
}
