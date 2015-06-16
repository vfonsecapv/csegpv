package caixaseguradora.service.model

import groovy.transform.CompileStatic

@CompileStatic
class Produto {
	List<Assistencia> assistencias = []
	List<Cobertura> coberturas = []
	List<ItemSegurado> itensSegurados = []

	String nome
	String id
}