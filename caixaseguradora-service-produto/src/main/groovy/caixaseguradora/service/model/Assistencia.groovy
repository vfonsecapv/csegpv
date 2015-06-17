package caixaseguradora.service.model

import groovy.transform.ToString

import com.fasterxml.jackson.annotation.*

@ToString
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
class Assistencia {
	String nome
	String id

	def getNome() { nome }
	def getId() { id }
}