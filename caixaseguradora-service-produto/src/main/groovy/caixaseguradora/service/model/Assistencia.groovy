package caixaseguradora.service.model

import groovy.transform.ToString

@ToString
class Assistencia {
	String nome
	String id

	def getNome() { nome }
	def getId() { id }
}