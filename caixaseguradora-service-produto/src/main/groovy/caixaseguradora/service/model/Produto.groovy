package caixaseguradora.service.model

class Produto {
	List<Assistencia> assistencias = []
	List<Cobertura> coberturas = []
	List<ItemSegurado> itensSegurados = []

	String nome
	String id
}