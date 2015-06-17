package caixaseguradora.service.model

import groovy.transform.ToString

import com.fasterxml.jackson.annotation.*

@ToString
class Produto {
	@JsonProperty("assistencias")
	Assistencia[] assistencias

	@JsonProperty("coberturas")
	Cobertura[] coberturas

	@JsonProperty("itensSegurados")
	ItemSegurado[] itensSegurados

	String nome
	String id
}