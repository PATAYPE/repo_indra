package com.formacionbdi.app.entity;

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
@Table(name="tipo_cambio")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoCambio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="moneda_origen")
	private String monedaOrigen;
	
	@Column(name="moneda_destino")
	private String monedaDestino;
	
	private Double valor;
	
}
