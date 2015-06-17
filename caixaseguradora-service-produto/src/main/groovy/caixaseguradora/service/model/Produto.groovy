package caixaseguradora.service.model

import groovy.transform.ToString

import com.fasterxml.jackson.annotation.*

@ToString
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
class Produto {
	Assistencia[] assistencias
	Cobertura[] coberturas
	ItemSegurado[] itensSegurados

	String nome
	String id
}